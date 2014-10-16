package br.com.gep.sped.batch.common.factory;

import br.com.gep.sped.marshaller.common.Registro;
import org.springframework.jdbc.core.RowMapper;

public interface IRowMapperFactory {

    <T extends Registro> RowMapper<T> create(Class<T> regClass) throws ClassNotFoundException;
}
