<%-- 
    Document   : cart
    Created on : Feb 10, 2021, 5:29:37 PM
    Author     : HP
--%>

<%@page import="chamal.service.Cart"%>
<%@page import="com.mycompany.jkcompany.webclient.Webhelper"%>
<%@page import="chamal.service.Branch"%>
<%@page import="chamal.service.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <script >
    var amount=sessionStorage.getItem("amount");
</script>
    <head>
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
 





int customerId=Integer.valueOf(request.getParameter("CustomerID"));
int branchID=Integer.valueOf(request.getParameter("BranchID"));


String ProductName =request.getParameter("ProductName");
int branchproductID=Integer.valueOf(request.getParameter("BranchProductID"));
int branchavailblestock=Integer.valueOf(request.getParameter("StockQuanity"));
int productprice=Integer.valueOf(request.getParameter("Price"));
//out.println(customerId+""+ProductName+""+branchproductID);
int requestedamount=Integer.valueOf(request.getParameter("amount"));
String date=new java.util.Date().toLocaleString();


int total=0;
int price;

if(session.getAttribute("total")==null){
    
    
    
    price =requestedamount*productprice;                //calculating the total of shopping
    total=total+price;
    session.setAttribute("total", total);
    }
    
    else{
    
 total =  (int) session.getAttribute("total");
    
 price =requestedamount*productprice;
 
 total=total+price;
 session.setAttribute("total", total);
    
    }


    
//out.println(total);



//out.println(requestedamount);
 

//out.println()

 
Cart cart= Webhelper.getCart(branchproductID, customerId);
if(customerId==0){
    
     out.println("Sorry Please Select a Customer!");
    
    
    }else{
            if(cart==null){
           Cart obj= new Cart();
           obj.setProductName(ProductName);
           obj.setPrice(productprice);
           obj.setQuantity(requestedamount);
           obj.setDate(date);
           obj.setBranchProductID(branchproductID);
           obj.setCustomerId(customerId);
           obj.setOrderStatus("Added To Cart");
           obj.setBranchID(branchID);

           boolean success=Webhelper.addCart(obj);

                   if(success==true){
                   out.println("Success");
                   }
                   else{

                   out.println("Error");
                   }

           }
           else if(cart.getOrderStatus().equals("Added To Cart")){
    
                    out.println("Product already to cart");
                    }
                    
           else if(cart.getOrderStatus().equals("Transaction Completed Successfully")){
    
                     Cart obj= new Cart();
           obj.setProductName(ProductName);
           obj.setPrice(productprice);
           obj.setQuantity(requestedamount);
           obj.setDate(date);
           obj.setBranchProductID(branchproductID);
           obj.setCustomerId(customerId);
           obj.setOrderStatus("Added To Cart");
           obj.setBranchID(branchID);

           boolean success=Webhelper.addCart(obj);

                   if(success==true){
                   out.println("Success");
                   }
                   else{

                   out.println("Error");
                   }
                    }
                    
                    
             }



%>
    </body>
</html>
