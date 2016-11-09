package br.com.gep.sped.batch.common.factory;

import br.com.gep.sped.marshaller.common.Registro;
import org.springframework.beans.BeanUtils;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.util.Assert;

public class RowMapperFactory implements IRowMapperFactory {

    private final String basePackage;

    public RowMapperFactory(String basePackage) {
        Assert.hasText(basePackage);

        this.basePackage = basePackage;
    }

    @SuppressWarnings("unchecked")
    @Override
    public <T extends Registro> RowMapper<T> create(Class<T> regClass) throws ClassNotFoundException {
        char bloc = regClass.getSimpleName().charAt(3);

        String mapperClassName = String.format(
            "%s.bloco%s.%sRowMapper",
            basePackage, bloc, regClass.getSimpleName());

        Class<?> mapperClass = Class.forName(mapperClassName);

        return (RowMapper<T>) BeanUtils.instantiate(mapperClass);
    }
}
