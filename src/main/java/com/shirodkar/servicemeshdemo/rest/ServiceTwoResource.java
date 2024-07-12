package com.shirodkar.servicemeshdemo.rest;

import java.util.Date;

import com.shirodkar.servicemeshdemo.entity.AccessLog;

import io.quarkus.logging.Log;
import jakarta.transaction.Transactional;
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
    @Transactional
    public String handleServiceTwo(@PathParam("value") String value) {
        Log.debug("service-two received the value - '" + value + "'");

        String returnValue = value + ":" + value;

        // Persist the access log entry
        AccessLog requestLog = new AccessLog();
        requestLog.timestamp = new Date();
        requestLog.requestValue = value;
        requestLog.responseValue = returnValue;
        requestLog.persist();

        return returnValue;
    }
}
