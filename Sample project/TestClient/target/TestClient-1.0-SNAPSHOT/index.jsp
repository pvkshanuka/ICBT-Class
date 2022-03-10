<%-- 
    Document   : index
    Created on : Feb 28, 2022, 11:09:37 PM
    Author     : emaly
--%>

<%@page import="icbt.User"%>
<%@page import="test.WebHelper"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <form action="#" method ="post">
            <label for="fname">First name:</label><br>
            <input type="text" id="fname" name="fname" value=""><br>
            <label for="lname">Last name:</label><br>
            <input type="text" id="lname" name="lname" value=""><br><br>
            <input type="submit" value="submit" name="submit">
           
        </form> 

    </body>
</html>

<%
if(request.getParameter("submit")!=null){
    
    String fname=request.getParameter("fname");
   String lname=request.getParameter("lname");
    
 
    User user= new User();
    user.setFname(fname);
    user.setLname(lname);
    
 
    boolean success= WebHelper.addUser(user);
    if(success==true){
        out.print("Success");
    }else{
        out.print("Failed");
    }      
    
}
%>
<%--
if(request.getParameter("search")!=null){
 String fname=request.getParameter("fname");
 
 User user = WebHelper.getUser(fname);
 
 out.print(user.getFname());
 out.print(user.getLname());
 
    
    
}
--%>