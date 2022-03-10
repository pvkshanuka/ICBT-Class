<%-- 
    Document   : deletdriver
    Created on : Feb 11, 2021, 2:06:43 PM
    Author     : HP
--%>

<%@page import="com.mycompany.jkcompany.webclient.Webhelper"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <%
       int driverid=Integer.valueOf(request.getParameter("DriverID"));
       
       boolean success= Webhelper.deleteDriver(driverid);
       if(success==true){
           out.println("success");
           }
           else{
           out.println("Error");
           }
       
       %>
    </body>
</html>
