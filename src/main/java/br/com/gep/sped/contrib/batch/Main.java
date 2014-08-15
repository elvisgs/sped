package br.com.gep.sped.contrib.batch;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.File;

public class Main {

    public static void main(String[] args) throws Exception {
        new Main().run();
    }

    public void run() throws Exception {
        /*CommandLineJobRunner.main(new String[] {
                "br.com.gep.sped.contrib.batch.config.SpedContribJobConfig",
                "spedContribJob",
                "output.file.name=./sped_contrib.txt"
        });*/

        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        JobLauncher jobLauncher = ctx.getBean(JobLauncher.class);
        Job spedContribJob = ctx.getBean(Job.class);

        try {
            String outputFileName = "sped_contrib.txt";
            File file = new File(outputFileName);
            if (file.exists()) file.delete();

            JobParameters parameters = new JobParametersBuilder()
                    .addString("output.file.name", outputFileName)
                    .toJobParameters();

            JobExecution execution = jobLauncher.run(spedContribJob, parameters);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
