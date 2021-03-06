package br.com.gep.sped.fiscal.batch;

import org.springframework.context.annotation.Bean;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

public class AsyncTestConfig extends TestConfig {

    @Override
    @Bean(name = "threadPoolTaskExecutor")
    public TaskExecutor getTaskExecutor() {
        ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
        taskExecutor.setCorePoolSize(4);
        taskExecutor.setMaxPoolSize(4);
        taskExecutor.afterPropertiesSet();
        return taskExecutor;
    }
}
