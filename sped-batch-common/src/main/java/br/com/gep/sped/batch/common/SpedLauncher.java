package br.com.gep.sped.batch.common;

import br.com.gep.sped.batch.common.config.InfrastructureConfig;
import br.com.gep.sped.batch.common.jdbc.dao.EstabelecimentoDao;
import br.com.gep.sped.batch.common.jdbc.dao.SpedExecutionDao;
import br.com.gep.sped.batch.common.jdbc.entity.Estabelecimento;
import br.com.gep.sped.batch.common.jdbc.entity.SpedExecution;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
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

public abstract class SpedLauncher {

    protected static final Log logger = LogFactory.getLog(SpedLauncher.class);

    private AnnotationConfigApplicationContext context;
    protected EstabelecimentoDao estabelecimentoDao;
    private SpedExecutionDao spedExecutionDao;
    private InfrastructureConfig infrastructureConfig;
    private JobLauncher jobLauncher;
    private boolean initialized = false;

    protected String schema;
    protected boolean compressFile = true;
    protected boolean deleteFileAfterCompression = true;
    private String destinationDir = "";

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

    protected SpedExecution doRun(String outputFilePath, Estabelecimento estabelecimento, JobParameters jobParameters)
            throws JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException,
            JobParametersInvalidException {
        Job spedJob = context.getBean(Job.class);

        JobExecution jobExecution = jobLauncher.run(spedJob, jobParameters);

        return createSpedExecution(outputFilePath, estabelecimento, jobExecution);
    }

    protected void validateDestinationDir() {
        Assert.notNull(destinationDir, "destinationDir não deve ser nulo");
        if (!"".equals(destinationDir)) {
            Assert.state(new File(destinationDir).isDirectory(), "destinationDir inválido");
        }
    }

    protected String buildOutputFilePath(Estabelecimento estabelecimento, String suffix) {
        validateDestinationDir();

        String fileName = buildFileName(estabelecimento, suffix);
        String outputFilePath = new File(destinationDir, fileName).getAbsolutePath();

        logger.info("Caminho do arquivo de saida gerado automaticamente [" + outputFilePath + "].");

        return outputFilePath;
    }

    private String buildFileName(Estabelecimento estabelecimento, String suffix) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy_MM");
        String outputFilePath = String.format("%s_%s_%s.txt",
                estabelecimento.getCnpj(),
                sdf.format(estabelecimento.getDtIni()),
                suffix);
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

    @PostConstruct
    public void initialize() {
        if (initialized) return;
        context = new AnnotationConfigApplicationContext();

        Assert.notNull(infrastructureConfig, "infrastructureConfig não deve ser nula");
        context.getBeanFactory()
                .registerSingleton("infrastructureConfig", infrastructureConfig);

        context.scan(
                getPackageToScan(),
                RegCounter.class.getPackage().getName());
        context.refresh();
        context.registerShutdownHook();

        jobLauncher = context.getBean(JobLauncher.class);
        estabelecimentoDao = context.getBean(EstabelecimentoDao.class);
        spedExecutionDao = context.getBean(SpedExecutionDao.class);

        initialized = true;
    }

    protected abstract String getPackageToScan();

    public void shutdown() {
        context.close();
    }
}
