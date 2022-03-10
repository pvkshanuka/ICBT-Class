package test;


import icbt.Test;
import icbt.Test_Service;
import icbt.User;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author emaly
 */
public class WebHelper {
     public static boolean addUser(User user){
    
        Test_Service  client= new Test_Service();
        Test proxy=client.getTestPort();
        boolean  success=proxy.addUser(user);
        return success;
        
    } 
     
//        public static User getUser(String fname){
//    
//        Test_Service  client= new Test_Service();
//        Test proxy=client.getTestPort();
//        User user =proxy.getUser(fname);
//        return user;
       
 
        
    
}
