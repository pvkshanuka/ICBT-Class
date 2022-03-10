<%-- 
    Document   : updateadmin
    Created on : Feb 8, 2021, 1:02:53 PM
    Author     : HP
--%>

<%@page import="com.mycompany.jkcompany.webclient.Webhelper"%>
<%@page import="chamal.service.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
      <% 
    //User user= (User)session.getAttribute("branchID");
    
     String username = request.getParameter("username");
     String firstname= request.getParameter("fname");
     String lastname= request.getParameter("lname");
     String password= request.getParameter("password");
     
     
     int branchID=(int)session.getAttribute("UsersBranchID"); 
   User user=Webhelper.checkUser(username,branchID);
   
   if(user==null){       
          //out.println("Success");      
      User newuser = new User();
      newuser.setUsername(username);
      newuser.setFname(firstname);
      newuser.setLname(lastname);
      newuser.setPassword(password);
      newuser.setBranchID(branchID);
          
      boolean success= Webhelper.addUser(newuser);
      
      if(success==true){
          
          out.println("Success");
          }
          else{
          out.println("Error");
          
          }
          }
          else{
          
             out.println("Error");
             response.sendRedirect("ManageUsers.jsp");
          
          }
/*
   User obj= new User();
   obj.setUserID(userid);
   obj.setUsername(username);
   obj.setFname(firstname);
   obj.setLname(lastname);
   obj.setPassword(password);
   obj.setBranchID(branchid);
   
    boolean success= Webhelper.updateuser(obj);

if(success==true){
out.println("Success");
response.sendRedirect("HeadOfficeHomepage.jsp");
          }
          else{
          out.println("Error");
          response.sendRedirect("HeadOfficeHomepage.jsp");
          }
*/
      %>
    </body>
</html>
