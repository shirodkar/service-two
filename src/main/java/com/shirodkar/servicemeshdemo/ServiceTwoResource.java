package com.shirodkar.servicemeshdemo;

import io.quarkus.logging.Log;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("")
public class ServiceTwoResource {

    @GET
    @Path("handle/{value}")
    @Produces(MediaType.TEXT_PLAIN)
    public String handleServiceTwo(@PathParam("value") String value) {
        Log.debug("Value = " + value);
        return value;
    }
}
