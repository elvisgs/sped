package br.com.gep.sped.contrib.batch;

import br.com.gep.sped.batch.common.RegCounter;
import br.com.gep.sped.batch.common.SpedJobParameterBuilder;
import br.com.gep.sped.batch.common.config.InfrastructureConfig;
import br.com.gep.sped.batch.common.jdbc.dao.SpedExecutionDao;
import br.com.gep.sped.batch.common.jdbc.entity.SpedExecution;
import br.com.gep.sped.batch.common.jdbc.dao.EstabelecimentoDao;
import br.com.gep.sped.batch.common.jdbc.entity.Estabelecimento;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.util.Assert;

import javax.annotation.PostConstruct;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SpedContribLauncher {

    private static final Log logger = LogFactory.getLog(SpedContribLauncher.class);

    private AnnotationConfigApplicationContext batchCtx;

    private InfrastructureConfig infrastructureConfig;
    private JobLauncher jobLauncher;
    private EstabelecimentoDao estabelecimentoDao;
    private SpedExecutionDao spedExecutionDao;

    private String schema;
    private String destinationDir = "";
    private boolean compressFile = true;
    private boolean deleteFileAfterCompression = true;
    private boolean initialized = false;

    public void setInfrastructureConfig(InfrastructureConfig infrastructureConfig) {
        this.infrastructureConfig = infrastructureConfig;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }

    public void setDestinationDir(String destinationDir) {
        this.destinationDir = destinationDir;
    }

    public void setCompressFile(boolean compressFile) {
        this.compressFile = compressFile;
    }

    public void setDeleteFileAfterCompression(boolean deleteFileAfterCompression) {
        this.deleteFileAfterCompression = deleteFileAfterCompression;
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
        estabelecimentoDao.setSchema(schema);
        Estabelecimento estabelecimento = estabelecimentoDao.getPrimeiro();

        validateDestinationDir();

        if (outputFilePath == null || "".equals(outputFilePath.trim())) {
            outputFilePath = buildOutputFilePath(estabelecimento);
        }

        SpedJobParameterBuilder parametersBuilder = new SpedJobParameterBuilder()
                .setOutputFileName(outputFilePath)
                .setCompressFile(compressFile)
                .setDeleteFileAfterCompression(deleteFileAfterCompression);

        if (schema != null && !"".equals(schema))
            parametersBuilder.setCurrentSchema(schema);

        Job spedContribJob = batchCtx.getBean(Job.class);

        JobExecution jobExecution = jobLauncher.run(spedContribJob, parametersBuilder.toJobParameters());

        return createSpedExecution(outputFilePath, estabelecimento, jobExecution);
    }

    private void validateDestinationDir() {
        Assert.notNull(destinationDir, "destinationDir não deve ser nulo");
        if (!"".equals(destinationDir)) {
            Assert.state(new File(destinationDir).isDirectory(), "destinationDir inválido");
        }
    }

    private String buildOutputFilePath(Estabelecimento estabelecimento) {
        String outputFilePath;
        String fileName = buildFileName(estabelecimento);
        outputFilePath = new File(destinationDir, fileName).getAbsolutePath();
        logger.info("Caminho do arquivo de saida gerado automaticamente [" + outputFilePath + "].");
        return outputFilePath;
    }

    private String buildFileName(Estabelecimento estabelecimento) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy_MM");
        String outputFilePath = String.format("%s_%s_PIS.txt",
                estabelecimento.getCnpj(), sdf.format(estabelecimento.getDtIni()));
        return outputFilePath;
    }

    private SpedExecution createSpedExecution(String outputFilePath, Estabelecimento estabelecimento, JobExecution jobExecution) {
        SpedExecution spedExecution = new SpedExecution();
        spedExecution.setCnpj(estabelecimento.getCnpj());
        spedExecution.setNome(estabelecimento.getNome());

        Calendar cal = Calendar.getInstance();
        cal.setTime(estabelecimento.getDtIni());
        spedExecution.setAno(cal.get(Calendar.YEAR));
        spedExecution.setMes(cal.get(Calendar.MONTH) + 1);

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

    @PostConstruct
    public void initialize() {
        if (initialized) return;
        batchCtx = new AnnotationConfigApplicationContext();

        Assert.notNull(infrastructureConfig, "infrastructureConfig não deve ser nula");
        batchCtx.getBeanFactory()
                .registerSingleton("infrastructureConfig", infrastructureConfig);

        batchCtx.scan(
                SpedContribLauncher.class.getPackage().getName(),
                RegCounter.class.getPackage().getName());
        batchCtx.refresh();
        batchCtx.registerShutdownHook();

        jobLauncher = batchCtx.getBean(JobLauncher.class);
        estabelecimentoDao = batchCtx.getBean(EstabelecimentoDao.class);
        spedExecutionDao = batchCtx.getBean(SpedExecutionDao.class);

        initialized = true;
    }

    public void shutdown() {
        batchCtx.close();
    }
}
