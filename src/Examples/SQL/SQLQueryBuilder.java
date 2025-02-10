package Examples.SQL;


public class SQLQueryBuilder {
    private String select;
    private String from;
    private String where;
    private String orderBy;

    public SQLQueryBuilder select(String select) {
        this.select = select;
        return this;
    }

    public SQLQueryBuilder from(String from) {
        this.from = from;
        return this;
    }

    public SQLQueryBuilder where(String where) {
        this.where = where;
        return this;
    }

    public SQLQueryBuilder orderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public SQLQuery build() {
        return new SQLQuery(select, from, where, orderBy);
    }
}