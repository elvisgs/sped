package br.com.gep.sped.batch.common.config;

import org.junit.Test;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import javax.sql.DataSource;
import java.io.Closeable;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.fail;
import static org.mockito.Mockito.*;

public class SimpleInfrastructureConfigTest {

    @Test
    public void lancaExcecaoSeDataSourceEPropriedadesDeConexaoForemInvalidos() {
        SimpleInfrastructureConfig config = new SimpleInfrastructureConfig();

        assertThatThrownBy(config::afterPropertiesSet)
            .isInstanceOf(IllegalStateException.class);
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
        DataSource dataSource = mock(DataSource.class,
                withSettings().extraInterfaces(Closeable.class));
        ThreadPoolTaskExecutor taskExecutor = mock(ThreadPoolTaskExecutor.class);
        SimpleInfrastructureConfig config = new SimpleInfrastructureConfig();
        config.setDataSource(dataSource);
        config.setTaskExecutor(taskExecutor);

        config.shutdown();

        verify((Closeable)dataSource, only()).close();
        verify(taskExecutor, only()).destroy();
    }
}
