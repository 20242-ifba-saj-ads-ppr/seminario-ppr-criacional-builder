package Examples.HTML;

import java.util.ArrayList;
import java.util.List;

public class HtmlElement {
    private String tagName;
    private String textContent;
    private List<HtmlElement> children;

    public HtmlElement(String tagName, String textContent) {
        this.tagName = tagName;
        this.textContent = textContent;
        this.children = new ArrayList<>();
    }

    public void addChild(HtmlElement child) {
        children.add(child);
    }

    public String toHtml() {
        StringBuilder sb = new StringBuilder();
        sb.append("<").append(tagName).append(">");
        if (textContent != null) {
            sb.append(textContent);
        }
        for (HtmlElement child : children) {
            sb.append(child.toHtml());
        }
        sb.append("</").append(tagName).append(">");
        return sb.toString();
    }
}
