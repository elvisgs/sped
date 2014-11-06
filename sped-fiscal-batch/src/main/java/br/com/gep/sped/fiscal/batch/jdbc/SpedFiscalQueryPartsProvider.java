package br.com.gep.sped.fiscal.batch.jdbc;

import br.com.gep.sped.batch.common.jdbc.QueryPartsProvider;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value = "classpath:queries-fiscal.properties")
public class SpedFiscalQueryPartsProvider extends QueryPartsProvider {
}
