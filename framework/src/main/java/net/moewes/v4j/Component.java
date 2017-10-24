package net.moewes.v4j;

import java.util.ArrayList;
import java.util.List;

public class Component {

  private List<Component> children = new ArrayList<>();

  public void addComponent(Component component) {

    children.add(component);
  }

  /**
   * Rendert den HTML-Part der Komponente.
   *
   * @return Gerendertes Html
   */
  public String renderHtml() {

    StringBuilder sb = new StringBuilder();

    sb.append(beforeChildrenHtml());

    for (Component c : children) {
      sb.append(c.renderHtml());
    }

    sb.append(afterChildrenHtml());

    return sb.toString();
  }

  protected String beforeChildrenHtml() {
    return "<div>";
  }

  protected String afterChildrenHtml() {
    return "</div>";
  }


}
