package org.restclient;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("/organizations") 
@Transactional
public class TesteResource {
    
    @Inject
    @RestClient
    TesteService service;

    @GET
    @Produces(value = MediaType.APPLICATION_JSON)
    @Path("local")
    public String methodname() {
        
        return service.getOrganizations();

    }
}
