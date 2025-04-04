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

    @GET
    @Path("helloV2")
    public HelloResource getV2() {
        return new HelloResource("Hello, World V2!");
    }

    @GET
    @Path("helloV3")
    public HelloResource getV3() {
        return new HelloResource("Hello, World V3!");
    }
}
