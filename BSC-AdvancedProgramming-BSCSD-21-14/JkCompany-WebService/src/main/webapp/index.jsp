<%-- 
    Document   : index
    Created on : Feb 5, 2021, 2:54:11 PM
    Author     : HP
--%>

<%@page import="chamal.service.stockrequest"%>
<%@page import="chamal.service.branch"%>
<%@page import="chamal.service.user"%>
<%@page import="chamal.service.DbUtil"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <%
          int id=DbUtil.getStockSendingbranchStockamount(2, 1);
           out.println(id);
          /* stockrequest obj= DbUtil.getstockrequest(3, 10);
           if(obj==null){
           out.println("Error");
           }else{
           out.println(obj.getBranch_Id());
           }*/
           /*
        branch obj = new branch();
        obj.setBranchId(1);
        obj.setLocation("Gampaha");
        obj.setBranch_Type("Branch");
       Boolean valid= DbUtil.addBranch(obj);
       
       
     user user= DbUtil.getUser("chamal123","123");
     
     out.println(user.getFname());
      out.println(user.getUserID());
       out.println(user.getBranch_ID());
      //out.print(user.getLname());
       
      // out.println(users.get(0).getFirstName());           //getting elements from an array list
       */
   /*    
stockrequest obj = new stockrequest();
obj.setDate("2020/10/10");
obj.setAccepted_branch("nawala");
obj.setQuantity(10);
obj.setBranch_Id(2);
obj.setHeadofficeproduct_Id(1);

boolean success=DbUtil.addStockRequest(obj);
if(success==true){
out.println("success");
           }*/
       %>
    </body>
</html>
