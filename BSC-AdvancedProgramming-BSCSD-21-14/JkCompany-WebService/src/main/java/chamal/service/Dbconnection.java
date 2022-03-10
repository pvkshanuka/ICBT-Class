/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chamal.service;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author HP
 */
public class Dbconnection {
   static final String DB_URL = "jdbc:mysql://127.0.0.1:3305/JkCompany";
   static final String USER = "root";
   static final String PASS = "root";
        public static Connection GetconnectConnection()
    {
  
        Connection con=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
              con = DriverManager.getConnection(DB_URL, USER, PASS);
            //JOptionPane.showMessageDialog(null, "database connected");
        }
        catch(Exception ex){
            System.out.println("Error connecting"+ex);
        }
        return con;
    }
}
