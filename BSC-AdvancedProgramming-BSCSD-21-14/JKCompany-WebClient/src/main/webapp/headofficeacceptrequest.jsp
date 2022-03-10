<%-- 
    Document   : headofficeacceptrequest
    Created on : Feb 10, 2021, 11:50:46 AM
    Author     : HP
--%>

<%@page import="chamal.service.User"%>
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
           User user= (User)session.getAttribute("branchID");


            Branch branch= Webhelper.getonebranch(user.getBranchID());
            String branchLocation=branch.getLocation();
            int requestID=Integer.valueOf(request.getParameter("RequestID"));
            int quantity=Integer.valueOf(request.getParameter("Quantity"));
            int RecievdbranchID=Integer.valueOf(request.getParameter("BranchID"));
            int RecievedproductID=Integer.valueOf(request.getParameter("HeadofficeproductID"));


             boolean valid= Webhelper.updateStockrequest(requestID, branchLocation); 
         // out.println("Success");
         if(valid==true){
          out.println("Success");

          }
          else{
          out.println("Error");

          }
       %>
    </body>
</html>
