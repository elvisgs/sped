package br.com.gep.sped.contrib.batch.config;

import br.com.gep.sped.contrib.batch.TestInfrastructureConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;

import static org.assertj.core.api.Assertions.assertThat;

@Configuration
@ComponentScan(excludeFilters =
    @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = TestInfrastructureConfig.class))
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = StandaloneConfigTest.class)
public class StandaloneConfigTest {

    @Autowired
    private InfrastructureConfig standaloneConfig;

    @Test
    public void criaSpedDataSourceUsandoArquivoDePropriedades() {
        DataSource dataSource = standaloneConfig.spedDataSource();

        assertThat(dataSource).isNotNull();
    }

    @Test
    public void criaBatchDataSourceUsandoArquivoDePropriedades() {
        DataSource dataSource = standaloneConfig.batchDataSource();

        assertThat(dataSource).isNotNull();
    }
}
