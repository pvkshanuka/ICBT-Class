package com.mycompany.jkcompany.webclient;





import chamal.service.Branch;
import chamal.service.BranchProducts;
import chamal.service.Cart;
import chamal.service.Customers;
import chamal.service.Driver;
import chamal.service.HeadofficeProducts;
import chamal.service.MyWebService;
import chamal.service.MyWebService_Service;
import chamal.service.Stockrequest;
import chamal.service.User;
import chamal.service.Vehicle;
import java.io.IOException;
import java.util.List;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class Webhelper {
     public static User authenticate(String username, String password) {
        User authenticatedUser = null;

        //This should loaded from the DB
         MyWebService_Service client=new MyWebService_Service();          //auto generated class in the generated source code
         
         MyWebService proxy=client.getMyWebServicePort();  
         
        User user= proxy.getusers(username,password);

        //Authenticated the users password
        if (user!=null && password.equals(user.getPassword())) {
            authenticatedUser= user;
        }

        return authenticatedUser;
    }


    public static User authenticate(Cookie[] cookies, HttpSession session) {
        // Authenticate the user from cookie session
        User user = null;

        // Iterate all the cookies from the client request
        for (Cookie cookie : cookies) {
            // Checks SESID cookie
            if (cookie.getName().equals("SESID")) {                        
                // Lookup SESID cookie value from sessions
                Object sessionObj = session.getAttribute(cookie.getValue());

                // Load the user from session object if it exists
                if (sessionObj != null) {
                     user = (User)sessionObj;
                }
            }
        }
        return user;
    }

    public static void redirectToLogin(HttpServletResponse response) throws IOException{
        response.sendRedirect("UserLogin.jsp");
        
      
    }
    
      public static boolean addUser(User user){
   //     session.invalidate(); 
  MyWebService_Service client=new MyWebService_Service();          //auto generated class in the generated source code
         
         MyWebService proxy=client.getMyWebServicePort();  
         
        boolean success= proxy.addUser(user);
        
             return success;    
     }
    
      public static User checkUser(String username, int branchID){
      
      MyWebService_Service client=new MyWebService_Service();          //auto generated class in the generated source code
         
         MyWebService proxy=client.getMyWebServicePort();  
         
        User user= proxy.checkuser(username, branchID);
        
             return user;    
      
      }
   
          public static List<User> getallUsers()
     {      //method
         MyWebService_Service client=new MyWebService_Service();          //auto generated class in the generated source code
         
         MyWebService proxy=client.getMyWebServicePort();     
         
       List<User> user=  proxy.getallUsers();
       
        return user;
    }
       
     public static boolean deletUser(int id){
   //     session.invalidate(); 
  MyWebService_Service client=new MyWebService_Service();          //auto generated class in the generated source code
         
         MyWebService proxy=client.getMyWebServicePort();  
         
        boolean success= proxy.deleteUser(id);
        
             return success;    
     }
    
    
    
   public static boolean updateuser(User user){
   //     session.invalidate(); 
  MyWebService_Service client=new MyWebService_Service();          //auto generated class in the generated source code
         
         MyWebService proxy=client.getMyWebServicePort();  
         
        boolean success= proxy.updateUser(user);
        
             return success;    
     }
   
   public static boolean addBranch(Branch branch){
       MyWebService_Service client=new MyWebService_Service();          //auto generated class in the generated source code
         
         MyWebService proxy=client.getMyWebServicePort();  
         
       boolean success= proxy.addbranch(branch);
        
         return success;    
   }
   
   
       public static List<Branch> getbranches()
     {      //method
         MyWebService_Service client=new MyWebService_Service();          //auto generated class in the generated source code
         
         MyWebService proxy=client.getMyWebServicePort();     
         
       List<Branch> list=  proxy.getBranches();
       
        return list;
    }
       
             public static Branch  getonebranch(int id)
     {      //method
         MyWebService_Service client=new MyWebService_Service();          //auto generated class in the generated source code
         
         MyWebService proxy=client.getMyWebServicePort();     
         
       Branch branch=  proxy.getbranch(id);
       
        return branch;
    }
       
          public static boolean deleteBranch(int id){
       MyWebService_Service client=new MyWebService_Service();          //auto generated class in the generated source code
         
         MyWebService proxy=client.getMyWebServicePort();  
         
       boolean success= proxy.deletebranch(id);
        
         return success;    
   }
          
      
   public static boolean headofficeAddProducts(HeadofficeProducts products){
       MyWebService_Service client=new MyWebService_Service();          //auto generated class in the generated source code
         
         MyWebService proxy=client.getMyWebServicePort();  
         
       boolean success= proxy.addproduct(products);
        
         return success;    
   }
   
  public static List<HeadofficeProducts> getAllHeadofficeProducts()
     {      //method
         MyWebService_Service client=new MyWebService_Service();          //auto generated class in the generated source code
         
         MyWebService proxy=client.getMyWebServicePort();     
         
       List<HeadofficeProducts> list=  proxy.getheadofficeproducts();
       
        return list;
    }
  
  
    public static HeadofficeProducts getsingleHeadofficeProducts(int id)
     {      //method
         MyWebService_Service client=new MyWebService_Service();          //auto generated class in the generated source code
         
         MyWebService proxy=client.getMyWebServicePort();     
         
    HeadofficeProducts list=  proxy.getsingleHeadOfficeProduct(id);
       
        return list;
    }
  
       public static boolean deleteHeadofficeProduct(int id){
       MyWebService_Service client=new MyWebService_Service();          //auto generated class in the generated source code
         
         MyWebService proxy=client.getMyWebServicePort();  
         
      boolean success= proxy.deleteheadofficeproductsproduct(id);
        
        return success;    
   }
       
       
     public static List<BranchProducts>  getBranchProducts(int id)
     {      //method
         MyWebService_Service client=new MyWebService_Service();          //auto generated class in the generated source code
         
         MyWebService proxy=client.getMyWebServicePort();     
         
      List<BranchProducts> products=  proxy.getbranchProducts(id);
       
        return products;
    }
       
     
        public static boolean addRequest(Stockrequest request){
       MyWebService_Service client=new MyWebService_Service();          //auto generated class in the generated source code
         
         MyWebService proxy=client.getMyWebServicePort();  
         
      boolean success= proxy.makeStockRequest(request);
        
        return success;    
   }
        
       public static Stockrequest getrequest(int branchid, int productid)
     {      //method
         MyWebService_Service client=new MyWebService_Service();          //auto generated class in the generated source code
         
         MyWebService proxy=client.getMyWebServicePort();     
         
       Stockrequest request=  proxy.getStockRequest(branchid, productid);
       
        return request;
    }
       
         public static List<Stockrequest>  getpendingstockrequest()
     {      //method
         MyWebService_Service client=new MyWebService_Service();          //auto generated class in the generated source code
         
         MyWebService proxy=client.getMyWebServicePort();     
         
      List<Stockrequest> stock=  proxy.getpendingRequests();
       
        return stock;
    }
         
           public static List<Stockrequest>  getbranchRequest(int id)
     {      //method
         MyWebService_Service client=new MyWebService_Service();          //auto generated class in the generated source code
         
         MyWebService proxy=client.getMyWebServicePort();     
         
      List<Stockrequest> stock=  proxy.getbranchRequest(id);
       
        return stock;
    }
       
           public static BranchProducts  validatebranchProducts(int branchid, int headofficeproductid)
     {      //method
         MyWebService_Service client=new MyWebService_Service();          //auto generated class in the generated source code
         
         MyWebService proxy=client.getMyWebServicePort();     
         
        BranchProducts products=  proxy.validateBranchProducts(branchid,headofficeproductid);
       
        return products;
    }
      
           
          public static boolean updateStockrequest(int requestID,String accept){
       MyWebService_Service client=new MyWebService_Service();          //auto generated class in the generated source code
         
         MyWebService proxy=client.getMyWebServicePort();  
         
      boolean success= proxy.updateStockRequest(requestID, accept);
        
        return success;    
   }  
          
          public static boolean updateheadofficeStock(int prodid,int amount){
       MyWebService_Service client=new MyWebService_Service();          //auto generated class in the generated source code
         
         MyWebService proxy=client.getMyWebServicePort();  
         
      boolean success= proxy.updateHeadofficeStock(prodid, amount);
        
        return success;    
   }   
          
          
            public static boolean updatenewbranchStock(int branchid, int headid, int amount){
       MyWebService_Service client=new MyWebService_Service();          //auto generated class in the generated source code
         
         MyWebService proxy=client.getMyWebServicePort();  
         
     boolean success= proxy.updatebranchNewstock(branchid, headid, amount);
        
        return success;    
   }  
         
          
          
          
        public static int getstocksendingbranchID(String Name)
     {      //method
         MyWebService_Service client=new MyWebService_Service();          //auto generated class in the generated source code
         
         MyWebService proxy=client.getMyWebServicePort();     
         
      int id=  proxy.getStockSendingBranchID(Name);
       
        return id;
    }
        
            public static int getstocksendingbranchQuantiy(int branchid, int headid)
     {      //method
         MyWebService_Service client=new MyWebService_Service();          //auto generated class in the generated source code
         
         MyWebService proxy=client.getMyWebServicePort();     
         
      int id=  proxy.getStockSendingStockAmount(branchid, headid);
       
        return id;
    }
       
      public static boolean addBranchProducts(BranchProducts products){
       MyWebService_Service client=new MyWebService_Service();          //auto generated class in the generated source code
         
         MyWebService proxy=client.getMyWebServicePort();  
         
       boolean success= proxy.addbranchProduct(products);
        
         return success;    
   }        
      
   public static boolean updateStocksendingAmount(int branchid, int amount){
       MyWebService_Service client=new MyWebService_Service();          //auto generated class in the generated source code
         
         MyWebService proxy=client.getMyWebServicePort();  
         
       boolean success= proxy.updateStockSendingStockAmount(branchid, amount);
        
         return success;    
   }  
   
   
   
   
    public static boolean addCustomer(Customers customer){
       MyWebService_Service client=new MyWebService_Service();          //auto generated class in the generated source code
         
         MyWebService proxy=client.getMyWebServicePort();  
         
       boolean success= proxy.addCustomer(customer);
        
         return success;    
   } 
    
      public static Customers getCustomer(String name){
       MyWebService_Service client=new MyWebService_Service();          //auto generated class in the generated source code
         
         MyWebService proxy=client.getMyWebServicePort();  
         
       Customers customer= proxy.getCustomer(name);
        
         return customer;    
   }
      
        public static boolean addCart(Cart cart){
       MyWebService_Service client=new MyWebService_Service();          //auto generated class in the generated source code
         
         MyWebService proxy=client.getMyWebServicePort();  
         
       boolean success= proxy.addtoCart(cart);
        
         return success;    
   } 
    
        public static  Cart getCart(int brancid, int custid){
          MyWebService_Service client=new MyWebService_Service(); 
            
         MyWebService proxy=client.getMyWebServicePort();  
         
       Cart cart= proxy.getCart(brancid, custid);
        
         return cart;    
        
        }
        
        public static List<Cart>  getcustomercart(int id)
     {      //method
         MyWebService_Service client=new MyWebService_Service();          //auto generated class in the generated source code
         
         MyWebService proxy=client.getMyWebServicePort();     
         
      List<Cart> cart=  proxy.getCustomerCart(id);
       
        return cart;
    }
        
            public static boolean updateCart(int custid){
       MyWebService_Service client=new MyWebService_Service();          //auto generated class in the generated source code
         
         MyWebService proxy=client.getMyWebServicePort();  
         
       boolean success= proxy.updatecart(custid);
        
         return success;    
   }   
        
        
               public static List<Cart>  getbranchSales(int id)
     {      //method
         MyWebService_Service client=new MyWebService_Service();          //auto generated class in the generated source code
         
         MyWebService proxy=client.getMyWebServicePort();     
         
      List<Cart> cart=  proxy.getBranchSales(id);
       
        return cart;
    }
           
      public static boolean addDriver(Driver driver){
       MyWebService_Service client=new MyWebService_Service();          //auto generated class in the generated source code
         
         MyWebService proxy=client.getMyWebServicePort();  
         
       boolean success= proxy.addDriver(driver);
        
         return success;    
   }
      
      
                  public static List<Driver>  getallDrivers(int id)
     {      //method
         MyWebService_Service client=new MyWebService_Service();          //auto generated class in the generated source code
         
         MyWebService proxy=client.getMyWebServicePort();     
         
      List<Driver> driver=  proxy.getallDrivers(id);
       
        return driver;
    }
       
           public static boolean deleteDriver(int id){
       MyWebService_Service client=new MyWebService_Service();          //auto generated class in the generated source code
         
         MyWebService proxy=client.getMyWebServicePort();  
         
       boolean success= proxy.deleteDriver(id);
        
         return success;    
   }
                
   
        public static boolean addVehcile(Vehicle vehicle){
       MyWebService_Service client=new MyWebService_Service();          //auto generated class in the generated source code
         
         MyWebService proxy=client.getMyWebServicePort();  
         
       boolean success= proxy.addVehicle(vehicle);
        
         return success;    
   }
      
           
            public static List<Vehicle>  getallVehicles(int id)
     {      //method
         MyWebService_Service client=new MyWebService_Service();          //auto generated class in the generated source code
         
         MyWebService proxy=client.getMyWebServicePort();     
         
      List<Vehicle> vehicle=  proxy.getallvehicles(id);
       
        return vehicle;
    }        
               
      
          public static boolean deleteVehcile(int id){
       MyWebService_Service client=new MyWebService_Service();          //auto generated class in the generated source code
         
         MyWebService proxy=client.getMyWebServicePort();  
         
       boolean success= proxy.deleteDriver(id);
        
         return success;    
   }
          
          
   
          /**sending email*/
      
          /*
         public static  boolean  alertByEmail(String emailMessage){
        try{
                     
            final String fromEmail = "nandanaandsons@gmail.com";
            final String password = "1234AX!m"; //fromEmail password 
            final String toEmail = "chamal.peiris3g@gmail.com";
            System.out.println("Email configuration code start");
            Properties props = new Properties();
            props.put("mail.smtp.host", "smtp.gmail.com"); //SMTP Host set by default this
            props.put("mail.smtp.port", "587"); //TLS Port you can use 465 insted of 587
            props.put("mail.smtp.auth", "true"); //enable authentication
            props.put("mail.smtp.starttls.enable", "true"); //enable STARTTLS
            //create Authenticator object to pass in Session.getInstance argument
            Authenticator auth = new Authenticator() 
            {           
             protected PasswordAuthentication getPasswordAuthentication() 
                {
                        return new PasswordAuthentication(fromEmail, password);
                }
            };
                        Session session = Session.getInstance(props, auth);
            
                        MimeMessage message = new MimeMessage(session);
                        message.setFrom(new InternetAddress(fromEmail));
                        message.addRecipient(Message.RecipientType.TO, new 
                                                              InternetAddress(toEmail));
                        message.setSubject("ALERT");
                        message.setText(emailMessage);//here you can write a msg what you want to send... just remove String parameter in alertByEmail method oherwise call parameter
                        System.out.println("text:"+emailMessage);
                        Transport.send(message);//here mail sending process start.
                        System.out.println("Mail Sent Successfully");
                        
                        return true;
        }
        catch(Exception ex)
        {
                        System.out.println("Mail fail");
                        System.out.println(ex);
        }
        return false;
        
        } 
          
          
          
         */ 
          
          
          
          
}
