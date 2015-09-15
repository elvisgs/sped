package br.com.gep.sped.batch.common.jdbc;

import org.springframework.util.Assert;

public class QueryParts {

    private final String select, from, where, groupBy;

    public QueryParts(String select, String from, String where, String groupBy) {
        Assert.hasText(select, "select clause is null or empty");
        Assert.hasText(from, "from clause is null or empty");

        this.select = select;
        this.from = from;
        this.where = where != null ? where : "";
        this.groupBy = groupBy != null ? groupBy : "";
    }

    public QueryParts(String select, String from, String where) {
        this(select, from, where, "");
    }

    public QueryParts(String select, String from) {
        this(select, from, "", "");
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

    public String getGroupBy() {
        return groupBy;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s", select, from, where, groupBy);
    }
}
