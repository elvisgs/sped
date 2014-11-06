package br.com.gep.sped.batch.common.jdbc;

import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:queries.properties")
public class TestQueryPartsProvider extends QueryPartsProvider {
}
