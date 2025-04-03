package rest;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("app")
public class HelloController {

    @GET
    @Path("hello")
    public HelloResource get() {
        return new HelloResource("Hello, World!");
    }
}
