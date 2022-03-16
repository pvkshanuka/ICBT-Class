/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.icbt.samplebackend.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Kusal Shanuka
 */
public class DBConfig {
    
    private static Connection connection;
    
    public static void createDBConnection() throws Exception {
    
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/samplebackend","root","1234");
        
    }
    
    public static Connection getDBConnection() throws Exception {
        if (connection == null) {
            createDBConnection();
        }
        return connection;
    }
    
}
