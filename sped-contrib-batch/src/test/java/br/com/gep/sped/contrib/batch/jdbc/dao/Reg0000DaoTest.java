package br.com.gep.sped.contrib.batch.jdbc.dao;

import br.com.gep.sped.contrib.batch.TestInfrastructureConfig;
import br.com.gep.sped.contrib.marshaller.registros.bloco0.Reg0000;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@SuppressWarnings("SpringJavaAutowiringInspection")
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestInfrastructureConfig.class)
@DirtiesContext
public class Reg0000DaoTest {

    @Autowired
    private Reg0000Dao reg0000Dao;

    @Before
    public void before() {
        reg0000Dao.setSchema("sped_contrib");
    }

    @Test
    public void buscaReg0000Corretamente() throws ParseException {
        Reg0000 reg = reg0000Dao.getUnique();

        assertThat(reg.getCnpj(), is("99999999000191"));
        assertThat(reg.getNome(), is("EMPRESA TESTE"));
        Date data = new SimpleDateFormat("dd/MM/yyyy").parse("01/04/2011");
        assertThat(reg.getDtIni().compareTo(data), is(0));
    }
}
