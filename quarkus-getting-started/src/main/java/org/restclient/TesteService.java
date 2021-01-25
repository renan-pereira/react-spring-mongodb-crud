package org.restclient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@Path("/api")
@RegisterRestClient
public interface TesteService {
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("tempo")
    public String getProdutos();
}
