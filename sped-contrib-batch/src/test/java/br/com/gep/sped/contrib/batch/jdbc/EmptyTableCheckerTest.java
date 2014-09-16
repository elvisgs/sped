package br.com.gep.sped.contrib.batch.jdbc;

import br.com.gep.sped.contrib.batch.TestInfrastructureConfig;
import br.com.gep.sped.contrib.batch.config.InfrastructureConfig;
import br.com.gep.sped.contrib.marshaller.registros.bloco0.Reg0000;
import br.com.gep.sped.contrib.marshaller.registros.bloco0.Reg0206;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestInfrastructureConfig.class)
public class EmptyTableCheckerTest {

    @Autowired
    private InfrastructureConfig infraConfig;

    @Autowired
    private QueryPartsProvider queryPartsProvider;

    private EmptyTableChecker emptyTableChecker;

    @Before
    public void before() {
        emptyTableChecker = new EmptyTableChecker();
        emptyTableChecker.setQueryPartsProvider(queryPartsProvider);
        emptyTableChecker.setInfraConfig(infraConfig);
        emptyTableChecker.setSchemaInjector(new SchemaInjector("sped_contrib"));
    }

    @Test
    public void verificaTabelaVazia() throws Exception {
        boolean empty = emptyTableChecker.isEmpty(Reg0206.class);

        assertTrue(empty);
    }

    @Test
    public void verificaTabelaNaoVazia() throws Exception {
        boolean empty = emptyTableChecker.isEmpty(Reg0000.class);

        assertFalse(empty);
    }
}
