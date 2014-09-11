package br.com.gep.sped.contrib.batch;

import br.com.gep.sped.contrib.batch.jdbc.dao.Reg0000Dao;
import br.com.gep.sped.contrib.batch.jdbc.dao.SpedExecutionDao;
import br.com.gep.sped.contrib.batch.jdbc.entity.SpedExecution;
import br.com.gep.sped.contrib.marshaller.registros.bloco0.Reg0000;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.util.Assert;

import javax.annotation.PostConstruct;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SpedContribLauncher {

    private static final Log logger = LogFactory.getLog(SpedContribLauncher.class);

    private ConfigurableApplicationContext ctx;
    private JobLauncher jobLauncher;
    private Reg0000Dao reg0000Dao;
    private SpedExecutionDao spedExecutionDao;
    private String schema;
    private String destinationDir = "";
    private boolean initialized = false;

    @PostConstruct
    public void initialize() {
        if (initialized) return;

        ctx = new AnnotationConfigApplicationContext(SpedContribLauncher.class.getPackage().getName());
        ctx.registerShutdownHook();

        jobLauncher = ctx.getBean(JobLauncher.class);
        reg0000Dao = ctx.getBean(Reg0000Dao.class);
        spedExecutionDao = ctx.getBean(SpedExecutionDao.class);

        initialized = true;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }

    public void setDestinationDir(String destinationDir) {
        Assert.notNull(destinationDir, "destinationDir não deve ser nulo");
        this.destinationDir = destinationDir;
    }

    /**
     * Executa o job assincronamente
     * @param outputFilePath Caminho do arquivo a ser gerado
     * @return Informações de execução do job, que podem ser usadas posteriormente para consultar
     * o status da execução por meio do JobExplorer
     */
    public SpedExecution run(String outputFilePath)
            throws JobParametersInvalidException, JobExecutionAlreadyRunningException,
            JobRestartException, JobInstanceAlreadyCompleteException {
        reg0000Dao.setSchema(schema);
        Reg0000 reg0000 = reg0000Dao.getUnique();

        validateDestinationDir();

        if (outputFilePath == null || "".equals(outputFilePath.trim())) {
            outputFilePath = buildOutputFilePath(reg0000);
        }

        JobParametersBuilder parametersBuilder = new JobParametersBuilder()
                .addString("output.file.name", outputFilePath);

        if (schema != null && !"".equals(schema))
            parametersBuilder.addString("current.schema", schema);

        Job spedContribJob = ctx.getBean(Job.class);

        JobExecution jobExecution = jobLauncher.run(spedContribJob, parametersBuilder.toJobParameters());

        return createSpedExecution(outputFilePath, reg0000, jobExecution);
    }

    private void validateDestinationDir() {
        Assert.notNull(destinationDir, "destinationDir não deve ser nulo");
        if (!"".equals(destinationDir)) {
            Assert.state(new File(destinationDir).isDirectory(), "destinationDir inválido");
        }
    }

    private String buildOutputFilePath(Reg0000 reg0000) {
        String outputFilePath;
        String fileName = buildFileName(reg0000);
        outputFilePath = new File(destinationDir, fileName).getAbsolutePath();
        logger.info("Caminho do arquivo de saida gerado automaticamente [" + outputFilePath + "].");
        return outputFilePath;
    }

    private String buildFileName(Reg0000 reg0000) {
        String outputFilePath;SimpleDateFormat sdf = new SimpleDateFormat("yyyy_MM");
        outputFilePath = String.format("%s_%s.txt",
                reg0000.getCnpj(), sdf.format(reg0000.getDtIni()));
        return outputFilePath;
    }

    private SpedExecution createSpedExecution(String outputFilePath, Reg0000 reg0000, JobExecution jobExecution) {
        SpedExecution spedExecution = new SpedExecution();
        spedExecution.setCnpj(reg0000.getCnpj());
        spedExecution.setNome(reg0000.getNome());

        Calendar cal = Calendar.getInstance();
        cal.setTime(reg0000.getDtIni());
        spedExecution.setAno(cal.get(Calendar.YEAR));
        spedExecution.setMes(cal.get(Calendar.MONTH + 1));

        spedExecution.setArquivo(outputFilePath);
        spedExecution.setJobExecution(jobExecution);

        spedExecutionDao.create(spedExecution);

        return spedExecution;
    }

    /**
     * Executa o job assincronamente. O arquivo de saída será definido automaticamente
     * com base no destinationDir e informações obtidas do BD do SPED (CNPJ, ano, mês).
     * @return Informações de execução do job, que podem ser usadas posteriormente para consultar
     * o status da execução por meio do JobExplorer
     */
    public SpedExecution run() throws JobParametersInvalidException, JobExecutionAlreadyRunningException,
            JobRestartException, JobInstanceAlreadyCompleteException {
        return run(null);
    }

    public void shutdown() {
        ctx.close();
    }
}
