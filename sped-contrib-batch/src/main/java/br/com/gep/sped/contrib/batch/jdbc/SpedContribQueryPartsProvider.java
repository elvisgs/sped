package br.com.gep.sped.contrib.batch.jdbc;

import br.com.gep.sped.batch.common.jdbc.QueryPartsProvider;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value = "classpath:queries-contrib.properties")
public class SpedContribQueryPartsProvider extends QueryPartsProvider {
}
