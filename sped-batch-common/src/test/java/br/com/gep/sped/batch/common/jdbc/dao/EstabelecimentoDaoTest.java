package br.com.gep.sped.batch.common.jdbc.dao;

import br.com.gep.sped.batch.common.TestConfig;
import br.com.gep.sped.batch.common.jdbc.entity.Estabelecimento;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.text.ParseException;

import static org.assertj.core.api.Assertions.*;

@SuppressWarnings("SpringJavaAutowiringInspection")
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestConfig.class)
@DirtiesContext
public class EstabelecimentoDaoTest {

    @Autowired
    private EstabelecimentoDao estabelecimentoDao;

    @Before
    public void before() {
        estabelecimentoDao.setSchema("sped_contrib");
    }

    @Test
    public void buscaPrimeiroEstabelecimentoCorretamente() throws ParseException {
        Estabelecimento estabelecimento = estabelecimentoDao.getPrimeiro();

        assertThat(estabelecimento.getCnpj()).isEqualTo("99999999000191");
        assertThat(estabelecimento.getNome()).isEqualTo("Empresa Teste");
        assertThat(estabelecimento.getDtIni()).isEqualToIgnoringHours("2014-01-01");
    }
}
