package Examples.HTML;

public class HtmlBuilder {
    private HtmlElement root;

    public HtmlBuilder(String rootTagName) {
        root = new HtmlElement(rootTagName, null);
    }

    public HtmlBuilder addChild(String tagName, String textContent) {
        root.addChild(new HtmlElement(tagName, textContent));
        return this;
    }

    public String build() {
        return root.toHtml();
    }
}
