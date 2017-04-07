package com.heartbeat.clientApi.clinical.resource;

import com.heartbeat.clientApi.clinical.bean.PatientBean;
import com.heartbeat.clientApi.clinical.service.PatientService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by valerie on 1/21/17.
 */
@Path("/patient")
public class PatientResource{

    @Inject
    private PatientService patientService;

    @GET
    @Path("/ping/{name}")
    @Produces(MediaType.TEXT_PLAIN)
    public String ping(@PathParam("name") String name) {
        return "pong " + name;
    }

    @GET
    @Path("/{patientId}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response ping(@PathParam("patientId") int patientId) {

        PatientBean patientBean = patientService.getPatient(patientId);

        return Response.ok().entity(patientBean).build();
    }

}
