/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chamal.service;

import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author HP
 */
@WebService(serviceName = "myWebService")
public class myWebService {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    //for users
   
     @WebMethod(operationName = "getusers")
    public user getusers(@WebParam(name = "username") String username, String password) {
        
        user user= DbUtil.getUser(username,password);
     
        return user;
    }
  
        @WebMethod(operationName = "checkuser")
    public user checkuser(@WebParam(name = "checkuser") String username, int branchid) {
        
        user user=DbUtil.checkuser(username, branchid);
      // insert to db
        return user;
    }
    
       @WebMethod(operationName = "addUser")
    public boolean addUser(@WebParam(name = "addUser") user user) {
        
        boolean success=DbUtil.addUser(user);
      // insert to db
        return success;
    }
    
   
       @WebMethod(operationName = "updateUser")
    public boolean updateUser(@WebParam(name = "st") user user) {
        
        boolean valid= DbUtil.updateUser(user);
       
        return valid;
    }
    
    @WebMethod(operationName = "getallUsers")
    public  List<user> getallUsers() {
        
        List<user> user=DbUtil.getusers();      //getting from db
              
    // user user= new user("admin","chamal", "peiris", "123");
  
        return user;
         
    }
    
       @WebMethod(operationName = "deleteUser")
    public boolean deleteUser(@WebParam(name = "deleteUser") int id) {
        
       
        boolean success=DbUtil.deleteUser(id);
        
        return success;
    }
    
      @WebMethod(operationName = "addbranch")
    public boolean addBranch(@WebParam(name = "adbranch") branch branch) {
        
     boolean valid= DbUtil.addBranch(branch);
       
        return valid;
    }
         @WebMethod(operationName = "getbranch")
    public branch getBranch(@WebParam(name = "getbranch") int id) {
        
    branch branch= DbUtil.getoneBranch(id);
       
        return branch;
    }
    
        @WebMethod(operationName = "getBranches")
    public  List<branch> getBranches() {
        
        List<branch> branch=DbUtil.getBranch();      //getting from db
              
    // user user= new user("admin","chamal", "peiris", "123");
  
        return branch;
         
    }
    
        @WebMethod(operationName = "deletebranch")
    public boolean deleteBranch(@WebParam(name = "id") int id) {
        
       boolean valid=DbUtil.deleteBranch(id);
        
        
        return valid;
    }
    
    
    
    
     @WebMethod(operationName = "addproduct")
    public boolean addProduct(@WebParam(name = "addproduct") headoffice_products product) {
        
     boolean valid= DbUtil.addProduct(product);
       
        return valid;
    }
       
    @WebMethod(operationName = "getheadofficeproducts")
    public  List<headoffice_products> getHeadOfficeProducts() {
        
        List<headoffice_products> products=DbUtil.getAllHeadofficeProducts();      //getting from db
              
    // user user= new user("admin","chamal", "peiris", "123");
  
        return products;
         
    }
    
         @WebMethod(operationName = "getsingleHeadOfficeProduct")
    public headoffice_products getsingleHeadOfficeProduct(@WebParam(name = "getsingleHeadOfficeProduct") int id) {
        
   headoffice_products products= DbUtil.getsingleheadofficeproduct(id);
       
        return products;
    }
    
    
    
    
            @WebMethod(operationName = "updateHeadofficeStock")
    public boolean updateHeadofficeStock(@WebParam(name = "updateHeadofficeStock") int prodid,int amount) {
        
        boolean valid= DbUtil.headofficestockAmount(prodid,amount);
       
        return valid;
    }
    
    
           @WebMethod(operationName = "deleteheadofficeproductsproduct")
    public boolean deleteHeadOfficeProduct(@WebParam(name = "id") int id) {
        
       boolean valid=DbUtil.deleteheadofficeproduct(id);
        
        
        return valid;
    }
    
    
    
    
    
    
        @WebMethod(operationName = "addbranchProduct")
    public boolean addbranchProduct(@WebParam(name = "addbranchProduct") branch_products products) {
        
     boolean valid= DbUtil.addBranchProduct(products);
       
        return valid;
    }
     @WebMethod(operationName = "getbranchProducts")
    public List<branch_products> getbranchProducts(@WebParam(name = "getbranch") int id) {
        
   List<branch_products> products= DbUtil.getbranchProducts(id);
       
        return products;
    }
    
    
          @WebMethod(operationName = "updatebranchNewstock")
    public boolean updatebranchNewstock(@WebParam(name = "updatebranchNewstock") int branchid, int headid, int amount) {
        
        boolean valid= DbUtil.updatebranchnewstock(branchid, headid, amount);
       
        return valid;
    }
    
    
        @WebMethod(operationName = "makeStockRequest")
    public boolean makeStockRequest(@WebParam(name = "makeStockRequest") stockrequest request) {
        
        boolean valid= DbUtil.addStockRequest(request);
       
        return valid;
    }
    
          @WebMethod(operationName = "getStockRequest")
    public stockrequest getStockRequest(@WebParam(name = "getStockRequest") int branchid, int product_id) {
        
        stockrequest request= DbUtil.getstockrequest(branchid, product_id);
       
        return request;
                
    }
    
       @WebMethod(operationName = "getpendingRequests")
    public List<stockrequest> getpendingRequest() {
        
   List<stockrequest> request= DbUtil.getpendingrequest();
       
        return request;
    }
    
