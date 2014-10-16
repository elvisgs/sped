package br.com.gep.sped.batch.common.jdbc;

import br.com.gep.sped.batch.common.TestConfig;
import br.com.gep.sped.batch.common.config.InfrastructureConfig;
import br.com.gep.sped.marshaller.common.bloco9.Reg9900;
import br.com.gep.sped.marshaller.common.bloco9.Reg9999;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestConfig.class)
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
        emptyTableChecker.setSchemaInjector(new SchemaInjector());
    }

    @Test
    public void verificaTabelaVazia() throws Exception {
        boolean empty = emptyTableChecker.isEmpty(Reg9999.class);

        assertTrue(empty);
    }

    @Test
    public void verificaTabelaNaoVazia() throws Exception {
        boolean empty = emptyTableChecker.isEmpty(Reg9900.class);

        assertFalse(empty);
    }
}
