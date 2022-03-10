/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chamal.service;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HP
 */
public class DbUtilTest {
    
    public DbUtilTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getUser method, of class DbUtil.
     */
  //  @Test
//    public void testGetUser() {
//        System.out.println("getUser");
//        String username = "jehan123";
//        String password = "123";
//        user expResult = new user(2,"jehan123","jehan","perera","123",2);
//        user result = DbUtil.getUser(username, password);
//        assertEquals(expResult, result);
//       
//        
//    }

//    /**
//     * Test of updateUser method, of class DbUtil.
//     */
//    @Test
//    public void testUpdateUser() {
//        System.out.println("updateUser");
//        user user = new user(2,"jehan123","jehan","almeda","123",2);
//        boolean expResult = true;
//        boolean result = DbUtil.updateUser(user);
//        assertEquals(expResult, result);
//       
//    }
//
//    /**
//     * Test of addUser method, of class DbUtil.
//     */
//    @Test
//    public void testAddUser() {
//        System.out.println("addUser");
//        user user = new user(9,"darren123","darren","sammy","123",5);
//        boolean expResult = true;
//        boolean result = DbUtil.addUser(user);
//        assertEquals(expResult, result);
//       
//    }
//
//    /**
//     * Test of checkuser method, of class DbUtil.
//     */
//    @Test
//    public void testCheckuser() {
//        System.out.println("checkuser");
//        String username = "chamal123";
//        int branchID = 1;
//        user expResult = new user(1,"chamal123","chamal","peiris","123",1);
//        user result = DbUtil.checkuser(username, branchID);
//        assertEquals(expResult, result);
//       
//    }
//
//    /**
//     * Test of getusers method, of class DbUtil.
//     */
//    @Test
//  public void testGetusers() {
//        System.out.println("getusers");
//        List<user> expResult = new ArrayList<>();
//        user obj= new user(1,"chamal123","chamal","peiris","123",1);
//        user obj2= new user(2,"jehan123","jehan","perera","123",2);
//        expResult.add(obj);
//        expResult.add(obj2);
//        List<user> result = DbUtil.getusers();
//        assertEquals(expResult.get(0).getUsername(), result.get(0).getUsername());
//        
//    }
////
//    /**
//     * Test of deleteUser method, of class DbUtil.
//     */
//    @Test
//    public void testDeleteUser() {
//        System.out.println("deleteUser");
//        int id = 5;
//        boolean expResult = true;
//        boolean result = DbUtil.deleteUser(id);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of addBranch method, of class DbUtil.
//     */
//    @Test
//    public void testAddBranch() {
//        System.out.println("addBranch");
//        branch branch = new branch(0,"Bambalapitiya","Branch");
//        boolean expResult = true;
//        boolean result = DbUtil.addBranch(branch);
//        assertEquals(expResult, result);
//        
//    }
//
//    /**
//     * Test of getBranch method, of class DbUtil.
//     */
//    @Test
//    public void testGetBranch() {
//        System.out.println("getBranch");
//        List<branch> expResult =new ArrayList<>();
//        branch obj= new branch(1,"colombo","Head_office");
//        branch obj2= new branch(2,"Galle","Branch");
//        expResult.add(obj);
//        expResult.add(obj2);
//        List<branch> result = DbUtil.getBranch();
//        assertEquals(expResult.get(0).getBranchId(), result.get(0).getBranchId());
//        
//    }
//
//    /**
//     * Test of getoneBranch method, of class DbUtil.
//     */
//    @Test
//    public void testGetoneBranch() {
//        System.out.println("getoneBranch");
//        int id = 1;
//        branch expResult = new branch(1,"Colombo","Head-office");
//        branch result = DbUtil.getoneBranch(id);
//        assertEquals(expResult, result);
//      
//    }
//
//    /**
//     * Test of deleteBranch method, of class DbUtil.
//     */
//    @Test
//    public void testDeleteBranch() {
//        System.out.println("deleteBranch");
//        int id = 1;
//        boolean expResult = true;
//        boolean result = DbUtil.deleteBranch(id);
//        assertEquals(expResult, result);
//        
//    }
//
//    /**
//     * Test of addProduct method, of class DbUtil.
//     */
//    @Test
//    public void testAddProduct() {
//        System.out.println("addProduct");
//        headoffice_products product = new headoffice_products(0,"Fans",2600,200);
//        boolean expResult = true;
//        boolean result = DbUtil.addProduct(product);
//        assertEquals(expResult, result);
//       
//    }
//
//    /**
//     * Test of addBranchProduct method, of class DbUtil.
//     */
//    @Test
//    public void testAddBranchProduct() {
//        System.out.println("addBranchProduct");
//        branch_products products = new  branch_products(0,"Fans",200,20,3,2);
//        boolean expResult = true;
//        boolean result = DbUtil.addBranchProduct(products);
//        assertEquals(expResult, result);
//       
//    }
//
//    /**
//     * Test of getAllHeadofficeProducts method, of class DbUtil.
//     */
//    @Test
//    public void testGetAllHeadofficeProducts() {
//        System.out.println("getAllHeadofficeProducts");
//        List<headoffice_products> expResult = new ArrayList<>();
//        headoffice_products obj= new headoffice_products (1,"Electric Kettles",2500,600);
//        headoffice_products obj2= new headoffice_products (3,"Table Fans",1200,470);
//        expResult.add(obj);
//        expResult.add(obj2);
//        List<headoffice_products> result = DbUtil.getAllHeadofficeProducts();
//        assertEquals(expResult.get(0).getHeadofficeproduct_name(), result.get(0).getHeadofficeproduct_name());
//        
//    }
//
//    /**
//     * Test of getsingleheadofficeproduct method, of class DbUtil.
//     */
//    @Test
//    public void testGetsingleheadofficeproduct() {
//        System.out.println("getsingleheadofficeproduct");
//        int productID = 1;
//        headoffice_products expResult = new headoffice_products (1,"Electric Kettles",2500,600);
//        headoffice_products result = DbUtil.getsingleheadofficeproduct(productID);
//        assertEquals(expResult, result);
//        
//    }
//
//    /**
//     * Test of deleteheadofficeproduct method, of class DbUtil.
//     */
//    @Test
//    public void testDeleteheadofficeproduct() {
//        System.out.println("deleteheadofficeproduct");
//        int id = 1;
//        boolean expResult = true;
//        boolean result = DbUtil.deleteheadofficeproduct(id);
//        assertEquals(expResult, result);
//        
//    }
//
//    /**
//     * Test of getbranchProducts method, of class DbUtil.
//     */
//    @Test
//    public void testGetbranchProducts() {
//        System.out.println("getbranchProducts");
//        int id = 1;
//        List<branch_products> expResult = new ArrayList<>();
//        branch_products obj = new branch_products(1,"Ketles",2500,20,1,2);
//        expResult.add(obj);
//        List<branch_products> result = DbUtil.getbranchProducts(id);
//        assertEquals(expResult.get(0).getProductName(), result.get(0).getProductName());
//        
//    }
//
//    /**
//     * Test of validatebranchProducts method, of class DbUtil.
//     */
//    @Test
//    public void testValidatebranchProducts() {
//        System.out.println("validatebranchProducts");
//        int branchid = 2;
//        int product_id = 1;
//        branch_products expResult =new  branch_products(1,"Electric Kettles",2500,82,1,2);
//        branch_products result = DbUtil.validatebranchProducts(branchid, product_id);
//        assertEquals(expResult, result);
//        
//    }
//
//    /**
//     * Test of addStockRequest method, of class DbUtil.
//     */
//    @Test
//    public void testAddStockRequest() {
//        System.out.println("addStockRequest");
//        stockrequest request = new stockrequest(0,"Feb 9, 2021 6:26:34 PM","Goods Delivered Successfully",10,2,3) ;
//        boolean expResult = true;
//        boolean result = DbUtil.addStockRequest(request);
//        assertEquals(expResult, result);
//       
//    }
//
//    /**
//     * Test of getstockrequest method, of class DbUtil.
//     */
//    @Test
//    public void testGetstockrequest() {
//        System.out.println("getstockrequest");
//        int branchid = 2;
//        int product_id = 3;
//        stockrequest expResult = new stockrequest(0,"Feb 9, 2021 6:26:34 PM","Goods Delivered Successfully",10,2,3) ;;
//        stockrequest result = DbUtil.getstockrequest(branchid, product_id);
//        assertEquals(expResult, result);
//        
//    }
//
//    /**
//     * Test of getStockSendingBranchID method, of class DbUtil.
//     */
//    @Test
//    public void testGetStockSendingBranchID() {
//        System.out.println("getStockSendingBranchID");
//        String Name = "Colombo";
//        int expResult = 1;
//        int result = DbUtil.getStockSendingBranchID(Name);
//        assertEquals(expResult, result);
//        
//    }
//
//    /**
//     * Test of getStockSendingbranchStockamount method, of class DbUtil.
//     */
//    @Test
//    public void testGetStockSendingbranchStockamount() {
//        System.out.println("getStockSendingbranchStockamount");
//        int id = 1;
//        int headofficeprodid = 3;
//        int expResult = 200;
//        int result = DbUtil.getStockSendingbranchStockamount(id, headofficeprodid);
//        assertEquals(expResult, result);
//        
//    }
//
//    /**
//     * Test of getStockrecievingbranchAmount method, of class DbUtil.
//     */
//
//    /**
//     * Test of getpendingrequest method, of class DbUtil.
//     */
//    @Test
//    public void testGetpendingrequest() {
//        System.out.println("getpendingrequest");
//        List<stockrequest> expResult = new ArrayList<>();
//        stockrequest obj = new stockrequest(8,"Feb 9, 2021 6:26:34 PM","Goods Delivered Successfully",10,2,3);
//        expResult.add(obj);
//        List<stockrequest> result = DbUtil.getpendingrequest();
//        assertEquals(expResult, result);
//       
//    }
//
//    /**
//     * Test of getbranchRequest method, of class DbUtil.
//     */
//    @Test
//    public void testGetbranchRequest() {
//        System.out.println("getbranchRequest");
//        int id = 3;
//        List<stockrequest> expResult = new ArrayList<>();
//        stockrequest obj = new stockrequest(3,"Feb 9, 2021 6:26:34 PM","Goods Delivered Successfully",10,2,3);
//        expResult.add(obj);
//        List<stockrequest> result = DbUtil.getbranchRequest(id);
//        assertEquals(expResult, result);
//        
//    }
//
//    /**
//     * Test of updateStcockRequets method, of class DbUtil.
//     */

//
//    /**
//     * Test of updatestocksendingamount method, of class DbUtil.
//     */
//    @Test
//    public void testUpdatestocksendingamount() {
//        System.out.println("updatestocksendingamount");
//        int branchID = 2;
//        int amount = 10;
//        boolean expResult = true;
//        boolean result = DbUtil.updatestocksendingamount(branchID, amount);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of headofficestockAmount method, of class DbUtil.
//     */
//    @Test
//    public void testHeadofficestockAmount() {
//        System.out.println("headofficestockAmount");
//        int productID = 1;
//        int amount =320;
//        boolean expResult = false;
//        boolean result = DbUtil.headofficestockAmount(productID, amount);
//        assertEquals(expResult, result);
//        
//    }
//
//    /**
//     * Test of updatebranchnewstock method, of class DbUtil.
//     */
//    @Test
//    public void testUpdatebranchnewstock() {
//        System.out.println("updatebranchnewstock");
//        int branchid = 2;
//        int headid = 1;
//        int amount = 20;
//        boolean expResult = true;
//        boolean result = DbUtil.updatebranchnewstock(branchid, headid, amount);
//        assertEquals(expResult, result);
//        
//    }
//
//    /**
//     * Test of addCustomer method, of class DbUtil.
////     */
//    @Test
//    public void testAddCustomer() {
//        System.out.println("addCustomer");
//        customers customer = new customers(0,"jphn@gmail.com","011262635");
//        customer.setFname("Joghn");
//        customer.setLname("Smith");
//        boolean expResult = true;
//        boolean result = DbUtil.addCustomer(customer);
//        assertEquals(expResult, result);
//        
//    }
//
//    /**
//     * Test of getcustomer method, of class DbUtil.
//     */
//    @Test
//    public void testGetcustomer() {
//        System.out.println("getcustomer");
//        String fname = "chamal";
//        customers expResult = new customers(1,"chamal@gmail.com","0112626362");
//        expResult.setFname("chamal");
//        expResult.setLname("peiris");
//        customers result = DbUtil.getcustomer(fname);
//        assertEquals(expResult, result);
//        
//    }
//
//    /**
//     * Test of addtoCart method, of class DbUtil.
//     */
//    @Test
//    public void testAddtoCart() {
//        System.out.println("addtoCart");
//        cart product =new cart(0,"Iron",2500,1,"Feb 10, 2021 8:41:05 PM",1,1,"Added To Cart",2);
//        boolean expResult = true;
//        boolean result = DbUtil.addtoCart(product);
//        assertEquals(expResult, result);
//        
//    }
//
//    /**
//     * Test of getCart method, of class DbUtil.
//     */
//    @Test
//    public void testGetCart() {
//        System.out.println("getCart");
//        int branchid = 2;
//        int customerId = 1;
//        cart expResult = new cart(0,"Iron",2500,1,"Feb 10, 2021 8:41:05 PM",1,1,"Added To Cart",2);
//        cart result = DbUtil.getCart(branchid, customerId);
//        assertEquals(expResult, result);
//        
//    }
//
//    /**
//     * Test of getcustomerCart method, of class DbUtil.
//     */
//    @Test
//    public void testGetcustomerCart() {
//        System.out.println("getcustomerCart");
//        int customerID = 1;
//        List<cart> expResult = new ArrayList<>();
//        cart obj = new cart(0,"Iron",2500,1,"Feb 10, 2021 8:41:05 PM",1,1,"Added To Cart",2);
//        expResult.add(obj);
//        List<cart> result = DbUtil.getcustomerCart(customerID);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of updateCart method, of class DbUtil.
//     */
//    @Test
//    public void testUpdateCart() {
//        System.out.println("updateCart");
//        int custid = 1;
//        boolean expResult = true;
//        boolean result = DbUtil.updateCart(custid);
//        assertEquals(expResult, result);
//        
//    }
//
//    /**
//     * Test of getBranchsales method, of class DbUtil.
//     */
//    @Test
//    public void testGetBranchsales() {
//        System.out.println("getBranchsales");
//        int branchID = 2;
//        List<cart> expResult = new ArrayList<>();
//        cart obj= new cart(0,"Iron",2500,1,"Feb 10, 2021 8:41:05 PM",1,1,"Transaction Completed",2);
//        expResult.add(obj);
//        List<cart> result = DbUtil.getBranchsales(branchID);
//        assertEquals(expResult, result);
//        
//    }
//
//    /**
//     * Test of addDriver method, of class DbUtil.
//     */
//    @Test
//    public void testAddDriver() {
//        System.out.println("addDriver");
//        driver driver = new driver(0,"josh@gmail.com",2);
//        driver.setFname("josh");
//        driver.setLname("Perera");
//        boolean expResult = true;
//        boolean result = DbUtil.addDriver(driver);
//        assertEquals(expResult, result);
//       
//    }
//
//    /**
//     * Test of getAllDrivers method, of class DbUtil.
//     */
//    @Test
//    public void testGetAllDrivers() {
//        System.out.println("getAllDrivers");
//        int id = 0;
//        List<driver> expResult = new ArrayList<>();
//        driver obj = new driver(1,"chamal@gmail.com",2);
//        obj.setFname("chamal");
//        obj.setLname("peiris");
//        expResult.add(obj);
//        List<driver> result = DbUtil.getAllDrivers(id);
//        assertEquals(expResult.get(0).getLname(), result.get(0).getLname());
//      
//    }
//
//    /**
//     * Test of deleteDriver method, of class DbUtil.
//     */
//    @Test
//    public void testDeleteDriver() {
//        System.out.println("deleteDriver");
//        int id = 2;
//        boolean expResult = true;
//        boolean result = DbUtil.deleteDriver(id);
//        assertEquals(expResult, result);
//        
//    }
//
//    /**
//     * Test of addehicle method, of class DbUtil.
////     */
//    @Test
//    public void testAddehicle() {
//        System.out.println("addehicle");
//        vehicle vehicle = new vehicle(0,"BHF6391",2);
//        boolean expResult = true;
//        boolean result = DbUtil.addehicle(vehicle);
//        assertEquals(expResult, result);
//       
//    }
//
//    /**
//     * Test of getAllVehicles method, of class DbUtil.
//     */
    @Test
    public void testGetAllVehicles() {
        System.out.println("getAllVehicles");
        int id = 2;
        List<vehicle> expResult = new ArrayList<>();
        vehicle obj = new vehicle(1,"CAu0304",1);
        expResult.add(obj);
        List<vehicle> result = DbUtil.getAllVehicles(id);
        assertEquals(expResult.get(0).getVehicle_no(), result.get(0).getVehicle_no());
        
    }
//
//    /**
//     * Test of deleteVehcile method, of class DbUtil.
//     */
    @Test
    public void testDeleteVehcile() {
        System.out.println("deleteVehcile");
        int id = 1;
        boolean expResult = true;
        boolean result = DbUtil.deleteVehcile(id);
        assertEquals(expResult, result);
      
    }
//    
}
