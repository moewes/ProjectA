package net.moewes.frontend;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTest;
import org.junit.Before;
import org.junit.Test;

import javax.ws.rs.core.Application;
import javax.ws.rs.core.Response;

import static org.junit.Assert.*;

public class RessourceTest extends JerseyTest {

    @Override
    protected Application configure() {
        return new ResourceConfig(Ressource.class);
    }

    private Ressource ressource;

    @Before
    public void setup() {


       ressource = new Ressource();
    }

    @Test
    public void doGet() throws Exception {

        Response response = target("").request().get(Response.class);

        assertNotNull(response);
    }

    @Test
    public void getPage() throws Exception {

        Response response = target("page.html").request().get(Response.class);

        assertNotNull(response);
    }

    @Test
    public void getFrameworkPage() throws Exception {

        Response response = target("framework.html").request().get(Response.class);

        assertNotNull(response);
    }

}