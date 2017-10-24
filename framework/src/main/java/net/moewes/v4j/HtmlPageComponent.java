package net.moewes.v4j;

public class HtmlPageComponent extends Component {

  /**
   * Rendert das HTML der HTMLPage.
   *
   * @return PageCOntent
   */
  public String renderPage() {

    StringBuilder sb = new StringBuilder();

    sb.append("<!DOCTYPE html>");
    sb.append("<html>");
    // Header
    sb.append("<header>");
    sb.append("<title>v4j HtmlPageComponent</title>");
    sb.append("</header>");

    sb.append("<body>");

    sb.append("<p>Hello from HtmlPageComponent</p>");

    sb.append("</body>");
    sb.append("</html>");

    return sb.toString();
  }
}
