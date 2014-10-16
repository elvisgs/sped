package br.com.gep.sped.batch.common.jdbc;

import org.springframework.util.Assert;

public class QueryParts {

    private final String select, from, where;

    public QueryParts(String select, String from, String where) {
        Assert.hasText(select, "select clause is null or empty");
        Assert.hasText(from, "from clause is null or empty");

        this.select = select;
        this.from = from;
        this.where = where != null ? where : "";
    }

    public QueryParts(String select, String from) {
        this(select, from, "");
    }

    public String getSelect() {
        return select;
    }

    public String getFrom() {
        return from;
    }

    public String getWhere() {
        return where;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", select, from, where);
    }
}
