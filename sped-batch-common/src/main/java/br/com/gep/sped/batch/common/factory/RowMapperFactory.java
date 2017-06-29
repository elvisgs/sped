package br.com.gep.sped.batch.common.factory;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.core.ResolvableType;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

@Component
@RequiredArgsConstructor
public class RowMapperFactory implements IRowMapperFactory {

    private final ApplicationContext appContext;

    @SuppressWarnings("unchecked")
    @Override
    public <T extends Registro> RowMapper<T> create(Class<T> regClass) throws Exception {
        String mapperBeanName = seekMapperBeanName(regClass);

        return (RowMapper<T>) appContext.getBean(mapperBeanName, RowMapper.class);
    }

    private <T extends Registro> String seekMapperBeanName(Class<T> regClass) throws ClassNotFoundException {
        ResolvableType resolvableType = ResolvableType.forClassWithGenerics(RowMapper.class, regClass);
        String[] beanNames = appContext.getBeanNamesForType(resolvableType);

        if (beanNames.length == 0) {
            throw new ClassNotFoundException();
        }

        if (beanNames.length > 1) {
            String message = String.format("Existe mais de uma implementação de %s para a classe %s",
                RowMapper.class.getName(), regClass.getName());
            throw new RuntimeException(message);
        }

        return beanNames[0];
    }
}
