package br.com.gep.sped.fiscal.batch.factory;

import br.com.gep.sped.batch.common.factory.RowMapperFactory;
import org.springframework.stereotype.Component;

@Component
public class SpedFiscalRowMapperFactory extends RowMapperFactory {

    public SpedFiscalRowMapperFactory() {
        super("br.com.gep.sped.fiscal.batch.jdbc.mappers");
    }
}
