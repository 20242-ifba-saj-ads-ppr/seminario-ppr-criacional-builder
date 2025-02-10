package Examples.SQL;

public class QueryBuilderExample {
    public static void main(String[] args) {
        SQLQuery query = new SQLQueryBuilder()
                            .select("*")
                            .from("usuarios")
                            .where("idade > 18")
                            .orderBy("nome")
                            .build();
        System.out.println(query);
    }
}
