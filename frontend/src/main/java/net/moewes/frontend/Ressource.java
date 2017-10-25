package net.moewes.frontend;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import net.moewes.client.ServiceData;
import net.moewes.v4j.HtmlPageComponent;

@Path("/")
public class Ressource {

  /**
   * Testservice.
   *
   * @return Response
   */
  @GET
  @Produces("text/plain")
  public Response doGet() {

    Client client = ClientBuilder.newClient();

    ServiceData data = client.target("http://backend:8080/")
            .path("Service")
            .request(MediaType.APPLICATION_JSON)
            .get(new GenericType<ServiceData>() {
            });

    return Response.ok("Hello from WildFly Swarm! " + data.getMessage()).build();
  }

  /**
   * Testservice.
   *
   * @return Response
   */
  @GET
  @Path("page.html")
  @Produces(MediaType.TEXT_HTML)
  public Response getPage() {

    StringBuilder sb = new StringBuilder();

    sb.append("<!DOCTYPE html>\n"
            + "<html>\n"
            + "<head>\n"
            + "<title>Vue</title>"
            + "<link rel='stylesheet' href='/webjars/bootstrap/3.1.0/css/bootstrap.min.css'>"
            + "</head>");

    sb.append("<body><h1>test</h1><p>lorem ipsum</p></body>");

    return Response.ok(sb.toString()).build();
  }

  /**
   * Testservice.
   *
   * @return Response
   */
  @GET
  @Path("framework.html")
  @Produces(MediaType.TEXT_HTML)
  public Response getFrameworkPage() {

    HtmlPageComponent page = new HtmlPageComponent();

    return Response.ok(page.renderPage()).build();
  }
}
