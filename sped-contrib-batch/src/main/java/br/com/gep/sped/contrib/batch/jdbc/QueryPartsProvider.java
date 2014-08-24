package br.com.gep.sped.contrib.batch.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * Provê as cláusulas das consultas SQL dos registros
 */
@Component
@PropertySource(value = "classpath:queries.properties")
public class QueryPartsProvider {

    @Autowired
    Environment env;

    public QueryParts getQueryParts(Class<?> regClass) {
        String prefix = buildPrefix(regClass);
        String select = env.getProperty(prefix + ".select");
        String from = env.getProperty(prefix + ".from");
        String where = env.getProperty(prefix + ".where");

        return new QueryParts(select, from, where);
    }

    private String buildPrefix(Class<?> regClass) {
        String regName = regClass.getSimpleName().replaceAll("Reg", "");
        char bloc = regName.charAt(0);
        return String.format("bloco%s.%s", bloc, regName.toLowerCase());
    }
}
