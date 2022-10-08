package com.frankmoley.lil.lq;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/greeting")
public class GreetingResource {
    GreetingConfig config;

    @Inject
    public GreetingResource(GreetingConfig config){
        this.config = config;
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello " + config.getReceipient();
    }
}