package br.com.gep.sped.fiscal.batch.factory;

import br.com.gep.sped.batch.common.factory.IRowMapperFactory;
import br.com.gep.sped.marshaller.common.Registro;
import org.springframework.beans.BeanUtils;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
public class RowMapperFactory implements IRowMapperFactory {

    @SuppressWarnings("unchecked")
    @Override
    public <T extends Registro> RowMapper<T> create(Class<T> regClass) throws ClassNotFoundException {
        char bloc = regClass.getSimpleName().replace("Reg", "").charAt(0);

        String mapperClassName = String.format(
                "br.com.gep.sped.fiscal.batch.jdbc.mappers.bloco%s.%sRowMapper",
                bloc, regClass.getSimpleName());

        Class<?> mapperClass = Class.forName(mapperClassName);

        return (RowMapper<T>) BeanUtils.instantiate(mapperClass);
    }
}
