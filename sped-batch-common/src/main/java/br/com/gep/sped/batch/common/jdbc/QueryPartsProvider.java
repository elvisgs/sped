package br.com.gep.sped.batch.common.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * Provê as cláusulas das consultas SQL dos registros
 */
public abstract class QueryPartsProvider {

    @Autowired
    Environment env;

    public QueryParts getQueryParts(String regName) {
        String prefix = buildPrefix(regName);
        String select = env.getProperty(prefix + ".select");
        String from = env.getProperty(prefix + ".from");
        String where = env.getProperty(prefix + ".where", "");
        String groupBy = env.getProperty(prefix + ".groupBy", "");

        return new QueryParts(select, from, where, groupBy);
    }

    public QueryParts getQueryParts(Class<?> regClass) {
        return getQueryParts(regClass.getSimpleName());
    }

    private String buildPrefix(String regName) {
        regName = regName.replaceAll("Reg", "");
        char bloc = regName.charAt(0);
        return String.format("bloco%s.%s", bloc, regName.toLowerCase());
    }

    private String buildPrefix(Class<?> regClass) {
        return buildPrefix(regClass.getSimpleName());
    }
}
