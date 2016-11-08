package br.com.gep.sped.fiscal.batch.factory;

import br.com.gep.sped.batch.common.factory.IRowMapperFactory;
import br.com.gep.sped.fiscal.batch.jdbc.mappers.bloco0.Reg0000RowMapper;
import br.com.gep.sped.fiscal.batch.jdbc.mappers.blocoC.RegC100RowMapper;
import br.com.gep.sped.fiscal.marshaller.registros.bloco0.Reg0000;
import br.com.gep.sped.fiscal.marshaller.registros.blocoC.RegC100;
import org.junit.Test;
import org.springframework.jdbc.core.RowMapper;

import static org.assertj.core.api.Assertions.*;

public class SpedFiscalRowMapperFactoryTest {

    @Test
    public void criaMapperParaClasseReg0000() throws ClassNotFoundException {
        IRowMapperFactory factory = new SpedFiscalRowMapperFactory();

        RowMapper<Reg0000> mapper = factory.create(Reg0000.class);

        assertThat(mapper).isInstanceOf(Reg0000RowMapper.class);
    }

    @Test
    public void criaMapperParaClasseRegC100() throws ClassNotFoundException {
        IRowMapperFactory factory = new SpedFiscalRowMapperFactory();

        RowMapper<RegC100> mapper = factory.create(RegC100.class);

        assertThat(mapper).isInstanceOf(RegC100RowMapper.class);
    }
}