        @WebMethod(operationName = "getbranchRequest")
    public List<stockrequest> getbranchRequest(@WebParam(name = "getbranchRequest") int id) {
        
   List<stockrequest> request= DbUtil.getbranchRequest(id);
       
        return request;
    }
    
    
    
         @WebMethod(operationName = "validateBranchProducts")
    public branch_products validateBranchProducts(@WebParam(name = "validateBranchProducts") int branchid, int headofficeproductID) {
        
   branch_products products= DbUtil.validatebranchProducts(branchid, headofficeproductID);
       
        return products;
    }
    
    
    
   
    
          @WebMethod(operationName = "getStockSendingBranchID")
    public int getStockSendingBranchID(@WebParam(name = "getStockSendingBranchID") String name) {
        
        int id= DbUtil.getStockSendingBranchID(name);
       
        return id;
    }
    
            @WebMethod(operationName = "getStockSendingStockAmount")
    public int getStockSendingStockAmount (@WebParam(name = "getStockSendingStockAmount") int branchid, int headofficeprodid) {
        
        int amount= DbUtil.getStockSendingbranchStockamount(branchid,headofficeprodid);
       
        return amount;
    }
    
              @WebMethod(operationName = "updateStockSendingStockAmount")
    public boolean updateStockSendingStockAmount (@WebParam(name = "updateStockSendingStockAmount") int branchid, int quantity) {
        
        boolean success= DbUtil.updatestocksendingamount(branchid,quantity);
       
        return success;
    }
    
    
    
      // @WebMethod(operationName = "getStockSendingStockAmountgetStockrecievingbranchAmount")
   // public int getStockrecievingbranchAmount(@WebParam(name = "getStockrecievingbranchAmount") int branchid) {
        
     //   int amount= DbUtil.getStockSendingbranchStockamount(branchid);
       
      //  return amount;
  //  }
    
    
    
          @WebMethod(operationName = "updateStockRequest")
    public boolean updateStockRequest(@WebParam(name = "updateStockRequest") int requestID,String accept) {
        
        boolean valid= DbUtil.updateStcockRequets(requestID, accept);
       
        return valid;
    }
    
    
           @WebMethod(operationName = "addCustomer")
    public boolean addCustomer(@WebParam(name = "addCustomer") customers customer) {
        
        boolean valid= DbUtil.addCustomer(customer);
       
        return valid;
    }
    
    
             @WebMethod(operationName = "getCustomer")
    public customers getCustomer(@WebParam(name = "getCustomer") String fname) {
        
        customers customer= DbUtil.getcustomer(fname);
       
        return customer;
    }
    
    
            @WebMethod(operationName = "addtoCart")
    public boolean addtoCart(@WebParam(name = "addtoCart") cart products) {
        
        boolean valid= DbUtil.addtoCart(products);
       
        return valid;
    }
    
    
              @WebMethod(operationName = "getCart")
    public cart getCart(@WebParam(name = "getCart") int branchproductID,int customerID) {
        
        cart cart= DbUtil.getCart(branchproductID, customerID);
       
        return cart;
    }
    
    
    
          @WebMethod(operationName = "getCustomerCart")
    public List<cart> getCustomerCart(@WebParam(name = "getCustomerCart") int customerID) {
        
   List<cart> cart= DbUtil.getcustomerCart(customerID);
       
        return cart;
    }
    
         @WebMethod(operationName = "updatecart")
    public boolean updatecart(@WebParam(name = "updatecart") int custID) {
        
        boolean valid= DbUtil.updateCart(custID);
       
        return valid;
    }
    
           @WebMethod(operationName = "getBranchSales")
    public List<cart> getBranchSales(@WebParam(name = "getBranchSales") int branchID) {
        
   List<cart> cart= DbUtil.getBranchsales(branchID);
       
        return cart;
    }
    
      @WebMethod(operationName = "addDriver")
    public boolean addDriver(@WebParam(name = "addDriver") driver driver) {
        
     boolean valid= DbUtil.addDriver(driver);
       
        return valid;
    }
    
    
      @WebMethod(operationName = "getallDrivers")
    public List<driver> getallDrivers(@WebParam(name = "getallDrivers") int branchID) {
        
   List<driver> driver= DbUtil.getAllDrivers(branchID);
       
        return driver;
    }
    
       @WebMethod(operationName = "deleteDriver")
    public boolean deleteDriver(@WebParam(name = "deleteDriver") int id) {
        
     boolean valid= DbUtil.deleteDriver(id);
       
        return valid;
    }
    
    
    
    
        @WebMethod(operationName = "addVehicle")
    public boolean addVehicle(@WebParam(name = "addVehicle") vehicle vehicle) {
        
     boolean valid= DbUtil.addehicle(vehicle);
       
        return valid;
    }
    
         @WebMethod(operationName = "getallvehicles")
    public List<vehicle> getallvehicles(@WebParam(name = "getallvehicles") int branchID) {
        
   List<vehicle> vehicle= DbUtil.getAllVehicles(branchID);
       
        return vehicle;
    }
    
    
           @WebMethod(operationName = "deleteVehicle")
    public boolean deleteVehicle(@WebParam(name = "deleteVehicle") int id) {
        
     boolean valid= DbUtil.deleteVehcile(id);
       
        return valid;
    }
    
}
