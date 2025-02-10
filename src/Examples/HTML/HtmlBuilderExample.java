package Examples.HTML;

public class HtmlBuilderExample {
    public static void main(String[] args) {
        HtmlBuilder builder = new HtmlBuilder("html");
        builder.addChild("head", "")
               .addChild("body", "Olá, mundo!");
        String html = builder.build();
        System.out.println(html);
    }
}