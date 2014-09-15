package br.com.gep.sped.contrib.batch;

import br.com.gep.sped.contrib.batch.config.SimpleInfrastructureConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.junit.Test;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.*;

public class SimpleInfrastructureConfigTest {

    @Test
    public void lancaExcecaoSeDataSourceEPropriedadesDeConexaoForemInvalidos() {
        SimpleInfrastructureConfig config = new SimpleInfrastructureConfig();

        try {
            config.afterPropertiesSet();
            failBecauseExceptionWasNotThrown(IllegalStateException.class);
        } catch (Exception e) {}
    }

    @Test
    public void naoLancaExcecaoSeDataSourceForInformado() {
        SimpleInfrastructureConfig config = new SimpleInfrastructureConfig();
        config.setDataSource(new DriverManagerDataSource());

        try {
            config.afterPropertiesSet();
        } catch (Exception e) {
            fail("Execeção foi lançada", e);
        }
    }

    @Test
    public void naoLancaExcecaoSePropriedadesDeConexaoForemInformadas() {
        SimpleInfrastructureConfig config = new SimpleInfrastructureConfig();
        config.setDriverClassName("org.db.Driver");
        config.setUrl("jdbc:db://localhost/test");
        config.setUsername("sa");

        try {
            config.afterPropertiesSet();
        } catch (Exception e) {
            fail("Execeção foi lançada", e);
        }
    }

    @Test
    public void liberaRecursosNoShutdown() throws Exception {
        HikariDataSource dataSource = mock(HikariDataSource.class);
        ThreadPoolTaskExecutor taskExecutor = mock(ThreadPoolTaskExecutor.class);
        SimpleInfrastructureConfig config = new SimpleInfrastructureConfig();
        config.setDataSource(dataSource);
        config.setTaskExecutor(taskExecutor);

        config.shutdown();

        verify(dataSource, only()).close();
        verify(taskExecutor, only()).destroy();
    }
}