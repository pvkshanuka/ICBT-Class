<%-- 
    Document   : addbranch
    Created on : Feb 8, 2021, 2:37:38 PM
    Author     : HP
--%>

<%@page import="chamal.service.Branch"%>
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
         String brancnLocation = request.getParameter("branchlocation");
         String type="Branch";
          Branch obj= new Branch();
          obj.setLocation(brancnLocation);
          obj.setBranchType(type);
          boolean success= Webhelper.addBranch(obj);
          
            if(success==true){
            out.println("Success");
           }
           else if(success==false){
           out.println("false");
           }
           else{
            out.println("errror");
           }
             


       %>
    </body>
</html>
