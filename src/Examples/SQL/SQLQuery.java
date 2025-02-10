package Examples.SQL;

public class SQLQuery {
    private String select;
    private String from;
    private String where;
    private String orderBy;

    public SQLQuery(String select, String from, String where, String orderBy) {
        this.select = select;
        this.from = from;
        this.where = where;
        this.orderBy = orderBy;
    }

    @Override
    public String toString() {
        StringBuilder query = new StringBuilder();
        query.append("SELECT ").append(select)
             .append(" FROM ").append(from);
        if (where != null && !where.isEmpty()) {
            query.append(" WHERE ").append(where);
        }
        if (orderBy != null && !orderBy.isEmpty()) {
            query.append(" ORDER BY ").append(orderBy);
        }
        return query.toString();
    }
}