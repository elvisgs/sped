package br.com.gep.sped.batch.common.mocks;

import br.com.gep.sped.batch.common.factory.IRowMapperFactory;
import br.com.gep.sped.marshaller.common.Registro;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
public class TestRowMapperFactory implements IRowMapperFactory {

    @Override
    public <T extends Registro> RowMapper<T> create(Class<T> regClass) throws ClassNotFoundException {
        return new BeanPropertyRowMapper<>(regClass);
    }
}
