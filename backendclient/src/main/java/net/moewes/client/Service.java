package net.moewes.client;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/Service")
public interface Service {

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  ServiceData getService();


}
