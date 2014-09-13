package br.com.gep.sped.contrib.batch.factory;

import br.com.gep.sped.contrib.batch.jdbc.mappers.bloco0.Reg0000RowMapper;
import br.com.gep.sped.contrib.batch.jdbc.mappers.blocoC.RegC100RowMapper;
import br.com.gep.sped.contrib.marshaller.registros.bloco0.Reg0000;
import br.com.gep.sped.contrib.marshaller.registros.blocoC.RegC100;
import org.junit.Test;
import org.springframework.jdbc.core.RowMapper;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;

public class RowMapperFactoryTest {

    @Test
    public void criaMapperParaClasseReg0000() throws ClassNotFoundException {
        RowMapperFactory factory = new RowMapperFactory();

        RowMapper<Reg0000> mapper = factory.create(Reg0000.class);

        assertThat(mapper, instanceOf(Reg0000RowMapper.class));
    }

    @Test
    public void criaMapperParaClasseRegC100() throws ClassNotFoundException {
        RowMapperFactory factory = new RowMapperFactory();

        RowMapper<RegC100> mapper = factory.create(RegC100.class);

        assertThat(mapper, instanceOf(RegC100RowMapper.class));
    }
}
