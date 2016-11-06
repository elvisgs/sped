package br.com.gep.sped.batch.common.config;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.util.Assert;

import javax.sql.DataSource;
import java.io.Closeable;

public class SimpleInfrastructureConfig implements InfrastructureConfig, InitializingBean {

    private DataSource dataSource;
    private TaskExecutor taskExecutor;
    private String driverClassName, url, username, password;
    private int corePoolSize = 5, maxPoolSize = 10, queueCapacity = 25;
    private Thread shutdownHook;

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setCorePoolSize(int corePoolSize) {
        this.corePoolSize = corePoolSize;
    }

    public void setMaxPoolSize(int maxPoolSize) {
        this.maxPoolSize = maxPoolSize;
    }

    public void setQueueCapacity(int queueCapacity) {
        this.queueCapacity = queueCapacity;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

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

    public void setTaskExecutor(TaskExecutor taskExecutor) {
        this.taskExecutor = taskExecutor;
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
                    driverClassName != null && !"".equals(driverClassName) &&
                            url != null && !"".equals(url) &&
                            username != null && !"".equals(username),
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
