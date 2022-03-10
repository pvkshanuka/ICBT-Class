/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testmavenproject.controllers;

import com.mycompany.testmavenproject.modles.user.User;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 *
 * @author Kusal Shanuka
 */

@Path("/user")
public class UserController {
    
    @GET
    @Path("/{id}")
    public User getUser(@PathParam("id") String userid){
    
        User user = new User();
        user.setFirstName("Kusal");
        user.setLastName("Shanuka");
        
        return  user;
        
    }
    
}
