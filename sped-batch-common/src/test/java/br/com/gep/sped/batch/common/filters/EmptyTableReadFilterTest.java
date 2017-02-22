package br.com.gep.sped.batch.common.filters;

import br.com.gep.sped.batch.common.jdbc.EmptyTableChecker;
import br.com.gep.sped.batch.common.support.RegNode;
import br.com.gep.sped.batch.common.support.SpedTree;
import br.com.gep.sped.marshaller.common.Registro;
import br.com.gep.sped.marshaller.common.bloco9.Reg9001;
import br.com.gep.sped.marshaller.common.bloco9.Reg9999;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class EmptyTableReadFilterTest {

    @Mock
    private SpedTree spedTree;

    @Mock
    private EmptyTableChecker emptyTableChecker;

    private EmptyTableReadFilter filter;

    @Before
    public void setup() {
        when(spedTree.getRootNodes()).thenReturn(
            asList(RegNode.of(Reg0000.class), RegNode.of(RegC001.class))
        );

        when(emptyTableChecker.isEmpty(Reg0000.class)).thenReturn(false);
        when(emptyTableChecker.isEmpty(RegC001.class)).thenReturn(true);

        filter = new EmptyTableReadFilter(emptyTableChecker, spedTree);
        filter.init();
    }

    @Test
    public void shouldRead_tabelaC001Vazia_retornaFalse() {
        assertFalse(filter.shouldRead(RegC001.class));
    }

    @Test
    public void shouldRead_tabela0000NaoVazia_retornaTrue() {
        assertTrue(filter.shouldRead(Reg0000.class));
    }

    @Test
    public void shouldRead_tabela9001_retornaTrue() {
        assertTrue(filter.shouldRead(Reg9001.class));
    }

    @Test
    public void shouldRead_tabela9999_retornaTrue() {
        assertTrue(filter.shouldRead(Reg9999.class));
    }

    private class Reg0000 extends Registro {}
    private class RegC001 extends Registro {}
}
