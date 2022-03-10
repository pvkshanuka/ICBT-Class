<%-- 
    Document   : adddriver
    Created on : Feb 11, 2021, 1:36:57 PM
    Author     : HP
--%>

<%@page import="chamal.service.Driver"%>
<%@page import="chamal.service.Cart"%>
<%@page import="chamal.service.BranchProducts"%>
<%@page import="java.util.List"%>
<%@page import="chamal.service.Customers"%>
<%@page import="com.mycompany.jkcompany.webclient.Webhelper"%>
<%@page import="chamal.service.Branch"%>
<%@page import="chamal.service.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <% 
User user= (User)session.getAttribute("branchID");

Branch branch= Webhelper.getonebranch(user.getBranchID());
String branchLocation=branch.getLocation();
%>

       <%
    
    String fname=request.getParameter("firstname");
    String lname =request.getParameter("lasname");
    String email=request.getParameter("email");
    
    Driver obj=new Driver();
    obj.setFname(fname);
    obj.setLname(lname);
    obj.setEmail(email);
    obj.setBranchID(user.getBranchID());
    
    boolean success=Webhelper.addDriver(obj);
    if(success==true){
       out.println("<script> swal('Driver details Addedd', 'Success!', 'success');</script>");
        }
        else{
    out.println("Error");
            }


   
   %>     
        
    </body>
</html>
