<%-- 
    Document   : deletbranch
    Created on : Feb 8, 2021, 6:07:11 PM
    Author     : HP
--%>

<%@page import="com.mycompany.jkcompany.webclient.Webhelper"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
          </head>
    <body>
              <%
              int id = Integer.valueOf(request.getParameter("BranchID"));
              
             // out.println(id);
             
    boolean success= Webhelper.deleteBranch(id);
    
if(success==true){
out.println("success");
                  }else{
                  out.println("Error");
                  }

              %>  

    </body>
</html>
