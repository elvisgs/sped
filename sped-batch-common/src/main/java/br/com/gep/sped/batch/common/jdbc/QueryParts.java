package br.com.gep.sped.batch.common.jdbc;

import lombok.Getter;
import org.springframework.util.Assert;

import static org.springframework.util.StringUtils.hasText;

@Getter
public class QueryParts {

    private final String select, from, where, groupBy, orderBy;

    public QueryParts(String select, String from, String where, String groupBy, String orderBy) {
        Assert.hasText(select, "select clause is null or empty");
        Assert.hasText(from, "from clause is null or empty");

        this.select = removeKeyWord("select", select);
        this.from = removeKeyWord("from", from);
        this.where = where != null && hasText(where) ? removeKeyWord("where", where) : null;
        this.groupBy = groupBy != null && hasText(groupBy) ? removeKeyWord("group by", groupBy) : null;
        this.orderBy = orderBy != null && hasText(orderBy) ? removeKeyWord("order by", orderBy) : null;
    }

    public QueryParts(String select, String from, String where) {
        this(select, from, where, "", "");
    }

    public QueryParts(String select, String from) {
        this(select, from, "", "", "");
    }

    private String removeKeyWord(String keyWord, String clause) {
        String temp = clause.trim();
        String keyWordString = keyWord + " ";

        if (temp.toLowerCase().startsWith(keyWordString) && temp.length() > keyWordString.length())
            return temp.substring(keyWordString.length());

        return temp;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder()
                .append("SELECT ").append(select)
                .append(" FROM ").append(from);

        if (where != null) sb.append(" WHERE ").append(where);
        if (groupBy != null) sb.append(" GROUP BY ").append(groupBy);
        if (orderBy != null) sb.append(" ORDER BY ").append(orderBy);

        return sb.toString();
    }
}
