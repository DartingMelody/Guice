/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.guice;

import com.example.service.APIClient;
import com.example.util.GuiceInjectorUtil;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 *
 * @author tarakhan
 */
@Path("/request")
public class Client {
    
    APIClient apiClient = GuiceInjectorUtil.getInjector().getInstance(APIClient.class);
    
    @Path("/result")
    @GET
    public Response getResult(){
        String result = apiClient.getResult();
        return Response.status(Response.Status.OK).entity(result).build();
    }
}
