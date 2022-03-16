/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.icbt.samplebackend.controllers;

import com.icbt.samplebackend.modles.User;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Kusal Shanuka
 */
@Path("/main")
public class MainController {

    
    //SEARCH
    @GET
    public String testGET() {
        return "Test called GET!";
    }
    
    //CREATE
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public User testPOST(User user) {
        
        if (user.getName().isEmpty()) {
            return null;
        }
        
        if (user.getAge() > 25) {
            user.setName("OLD "+user.getName());
        }
        
        return user;
    }
    
    //UPDATE
    @PUT
    public String testPUT() {
        return "Test called PUT!";
    }

    //DELETE
    @DELETE
    public String testDELETE() {
        return "Test called DELETE!";
    }
    
    @GET
    @Path("greeting")
    public String testGET(@QueryParam("name") String txt) {
        return "Test called GET! "+txt;
    }
    
    @GET
    @Path("/{name}")
    public String testGETPP(@PathParam("name") String txt) {
        return "Test called GET! "+txt;
    }

}
