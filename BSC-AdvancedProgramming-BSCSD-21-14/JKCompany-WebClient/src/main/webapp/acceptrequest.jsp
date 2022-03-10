<%-- 
    Document   : acceptrequest
    Created on : Feb 9, 2021, 8:12:07 PM
    Author     : HP
--%>

<%@page import="chamal.service.BranchProducts"%>
<%@page import="chamal.service.Stockrequest"%>
<%@page import="chamal.service.Branch"%>
<%@page import="com.mycompany.jkcompany.webclient.Webhelper"%>
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
int requestID=Integer.valueOf(request.getParameter("RequestID"));
int quantity=Integer.valueOf(request.getParameter("Quantity"));
int RecievdbranchID=Integer.valueOf(request.getParameter("BranchID"));
int RecievedproductID=Integer.valueOf(request.getParameter("HeadofficeproductID"));


BranchProducts products= Webhelper.validatebranchProducts(user.getBranchID(), RecievedproductID);

            if(RecievdbranchID==user.getBranchID()){
            
           // out.println("");
              out.println("<script> swal('Sorry You Cannot accept your Own Requests!', 'Error!', 'error');</script>");
            }
          
          else if(products==null){
          
          // out.println("");
             out.println("<script> swal('Sorry You Dont Have this product in stock!', 'Error!', 'error');</script>");
          }
          else{
          boolean valid= Webhelper.updateStockrequest(requestID, branchLocation); 
         // out.println("Success");
         if(valid==true){
          out.println("Success");

          }
          else{
          out.println("Error");

          }
          }
  
%>

    </body>
</html>
