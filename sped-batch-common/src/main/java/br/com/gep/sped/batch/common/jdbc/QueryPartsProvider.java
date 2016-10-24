package br.com.gep.sped.batch.common.jdbc;

import com.opengamma.elsql.ElSqlBundle;
import com.opengamma.elsql.ElSqlConfig;

import java.util.Optional;

/**
 * Provê as cláusulas das consultas SQL dos registros
 */
public abstract class QueryPartsProvider {

    private final ElSqlBundle elSqlBundle;

    public QueryPartsProvider() {
        elSqlBundle = ElSqlBundle.of(ElSqlConfig.DEFAULT, getClass());
    }

    public QueryParts getQueryParts(String regName) {
        String select = elSqlBundle.getSql(regName + "_select");
        String from = elSqlBundle.getSql(regName + "_from");
        String where = tryGetSql(regName + "_where").orElse("");
        String groupBy = tryGetSql(regName + "_groupBy").orElse("");
        String orderBy = tryGetSql(regName + "_orderBy").orElse("");

        return new QueryParts(select, from, where, groupBy, orderBy);
    }

    public QueryParts getQueryParts(Class<?> regClass)  {
        return getQueryParts(regClass.getSimpleName());
    }

    protected Optional<String> tryGetSql(String name) {
        try {
            return Optional.of(elSqlBundle.getSql(name));
        } catch (IllegalArgumentException e) {
            return Optional.empty();
        }
    }
}
