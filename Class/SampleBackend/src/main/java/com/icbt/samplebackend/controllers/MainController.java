/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.icbt.samplebackend.controllers;

<<<<<<< HEAD
import com.icbt.samplebackend.config.DBConfig;
import com.icbt.samplebackend.modles.response.ErrorData;
import com.icbt.samplebackend.modles.response.ResponseData;
import com.icbt.samplebackend.modles.user.User;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
=======
import com.icbt.samplebackend.modles.User;
>>>>>>> 189dfe63d0fb4b3e87c0c43e324ff56b13138d6d
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
<<<<<<< HEAD
import javax.ws.rs.core.Response;
=======
>>>>>>> 189dfe63d0fb4b3e87c0c43e324ff56b13138d6d

/**
 *
 * @author Kusal Shanuka
 */
@Path("/main")
public class MainController {

<<<<<<< HEAD
=======
    
>>>>>>> 189dfe63d0fb4b3e87c0c43e324ff56b13138d6d
    //SEARCH
    @GET
    public String testGET() {
        return "Test called GET!";
    }
<<<<<<< HEAD

=======
    
>>>>>>> 189dfe63d0fb4b3e87c0c43e324ff56b13138d6d
    //CREATE
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
<<<<<<< HEAD
    public Response testPOST(User user) {

        if (user.getName().isEmpty()) {

            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(ResponseData.getResponseData().setError(ErrorData.getErrorData().setErrorCode("2222").setErrorMessage("User name is empty."))).build();
        }

        if (user.getAge() > 25) {

            return Response.status(Response.Status.NOT_ACCEPTABLE).entity(ResponseData.getResponseData().setError(ErrorData.getErrorData().setErrorCode("5533").setErrorMessage("User is too old."))).build();
        }

        user.setName("TM " + user.getName());
        return Response.status(Response.Status.CREATED).entity(ResponseData.getResponseData().setData(user)).build();

    }

=======
    public User testPOST(User user) {
        
        if (user.getName().isEmpty()) {
            return null;
        }
        
        if (user.getAge() > 25) {
            user.setName("OLD "+user.getName());
        }
        
        return user;
    }
    
>>>>>>> 189dfe63d0fb4b3e87c0c43e324ff56b13138d6d
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
<<<<<<< HEAD

    @GET
    @Path("greeting")
    public String testGET(@QueryParam("name") String txt) {
        return "Test called GET! " + txt;
    }

    @GET
    @Path("/{name}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response testGETPP(@PathParam("name") String txt) throws Exception {
        
        String query = "SELECT * FROM user WHERE name LIKE ?";

        PreparedStatement preparedStatement = DBConfig.getDBConnection().prepareStatement(query);
        preparedStatement.setString(1, "%"+txt+"%");

        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {

            User user = new User();
            user.setId(resultSet.getInt(1));
            user.setName(resultSet.getString(2));
            user.setAge(resultSet.getInt(3));

            return Response.status(Response.Status.OK).entity(ResponseData.getResponseData().setData(user)).build();
            
        } else {
            return Response.status(Response.Status.CONFLICT).entity(ResponseData.getResponseData().setError(ErrorData.getErrorData().setErrorCode("4044").setErrorMessage("User not found."))).build();
        }

=======
    
    @GET
    @Path("greeting")
    public String testGET(@QueryParam("name") String txt) {
        return "Test called GET! "+txt;
    }
    
    @GET
    @Path("/{name}")
    public String testGETPP(@PathParam("name") String txt) {
        return "Test called GET! "+txt;
>>>>>>> 189dfe63d0fb4b3e87c0c43e324ff56b13138d6d
    }

}
