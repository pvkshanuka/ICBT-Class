package chamal.service;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class DbUtil {
  // JDBC driver name and database URL
   
  /* static final String DB_URL = "jdbc:mysql://127.0.0.1:3305/JkCompany";
   static final String USER = "root";
   static final String PASS = "root";*/
   
   /*
   public static List<user> getUsers() {
   List<user> users= new ArrayList<>();
   Connection conn = null;
   Statement stmt = null;
   try{
     
      Class.forName("com.mysql.jdbc.Driver");
      conn = DriverManager.getConnection(DB_URL, USER, PASS);
      System.out.println("Creating statement...");
      stmt = conn.createStatement();
      String sql = "SELECT * FROM users";
      ResultSet rs = stmt.executeQuery(sql);
      while(rs.next()){        
         user user=new user();
         user.setUsername(rs.getString("username"));
         user.setFname(rs.getString("first_name"));
         user.setLname(rs.getString("last_name"));
         user.setPassword(rs.getString("password"));
         user.setIs_Branch(rs.getString("password"));
         users.add(user);
      }
      rs.close();
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
   
   return users;
}//end main
   */
  
   public static user getUser(String username,String password) {
            user user= null;
           Connection conn = null;
           Statement stmt = null;
           try{

             //Class.forName("com.mysql.jdbc.Driver");
             // conn = DriverManager.getConnection(DB_URL, USER, PASS);
               conn=Dbconnection.GetconnectConnection();
              stmt = conn.createStatement();
              String sql = "SELECT * from Users WHERE Username='"+username+"' And Password='"+password+"'";
              ResultSet rs = stmt.executeQuery(sql);
              while(rs.next()){        
              user =new user();
                user.setUserID(rs.getInt("UserID"));
                user.setUsername(rs.getString("Username"));
                user.setFname(rs.getString("Firstname"));
                user.setLname(rs.getString("Lastname"));
                user.setPassword(rs.getString("Password"));
                user.setBranch_ID(rs.getInt("Branch_ID"));

              }
              rs.close();
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

           return user;
}//end main
  
public static boolean updateUser(user user){
   
   Connection conn = null;  //instantiating an object
   Statement stmt = null;
   
   try{
     
       conn=Dbconnection.GetconnectConnection(); //getting the connection
     
      stmt = conn.createStatement();
      String sql = "update users set Username='"+user.getUsername()+"',Firstname='"+user.getFname()+"',Lastname='"+user.getLname()+"',Password='"+user.getPassword()+"',Branch_ID='"+user.getBranch_ID()+"' where UserID='"+user.getUserID()+"';";
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

public static boolean addUser(user user){
   
   Connection conn = null;
   Statement stmt = null;
   
   try{
           conn=Dbconnection.GetconnectConnection();
     
      stmt = conn.createStatement();
      String sql = "Insert into users(Username,Firstname,Lastname,Password,Branch_ID) values ('"+user.getUsername()+"','"+user.getFname()+"','"+user.getLname()+"','"+user.getPassword()+"','"+user.getBranch_ID()+"')";
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


 public static user checkuser(String username, int branchID) {
 
   Connection conn = null;
   Statement stmt = null;
   user user=null;
   try{
     
      conn=Dbconnection.GetconnectConnection();
     
      stmt = conn.createStatement();
          String sql = "SELECT * from Users WHERE Username='"+username+"' And Branch_ID='"+branchID+"'";
              ResultSet rs = stmt.executeQuery(sql);
              while(rs.next()){        
              user =new user();
                user.setUserID(rs.getInt("UserID"));
                user.setUsername(rs.getString("Username"));
                user.setFname(rs.getString("Firstname"));
                user.setLname(rs.getString("Lastname"));
                user.setPassword(rs.getString("Password"));
                user.setBranch_ID(rs.getInt("Branch_ID"));

              }
      rs.close();
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
   
   return user;
}//end main
   


 public static List<user> getusers() {
   List<user> users= new ArrayList<>();
   Connection conn = null;
   Statement stmt = null;
   try{
     
      conn=Dbconnection.GetconnectConnection();
     
      stmt = conn.createStatement();
      String sql = "SELECT * FROM users";
      ResultSet rs = stmt.executeQuery(sql);
      while(rs.next()){   
          user user= new user();
         user.setUserID(rs.getInt("UserID"));
                user.setUsername(rs.getString("Username"));
                user.setFname(rs.getString("Firstname"));
                user.setLname(rs.getString("Lastname"));
                user.setPassword(rs.getString("Password"));
                user.setBranch_ID(rs.getInt("Branch_ID"));
        users.add(user);
      }
      rs.close();
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
   
   return users;
}//end main



public static boolean deleteUser(int id){
   
   Connection conn = null;
   Statement stmt = null;
   
   try{
           conn=Dbconnection.GetconnectConnection();
     
      stmt = conn.createStatement();
      String sql = "Delete From users where UserID='"+id+"'";
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
  








public static boolean addBranch(branch branch){
   
   Connection conn = null;
   Statement stmt = null;
   
   try{
          conn=Dbconnection.GetconnectConnection();
     
      stmt = conn.createStatement();
      String sql = "Insert into branch(Location,Branch_Type) values ('"+branch.getLocation()+"','"+branch.getBranch_Type()+"')";
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
   
   public static List<branch> getBranch() {
   List<branch> branch= new ArrayList<>();
   Connection conn = null;
   Statement stmt = null;
   try{
     
     conn=Dbconnection.GetconnectConnection();
     
      stmt = conn.createStatement();
      String sql = "SELECT * FROM branch";
      ResultSet rs = stmt.executeQuery(sql);
      while(rs.next()){        
         branch obj= new branch();
         obj.setBranchId(rs.getInt("Branch_ID"));
         obj.setLocation(rs.getString("Location"));
         obj.setBranch_Type(rs.getString("Branch_Type"));
        branch.add(obj);
      }
      rs.close();
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
   
   return branch;
}//end main
   
  public static branch getoneBranch(int id) {
 
   Connection conn = null;
   Statement stmt = null;
   branch branch=null;
   try{
     
      conn=Dbconnection.GetconnectConnection();
     
      stmt = conn.createStatement();
      String sql = "SELECT * FROM branch where Branch_ID='"+id+"'";
      ResultSet rs = stmt.executeQuery(sql);
      while(rs.next()){        
         branch= new branch();
         branch.setBranchId(rs.getInt("Branch_ID"));
         branch.setLocation(rs.getString("Location"));
         branch.setBranch_Type(rs.getString("Branch_Type"));
      
      }
      rs.close();
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
   
   return branch;
}//end main
   



public static boolean deleteBranch(int id){
   
   Connection conn = null;
   Statement stmt = null;
   
   try{
           conn=Dbconnection.GetconnectConnection();
     
      stmt = conn.createStatement();
      String sql = "Delete From branch where Branch_ID='"+id+"'";
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
  

public static boolean addProduct(headoffice_products product){
   
   Connection conn = null;
   Statement stmt = null;
   
   try{
            conn=Dbconnection.GetconnectConnection();
      stmt = conn.createStatement();
      String sql = "Insert into headoffice_products(Product_Name,Price,Quantity) values ('"+product.getHeadofficeproduct_name()+"','"+product.getHeadofficeproduct_price()+"','"+product.getHeadofficeproduct_quantity()+"')";
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

public static boolean addBranchProduct(branch_products products){
   
   Connection conn = null;
   Statement stmt = null;
   
   try{
            conn=Dbconnection.GetconnectConnection();
     
      stmt = conn.createStatement();
      String sql = "Insert into branch_products(Product_Name,Price,Quantity,Headofficeproduct_ID,Branch_ID) values ('"+products.getProductName()+"','"+products.getPrice()+"','"+products.getQuantity()+"','"+products.getHeadofficeproduct_ID()+"','"+products.getBranch_ID()+"')";
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


    public static List<headoffice_products> getAllHeadofficeProducts() {
   List<headoffice_products> products= new ArrayList<>();
   Connection conn = null;
   Statement stmt = null;
   try{
     
       conn=Dbconnection.GetconnectConnection();
     
      stmt = conn.createStatement();
      String sql = "SELECT * FROM headoffice_products";
      ResultSet rs = stmt.executeQuery(sql);
      while(rs.next()){        
        headoffice_products obj= new headoffice_products();
         obj.setHeadoffice_prodctID(rs.getInt("Product_ID"));
         obj.setHeadofficeproduct_name(rs.getString("Product_Name"));
         obj.setHeadofficeproduct_price(rs.getInt("Price"));
         obj.setHeadofficeproduct_quantity(rs.getInt("Quantity"));
           products.add(obj);
      }
      rs.close();
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
   
   return products;
}//end main
    
  
public static headoffice_products getsingleheadofficeproduct(int productID) {
 
   Connection conn = null;
   Statement stmt = null;
   headoffice_products product =null;
   try{
     
      conn=Dbconnection.GetconnectConnection();
     
      stmt = conn.createStatement();
      String sql = "SELECT * FROM headoffice_products where Product_ID='"+productID+"'";
      ResultSet rs = stmt.executeQuery(sql);
      while(rs.next()){        
        product= new headoffice_products();
         product.setHeadoffice_prodctID(rs.getInt("Product_ID"));
         product.setHeadofficeproduct_name(rs.getString("Product_Name"));
          product.setHeadofficeproduct_price(rs.getInt("Price"));
          product.setHeadofficeproduct_quantity(rs.getInt("Quantity"));
     
      }
      rs.close();
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
   
   return product;
}//end mai    
    
    
    
    
    
    
    
    
    
    
    public static boolean deleteheadofficeproduct(int id){
   
   Connection conn = null;
   Statement stmt = null;
   
   try{
           conn=Dbconnection.GetconnectConnection();
     
      stmt = conn.createStatement();
      String sql = "Delete From headoffice_products where Product_ID='"+id+"'";
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
  
      
  public static List<branch_products> getbranchProducts(int id) {
 
    List<branch_products> products= new ArrayList<>();
   Connection conn = null;
   Statement stmt = null;
  
   try{
     
      conn=Dbconnection.GetconnectConnection();
     
      stmt = conn.createStatement();
      String sql = "SELECT * FROM branch_products where Branch_ID='"+id+"'";
      ResultSet rs = stmt.executeQuery(sql);
      while(rs.next()){        
        branch_products branchproducts= new branch_products();
        branchproducts.setBranchproduct_ID(rs.getInt("Product_ID"));
       branchproducts.setProductName(rs.getString("Product_Name"));
        branchproducts.setPrice(rs.getInt("Price"));
        branchproducts.setQuantity(rs.getInt("Quantity"));
        branchproducts.setHeadofficeproduct_ID(rs.getInt("Headofficeproduct_ID"));
        branchproducts.setBranch_ID(rs.getInt("Branch_ID"));
        products.add(branchproducts);
      }
      rs.close();
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
   
   return products;
}//end main
    
  
 public static branch_products validatebranchProducts(int branchid, int product_id) {
 
   Connection conn = null;
   Statement stmt = null;
   branch_products products =null;
   try{
     
     conn=Dbconnection.GetconnectConnection();
     
      stmt = conn.createStatement();
      String sql = "SELECT * FROM branch_products where Branch_ID='"+branchid+"'And Headofficeproduct_ID='"+product_id+"'";
      ResultSet rs = stmt.executeQuery(sql);
      while(rs.next()){        
         products= new branch_products();
         products.setBranchproduct_ID(rs.getInt("Product_ID"));
         products.setProductName(rs.getString("Product_Name"));
         products.setPrice(rs.getInt("Price"));
         products.setQuantity(rs.getInt("Quantity"));
          products.setHeadofficeproduct_ID(rs.getInt("Headofficeproduct_ID"));
          products.setBranch_ID(rs.getInt("Branch_ID"));
      
      }
      rs.close();
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
   
   return products;
}//end mai
   
  
    
  
  public static boolean addStockRequest(stockrequest request){
   
   Connection conn = null;
   Statement stmt = null;
   
   try{
           conn=Dbconnection.GetconnectConnection();
     
      stmt = conn.createStatement();
      String sql = "Insert into stock_requests(Date,Accepted_By,Quantity,Branch_ID,Product_ID) values ('"+request.getDate()+"','"+request.getAccepted_branch()+"','"+request.getQuantity()+"','"+request.getBranch_Id()+"','"+request.getHeadofficeproduct_Id()+"')";
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

  public static stockrequest getstockrequest(int branchid, int product_id) {
 
   Connection conn = null;
   Statement stmt = null;
   stockrequest request =null;
   try{
     
       conn=Dbconnection.GetconnectConnection();
      stmt = conn.createStatement();
      String sql = "SELECT * FROM stock_requests where Branch_ID='"+branchid+"'And Product_ID='"+product_id+"'";
      ResultSet rs = stmt.executeQuery(sql);
      while(rs.next()){        
         request= new stockrequest();
         request.setRequest_ID(rs.getInt("Request_ID"));
         request.setDate(rs.getString("Date"));
         request.setAccepted_branch(rs.getString("Accepted_By"));
          request.setQuantity(rs.getInt("Quantity"));
           request.setBranch_Id(rs.getInt("Branch_ID"));
            request.setHeadofficeproduct_Id(rs.getInt("Product_ID"));
      
      }
      rs.close();
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
   
   return request;
}//end mai
  
  
   public static int getStockSendingBranchID(String Name) {
 
   Connection conn = null;
   Statement stmt = null;
   int id=0;
   try{
     
       conn=Dbconnection.GetconnectConnection();
     
      stmt = conn.createStatement();
      String sql = "SELECT Branch_ID FROM branch where Location='"+Name+"'";
      ResultSet rs = stmt.executeQuery(sql);
      while(rs.next()){        
        
      id=rs.getInt("Branch_ID");
      }
      rs.close();
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
   
   return id;
}//end mai
  
   
    public static int getStockSendingbranchStockamount(int id,int headofficeprodid) {
 
   Connection conn = null;
   Statement stmt = null;
   int amount=0;
   try{
     
       conn=Dbconnection.GetconnectConnection();
     
      stmt = conn.createStatement();
      String sql = "SELECT Quantity FROM branch_products where Branch_ID='"+id+"'And Headofficeproduct_ID='"+headofficeprodid+"'";
      ResultSet rs = stmt.executeQuery(sql);
      while(rs.next()){        
        
      amount=rs.getInt("Quantity");
      }
      rs.close();
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
   
   return amount;
}//end mai 
  
    
    
   public static int getStockrecievingbranchAmount(int id) {
 
   Connection conn = null;
   Statement stmt = null;
   int amount=0;
   try{
     
      conn=Dbconnection.GetconnectConnection();
     
      stmt = conn.createStatement();
      String sql = "SELECT Quantity FROM branch_products where Branch_ID='"+id+"'";
      ResultSet rs = stmt.executeQuery(sql);
      while(rs.next()){        
        
      amount=rs.getInt("Quantity");
      }
      rs.close();
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
   
   return id;
}//end mai 
   
   
  
  
  
  
  
  
 
  
  
  public static List<stockrequest> getpendingrequest() {
 
    List<stockrequest> request= new ArrayList<>();
   Connection conn = null;
   Statement stmt = null;
  
   try{
     
    conn=Dbconnection.GetconnectConnection();
     
      stmt = conn.createStatement();
      String sql = "SELECT * FROM stock_requests where Accepted_By='Request still not accepted'";
      ResultSet rs = stmt.executeQuery(sql);
      while(rs.next()){        
        stockrequest requests= new stockrequest();
        requests.setRequest_ID(rs.getInt("Request_ID"));
        requests.setDate(rs.getString("Date"));
        requests.setAccepted_branch(rs.getString("Accepted_By"));
        requests.setQuantity(rs.getInt("Quantity"));
        requests.setBranch_Id(rs.getInt("Branch_ID"));
        requests.setHeadofficeproduct_Id(rs.getInt("Product_ID"));
        request.add(requests);
      }
      rs.close();
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
   
   return request;
}//end main
  
  public static List<stockrequest> getbranchRequest(int id) {
 
    List<stockrequest> request= new ArrayList<>();
   Connection conn = null;
   Statement stmt = null;
  
   try{
     
      conn=Dbconnection.GetconnectConnection();
     
      stmt = conn.createStatement();
      String sql = "SELECT * FROM stock_requests where Branch_ID='"+id+"'";
      ResultSet rs = stmt.executeQuery(sql);
      while(rs.next()){        
        stockrequest requests= new stockrequest();
        requests.setRequest_ID(rs.getInt("Request_ID"));
        requests.setDate(rs.getString("Date"));
        requests.setAccepted_branch(rs.getString("Accepted_By"));
        requests.setQuantity(rs.getInt("Quantity"));
        requests.setBranch_Id(rs.getInt("Branch_ID"));
        requests.setHeadofficeproduct_Id(rs.getInt("Product_ID"));
        request.add(requests);
      }
      rs.close();
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
   
   return request;
}//end main 
  
  
  
  
  
  
  
  
  
  
    
 public static boolean updateStcockRequets(int requestID, String accept){
   
   Connection conn = null;
   Statement stmt = null;
   
   try{
     
     conn=Dbconnection.GetconnectConnection();
     
      stmt = conn.createStatement();
      String sql = "update stock_requests set Accepted_By='"+accept+"' where Request_ID='"+requestID+"';";
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
  
  public static boolean updatestocksendingamount(int branchID, int amount){
   
   Connection conn = null;
   Statement stmt = null;
   
   try{
     
      conn=Dbconnection.GetconnectConnection();
     
      stmt = conn.createStatement();
      String sql = "update branch_products set Quantity='"+amount+"' where Branch_ID='"+branchID+"';";
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
 
 
   public static boolean headofficestockAmount(int productID, int amount){
   
   Connection conn = null;
   Statement stmt = null;
   
   try{
     
      conn=Dbconnection.GetconnectConnection();
     
      stmt = conn.createStatement();
      String sql = "update headoffice_products set Quantity='"+amount+"' where Product_ID='"+productID+"';";
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
 
   
   
   public static boolean updatebranchnewstock(int branchid, int headid, int amount){
   
   Connection conn = null;
   Statement stmt = null;
   
   try{
     
        conn=Dbconnection.GetconnectConnection();
     
      stmt = conn.createStatement();
      String sql = "update branch_products set Quantity='"+amount+"' where Headofficeproduct_ID='"+headid+"' And Branch_ID='"+branchid+"';";
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
 
 public static boolean addCustomer(customers customer){
   
   Connection conn = null;
   Statement stmt = null;
   
   try{
       conn=Dbconnection.GetconnectConnection();
     
      stmt = conn.createStatement();
      String sql = "Insert into customers(First_Name,Last_Name,Email,Contact_No) values ('"+customer.getFname()+"','"+customer.getLname()+"','"+customer.getEmail()+"','"+customer.getContact()+"')";
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
  
 public static customers getcustomer(String fname) {
 
   Connection conn = null;
   Statement stmt = null;
  customers customer =null;
   try{
     
     conn=Dbconnection.GetconnectConnection();
     
      stmt = conn.createStatement();
      String sql = "SELECT * FROM customers where First_Name='"+fname+"'";
      ResultSet rs = stmt.executeQuery(sql);
      while(rs.next()){        
         customer= new customers();
          customer.setCustomer_Id(rs.getInt("Customer_ID"));
          customer.setFname(rs.getString("First_Name"));
         customer.setLname(rs.getString("Last_Name"));
          customer.setEmail(rs.getString("Email"));
          customer.setContact(rs.getString("Contact_No"));
          
      
      }
      rs.close();
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
   
   return customer;
}//en
 


public static boolean addtoCart(cart product){
   
   Connection conn = null;
   Statement stmt = null;
   
   try{ 
       conn=Dbconnection.GetconnectConnection();
     
      stmt = conn.createStatement();
      String sql = "Insert into cart(Product_Name,Price,Quantity,Date,BranchProduct_ID,Customer_ID,Order_Status,Branch_ID) values ('"+product.getProduct_Name()+"','"+product.getPrice()+"','"+product.getQuantity()+"','"+product.getDate()+"','"+product.getBranchProduct_ID()+"','"+product.getCustomer_Id()+"','"+product.getOrder_status()+"','"+product.getBranch_ID()+"')";
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
 


public static cart getCart(int branchid, int customerId) {
 
   Connection conn = null;
   Statement stmt = null;
   cart products =null;
   try{
     
     conn=Dbconnection.GetconnectConnection();
     
      stmt = conn.createStatement();
      String sql = "SELECT * FROM cart where BranchProduct_ID='"+branchid+"'And Customer_ID='"+customerId+"'";
      ResultSet rs = stmt.executeQuery(sql);
      while(rs.next()){        
         products= new cart();
         products.setCart_Id(rs.getInt("Cart_ID"));
         products.setProduct_Name(rs.getString("Product_Name"));
         products.setPrice(rs.getInt("Price"));
         products.setQuantity(rs.getInt("Quantity"));
          products.setDate(rs.getString("Date"));
          products.setBranchProduct_ID(rs.getInt("BranchProduct_ID"));
          products.setCustomer_Id(rs.getInt("Customer_ID"));
          products.setOrder_status(rs.getString("Order_Status"));
          products.setBranch_ID(rs.getInt("Branch_ID"));
      
      }
      rs.close();
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
   
   return products;
}//end mai
   
   public static List<cart> getcustomerCart(int customerID) {
   List<cart> cart= new ArrayList<>();
   Connection conn = null;
   Statement stmt = null;
   try{
     String stat="Added To Cart";
       conn=Dbconnection.GetconnectConnection();
     
      stmt = conn.createStatement();
      String sql = "SELECT * FROM cart where Customer_ID='"+customerID+"'And Order_Status='"+stat+"'";
      ResultSet rs = stmt.executeQuery(sql);
      while(rs.next()){        
        cart obj= new cart();
         obj.setCart_Id(rs.getInt("Cart_ID"));
         obj.setProduct_Name(rs.getString("Product_Name"));
         obj.setPrice(rs.getInt("Price"));
         obj.setQuantity(rs.getInt("Quantity"));
         obj.setDate(rs.getString("Date"));
         obj.setBranchProduct_ID(rs.getInt("BranchProduct_ID"));
         obj.setCustomer_Id(rs.getInt("Customer_ID"));
         obj.setOrder_status(rs.getString("Order_Status"));
         obj.setBranch_ID(rs.getInt("Branch_ID"));
           cart.add(obj);
      }
      rs.close();
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
   
   return cart;
}//end main
    

public static boolean updateCart(int custid){
   
   Connection conn = null;
   Statement stmt = null;
   
   try{
     
      conn=Dbconnection.GetconnectConnection();

    String stat="Transaction Completed Successfully";
    
     
     
      stmt = conn.createStatement();
      String sql = "update cart set Order_Status='"+stat+"' where Customer_ID='"+custid+"';";
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



    public static List<cart> getBranchsales(int branchID) {
   List<cart> products= new ArrayList<>();
   Connection conn = null;
   Statement stmt = null;
   try{
       String stat="Transaction Completed Successfully";
    
      conn=Dbconnection.GetconnectConnection();
     
      stmt = conn.createStatement();
      String sql = "SELECT * FROM cart where Branch_ID='"+branchID+"'And Order_Status='"+stat+"'";
      ResultSet rs = stmt.executeQuery(sql);
      while(rs.next()){        
        cart obj=new cart();
        obj.setCart_Id(rs.getInt("Cart_ID"));
         obj.setProduct_Name(rs.getString("Product_Name"));
         obj.setPrice(rs.getInt("Price"));
         obj.setQuantity(rs.getInt("Quantity"));
         obj.setDate(rs.getString("Date"));
         obj.setBranchProduct_ID(rs.getInt("BranchProduct_ID"));
         obj.setCustomer_Id(rs.getInt("Customer_ID"));
         obj.setOrder_status(rs.getString("Order_Status"));
         obj.setBranch_ID(rs.getInt("Branch_ID"));
           
           products.add(obj);
      }
      rs.close();
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
   
   return products;
}//end main
    
    
 public static boolean addDriver(driver driver){
   
   Connection conn = null;
   Statement stmt = null;
   
   try{
           conn=Dbconnection.GetconnectConnection();
     
      stmt = conn.createStatement();
      String sql = "Insert into driver(First_Name,Last_Name,Email,Branch_ID) values ('"+driver.getFname()+"','"+driver.getLname()+"','"+driver.getEmail()+"','"+driver.getBranch_ID()+"')";
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
    
    
  public static List<driver> getAllDrivers(int id) {
   List<driver> drivers= new ArrayList<>();
   Connection conn = null;
   Statement stmt = null;
   try{
     
       conn=Dbconnection.GetconnectConnection();
     
      stmt = conn.createStatement();
      String sql = "SELECT * FROM driver where Branch_ID='"+id+"'";
      ResultSet rs = stmt.executeQuery(sql);
      while(rs.next()){        
        driver obj= new driver();
         obj.setDriver_ID(rs.getInt("Driver_ID"));
         obj.setFname(rs.getString("First_Name"));
         obj.setLname(rs.getString("Last_Name"));
         obj.setEmail(rs.getString("Email"));
         obj.setBranch_ID(rs.getInt("Branch_ID"));
         
           drivers.add(obj);
      }
      rs.close();
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
   
   return drivers;
}//   
    

  public static boolean deleteDriver(int id){
   
   Connection conn = null;
   Statement stmt = null;
   
   try{
           conn=Dbconnection.GetconnectConnection();
     
      stmt = conn.createStatement();
      String sql = "Delete From driver where Driver_ID='"+id+"'";
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
  

    public static boolean addehicle(vehicle vehicle){
   
   Connection conn = null;
   Statement stmt = null;
   
   try{
           conn=Dbconnection.GetconnectConnection();
     
      stmt = conn.createStatement();
      String sql = "Insert into vehicle(Vehicle_No,Branch_ID) values ('"+vehicle.getVehicle_no()+"','"+vehicle.getBranch_ID()+"')";
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
    
  public static List<vehicle> getAllVehicles(int id) {
   List<vehicle> vehcile= new ArrayList<>();
   Connection conn = null;
   Statement stmt = null;
   try{
     
       conn=Dbconnection.GetconnectConnection();
     
      stmt = conn.createStatement();
      String sql = "SELECT * FROM vehicle where Branch_ID='"+id+"'";
      ResultSet rs = stmt.executeQuery(sql);
      while(rs.next()){        
       vehicle obj= new vehicle();
         obj.setVehicle_ID(rs.getInt("Vehicle_ID"));
         obj.setVehicle_no(rs.getString("Vehicle_No"));
         obj.setBranch_ID(rs.getInt("Branch_ID"));
        
         
           vehcile.add(obj);
      }
      rs.close();
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
   
   return vehcile;
}//   
    
    
    public static boolean deleteVehcile(int id){
   
   Connection conn = null;
   Statement stmt = null;
   
   try{
           conn=Dbconnection.GetconnectConnection();
     
      stmt = conn.createStatement();
      String sql = "Delete From vehicle where Vehicle_ID='"+id+"'";
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
