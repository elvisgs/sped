package br.com.gep.sped.batch.common.config;

import com.zaxxer.hikari.HikariDataSource;
import lombok.Setter;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.util.Assert;

import javax.sql.DataSource;
import java.io.Closeable;

import static org.springframework.util.StringUtils.hasText;

public class SimpleInfrastructureConfig implements InfrastructureConfig, InitializingBean {

    private @Setter DataSource dataSource;
    private @Setter TaskExecutor taskExecutor;
    private @Setter String driverClassName, url, username, password;
    private @Setter int corePoolSize = 5, maxPoolSize = 10, queueCapacity = 25;
    private Thread shutdownHook;

    @Override
    public DataSource getDataSource() {
        if (dataSource != null) return dataSource;

        dataSource = createDataSource();

        return dataSource;
    }

    private HikariDataSource createDataSource() {
        HikariDataSource dataSource = new HikariDataSource();
        dataSource.setDriverClassName(driverClassName);
        dataSource.setJdbcUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);

        return dataSource;
    }

    @Override
    public TaskExecutor getTaskExecutor() {
        if (taskExecutor != null) return taskExecutor;

        taskExecutor = createTaskExecutor();

        return taskExecutor;
    }

    private ThreadPoolTaskExecutor createTaskExecutor() {
        ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
        taskExecutor.setCorePoolSize(corePoolSize);
        taskExecutor.setMaxPoolSize(maxPoolSize);
        taskExecutor.setQueueCapacity(queueCapacity);
        taskExecutor.afterPropertiesSet();

        return taskExecutor;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        if (dataSource == null) {
            Assert.state(
                hasText(driverClassName) && hasText(url) && hasText(username),
                "DataSource ou propriedades de conexão deve(m) ser informado(as)"
            );
        }
    }

    public void shutdown() throws Exception {
        if (dataSource != null && dataSource instanceof Closeable) {
            ((Closeable)dataSource).close();
        }

        if (taskExecutor != null && taskExecutor instanceof DisposableBean) {
            ((DisposableBean)taskExecutor).destroy();
        }
    }

    public void registerShutdownHook() {
        if (shutdownHook == null) {
            shutdownHook = new Thread(() -> {
                try {
                    shutdown();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });

            Runtime.getRuntime().addShutdownHook(shutdownHook);
        }
    }
}
