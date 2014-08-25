package br.com.gep.sped.contrib.batch;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.util.Assert;

import javax.annotation.PostConstruct;

public class SpedContribLauncher {

    private ApplicationContext ctx;
    private JobLauncher jobLauncher;
    private Job spedContribJob;
    private String schema;
    private boolean initialized = false;

    @PostConstruct
    public void initialize() {
        if (initialized) return;

        ctx = new AnnotationConfigApplicationContext(SpedContribLauncher.class.getPackage().getName());
        jobLauncher = ctx.getBean(JobLauncher.class);
        spedContribJob = ctx.getBean(Job.class);

        initialized = true;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }

    /**
     * Executa o job assincronamente
     * @param outputFilePath Caminho do arquivo a ser gerado
     * @return Informações de execução do job, que podem ser usadas posteriormente para consultar
     * o status da execução por meio do JobExplorer
     */
    public JobExecution run(String outputFilePath) throws JobParametersInvalidException, JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {
        Assert.hasText(outputFilePath, "outputFilePath must be not null or empty");

        JobParametersBuilder parametersBuilder = new JobParametersBuilder()
                .addString("output.file.name", outputFilePath);

        if (schema != null && !"".equals(schema))
            parametersBuilder.addString("current.schema", schema);

        return jobLauncher.run(spedContribJob, parametersBuilder.toJobParameters());
    }
}
