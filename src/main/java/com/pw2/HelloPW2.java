package com.pw2;

import jakarta.ws.rs.*;
import org.eclipse.microprofile.config.inject.ConfigProperty;


@Path("/hello-world")
public class HelloPW2 {

    @ConfigProperty(name = "Ifrs.pw2")
    String ifrs;

    @GET
    @Produces("text/plain")
    public String hello(){
        return ifrs;
    }

}
