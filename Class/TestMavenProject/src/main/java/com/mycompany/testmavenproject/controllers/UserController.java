/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testmavenproject.controllers;

import com.mycompany.testmavenproject.modles.user.User;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author Kusal Shanuka
 */

@Path("/user")
public class UserController {
    private static String BASE_CLASS = "UserController ->";
    private static Logger logger = LogManager.getLogger(UserController.class);
    
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public User getUser(@PathParam("id") String id){
        
        logger.info("Info log message");
        User user = new User();
        user.setFirstName("Kusal");
        user.setLastName("Shanuka");
        
        return  user;
        
    }
    
    @GET
    public Response getUser(){
        logger.info("Info log message");
        return Response.status(Response.Status.OK).entity("AWA AWA AWA").build();
        
    }
    
}
