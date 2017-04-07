package com.jersey.cdi.helloworld.resource;

import com.jersey.cdi.helloworld.bean.HelloWorldBean;
import com.jersey.cdi.helloworld.service.HelloWorldService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by valerie on 1/21/17.
 */
@Path("/hello")
public class HelloWorldResource {

    @Inject
    private HelloWorldService helloWorldService;

    @GET
    @Path("/ping/{name}")
    @Produces(MediaType.TEXT_PLAIN)
    public String ping(@PathParam("name") String name) {
        return "pong " + name;
    }

    @GET
    @Path("/{greeting}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response hello(@PathParam("greeting") String greeting) {

        HelloWorldBean helloWorldBean = helloWorldService.getPatient(greeting);

        return Response.ok().entity(helloWorldBean).build();
    }

}
