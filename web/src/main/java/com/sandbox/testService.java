package com.sandbox;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("helloworld")
@Api(description = "Helloworld REST endpoint")
public class testService {

    @GET
    @Produces("text/plain")
    @ApiOperation(value = "say hello")
    public String getHello() {
        return "Hello World!";
    }
}
