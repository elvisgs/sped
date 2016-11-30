package br.com.gep.sped.batch.common;

import br.com.gep.sped.batch.common.config.InfrastructureConfig;
import br.com.gep.sped.batch.common.jdbc.dao.EstabelecimentoDao;
import br.com.gep.sped.batch.common.jdbc.dao.SpedExecutionDao;
import br.com.gep.sped.batch.common.jdbc.entity.Estabelecimento;
import br.com.gep.sped.batch.common.jdbc.entity.Layout;
import br.com.gep.sped.batch.common.jdbc.entity.SpedExecution;
import br.com.gep.sped.batch.common.support.DefaultFileNameStrategy;
import br.com.gep.sped.batch.common.support.FileNameStrategy;
import lombok.NonNull;
import lombok.Setter;
import lombok.experimental.Accessors;
import lombok.extern.apachecommons.CommonsLog;
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

@CommonsLog
@Accessors(chain = true)
public abstract class SpedLauncher {

    protected AnnotationConfigApplicationContext context;
    protected EstabelecimentoDao estabelecimentoDao;
    protected SpedExecutionDao spedExecutionDao;
    protected @Setter InfrastructureConfig infrastructureConfig;
    protected JobLauncher jobLauncher;
    private boolean initialized = false;

    protected @Setter String schema;
    protected @Setter boolean compressFile = true;
    protected @Setter boolean deleteFileAfterCompression = true;
    private @NonNull @Setter String destinationDir = ".";
    private @Setter FileNameStrategy fileNameStrategy;

    protected SpedExecution doRun(String outputFilePath, Estabelecimento estabelecimento, JobParameters jobParameters)
            throws JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException,
            JobParametersInvalidException {

        Job spedJob = context.getBean(Job.class);
        JobExecution jobExecution = jobLauncher.run(spedJob, jobParameters);

        return createSpedExecution(outputFilePath, estabelecimento, jobExecution);
    }

    protected void validateDestinationDir() {
        Assert.state(new File(destinationDir).isDirectory(), "destinationDir não é um diretório válido");
    }

    protected String buildOutputFilePath(Estabelecimento estabelecimento) {
        validateDestinationDir();

        String fileName = fileNameStrategy.build(estabelecimento);
        String outputFilePath = new File(destinationDir, fileName).getAbsolutePath();

        log.info("Caminho do arquivo de saída gerado automaticamente [" + outputFilePath + "]");

        return outputFilePath;
    }

    private SpedExecution createSpedExecution(String outputFilePath, Estabelecimento estabelecimento,
                                              JobExecution jobExecution) {

        SpedExecution spedExecution = SpedExecution.from(estabelecimento)
            .setArquivo(outputFilePath)
            .setLayout(getLayout())
            .setJobExecution(jobExecution);

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
            SpedLauncher.class.getPackage().getName());
        context.refresh();
        context.registerShutdownHook();

        jobLauncher = context.getBean(JobLauncher.class);
        estabelecimentoDao = context.getBean(EstabelecimentoDao.class);
        spedExecutionDao = context.getBean(SpedExecutionDao.class);

        if (fileNameStrategy == null)
            fileNameStrategy = new DefaultFileNameStrategy();

        initialized = true;
    }

    protected abstract String getPackageToScan();

    protected abstract Layout getLayout();

    public void shutdown() {
        context.close();
    }
}
