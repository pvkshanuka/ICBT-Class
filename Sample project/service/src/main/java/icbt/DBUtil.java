/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icbt;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author emaly
 */
public class DBUtil {    
   
     
   public static boolean addUser(User user){
   
   Connection conn = null;
   Statement stmt = null;
   
   try{
           conn=ConnectonUtil.getInstance();
     
      stmt = conn.createStatement();
      String sql = "Insert into user(FN,LN) values ('"+user.getFname()+"','"+user.getLname()+"')";
      stmt.executeUpdate(sql);

      return true;
     
   }catch(SQLException se){
      //Handle errors for JDBC
      se.printStackTrace();
   }catch(Exception e){
      //Handle errors for Class.forName
      e.printStackTrace();
   }finally{
      //finally block used to close resources
      try{
         if(stmt!=null)
            conn.close();
      }catch(SQLException se){
      }// do nothing
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }//end finally try
   }//end try
   //System.out.println("Goodbye!");
    
    return false;
}
    

}
