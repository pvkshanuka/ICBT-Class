/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testmavenproject.controllers;

import com.mycompany.testmavenproject.modles.response.ResponseData;
import com.mycompany.testmavenproject.modles.user.User;
import com.mycompany.testmavenproject.modles.response.Error;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Variant;

/**
 *
 * @author Kusal Shanuka
 */
@Path("/user")
public class UserController {

    private static String BASE_CLASS = "UserController ->";

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getUser(@PathParam("id") String id) {

        if (id.length() > 10) {
            return Response.status(Response.Status.NOT_ACCEPTABLE).entity(ResponseData.getResponseData().setError(Error.getError().setErrorCode(105).setMessage("ID length is too long"))).build();
        }

        User user = new User();
        user.setFirstName("Kusal");
        user.setLastName("Shanuka");

        return Response.status(Response.Status.OK).entity(ResponseData.getResponseData().setData(user)).build();

    }

    @GET
    public Response getUser() {
        return Response.status(Response.Status.OK).entity("AWA AWA AWA").build();

    }

}
