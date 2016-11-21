package br.com.gep.sped.batch.common.jdbc.dao;

import br.com.gep.sped.batch.common.AbstractIntegrationTest;
import br.com.gep.sped.batch.common.jdbc.entity.Estabelecimento;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;

import java.text.ParseException;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DirtiesContext
public class EstabelecimentoDaoTest extends AbstractIntegrationTest {

    @Autowired
    private EstabelecimentoDao estabelecimentoDao;

    @Test
    public void buscaUnicoEstabelecimentoCorretamente() throws ParseException {
        Estabelecimento estabelecimento = estabelecimentoDao.obterUnico();

        assertThat(estabelecimento.getCnpj()).isEqualTo("99999999000191");
        assertThat(estabelecimento.getNome()).isEqualTo("Empresa Teste");
        assertThat(estabelecimento.getDtIni()).isEqualToIgnoringHours("2014-01-01");
    }

    @Test
    public void buscaUnicoEstabelecimentoPorCnpjCorretamente() throws ParseException {
        Estabelecimento estabelecimento = estabelecimentoDao.obterUnico("99999999000191");

        assertThat(estabelecimento.getNome()).isEqualTo("Empresa Teste");
        assertThat(estabelecimento.getDtIni()).isEqualToIgnoringHours("2014-01-01");
    }

    @Test
    public void buscaTodosEstabelecimentosCorretamente() {
        List<Estabelecimento> estabelecimentos = estabelecimentoDao.obterTodos();

        assertThat(estabelecimentos).hasSize(1);
        assertThat(estabelecimentos.get(0).getCnpj()).isEqualTo("99999999000191");
    }
}
