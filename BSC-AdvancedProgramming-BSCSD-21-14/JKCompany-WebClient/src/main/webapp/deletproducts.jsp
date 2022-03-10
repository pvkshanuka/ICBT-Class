<%-- 
    Document   : deletproducts
    Created on : Feb 9, 2021, 12:46:29 AM
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
              int id = Integer.valueOf(request.getParameter("ProductID"));
              
             // out.println(id);
             
    boolean success= Webhelper.deleteHeadofficeProduct(id);
    
if(success==true){
out.println("success");
                  }else{
                  out.println("Error");
                  }

              %>  
    </body>
</html>
