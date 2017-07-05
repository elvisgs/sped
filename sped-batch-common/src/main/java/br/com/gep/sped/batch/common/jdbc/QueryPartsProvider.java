package br.com.gep.sped.batch.common.jdbc;

import com.opengamma.elsql.ElSqlBundle;
import com.opengamma.elsql.ElSqlConfig;
import lombok.NonNull;
import org.springframework.core.io.Resource;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

/**
 * Provê as cláusulas das consultas SQL dos registros
 */
public class QueryPartsProvider {

    private Resource[] queries;
    private ElSqlBundle elSqlBundle;

    public QueryPartsProvider() {
        elSqlBundle = ElSqlBundle.of(ElSqlConfig.DEFAULT, getClass());
    }

    public QueryPartsProvider(@NonNull Resource... queries) {
        this.queries = queries;
        elSqlBundle = ElSqlBundle.parse(ElSqlConfig.DEFAULT, queries);
    }

    public void patch(@NonNull Resource... patches) {
        ArrayList<Resource> patchedQueries = new ArrayList<>(asList(queries));
        patchedQueries.addAll(asList(patches));
        int len = patchedQueries.size();
        elSqlBundle = ElSqlBundle.parse(ElSqlConfig.DEFAULT, patchedQueries.toArray(new Resource[len]));
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
