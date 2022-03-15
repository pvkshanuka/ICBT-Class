/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.icbt.samplebackend.controllers;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 * @author Kusal Shanuka
 */
@Path("/main")
public class MainController {

    @GET
    public String test() {
        return "Test called!";
    }

}
