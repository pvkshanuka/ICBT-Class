<%-- 
    Document   : addproduct
    Created on : Feb 8, 2021, 7:04:10 PM
    Author     : HP
--%>

<%@page import="com.mycompany.jkcompany.webclient.Webhelper"%>
<%@page import="chamal.service.HeadofficeProducts"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
      String productName= request.getParameter("prodctname");
      int productprice=Integer.valueOf(request.getParameter("price"));
      int quantity=Integer.valueOf(request.getParameter("quantity"));
      
            HeadofficeProducts obj = new HeadofficeProducts();
            obj.setHeadofficeproductName(productName);
            obj.setHeadofficeproductPrice(productprice);
            obj.setHeadofficeproductQuantity(quantity);
            
        boolean success= Webhelper.headofficeAddProducts(obj);
        
if(success==true){
out.println("success");
            }
            else{
            out.println("Error");
            }

        %>
    </body>
</html>
