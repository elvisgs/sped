package br.com.gep.sped.contrib.batch.factory;

import br.com.gep.sped.batch.common.factory.RowMapperFactory;
import org.springframework.stereotype.Component;

@Component
public class SpedContribRowMapperFactory extends RowMapperFactory {

    public SpedContribRowMapperFactory() {
        super("br.com.gep.sped.contrib.batch.jdbc.mappers");
    }
}
