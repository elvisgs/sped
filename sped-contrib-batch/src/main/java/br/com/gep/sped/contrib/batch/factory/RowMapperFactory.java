package br.com.gep.sped.contrib.batch.factory;

import br.com.gep.sped.contrib.marshaller.registros.Registro;
import org.springframework.beans.BeanUtils;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
public class RowMapperFactory {

    public <T extends Registro> RowMapper<T> create(Class<T> regClass) throws ClassNotFoundException {
        char bloc = regClass.getSimpleName().replace("Reg", "").charAt(0);

        String mapperClassName = String.format(
                "br.com.gep.sped.contrib.batch.jdbc.mappers.bloco%s.%sRowMapper",
                bloc, regClass.getSimpleName());

        Class<?> mapperClass = Class.forName(mapperClassName);

        return (RowMapper<T>) BeanUtils.instantiate(mapperClass);
    }
}
