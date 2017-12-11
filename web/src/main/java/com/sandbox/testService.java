package com.sandbox;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("helloworld")
public class testService {

    @GET
    @Produces("text/plain")
    public String getHello() {
        return "Hello World!";
    }
}
