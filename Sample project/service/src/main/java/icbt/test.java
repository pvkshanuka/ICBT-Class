/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package icbt;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author emaly
 */
@WebService(serviceName = "test")
public class test {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
      @WebMethod(operationName = "addUser")
    public boolean addUser(@WebParam(name = "user") User user) {
       boolean success=DBUtil.addUser(user);
       return success;
    }
//       @WebMethod(operationName = "getUser")
//    public User getUser(@WebParam(name = "user") String fname) {
//       User user= DBUtil.getUser(fname);
//       return user;
//    }
}
