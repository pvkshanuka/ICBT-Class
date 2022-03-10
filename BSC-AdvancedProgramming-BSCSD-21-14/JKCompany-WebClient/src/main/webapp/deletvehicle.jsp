<%-- 
    Document   : deletvehicle
    Created on : Feb 11, 2021, 2:10:23 PM
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
       int vehicleID=Integer.valueOf(request.getParameter("vehcleID"));
       boolean success=Webhelper.deleteVehcile(vehicleID);
       
       if(success==true){
           out.println("Siccess");
           }
           else{
            out.println("error");
           }

       
       
       %>
    </body>
</html>
