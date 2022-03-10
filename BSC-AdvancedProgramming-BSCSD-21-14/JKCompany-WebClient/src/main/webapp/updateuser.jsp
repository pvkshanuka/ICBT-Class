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
    User user= (User)session.getAttribute("branchID");
    int branchid= user.getBranchID();
    int userid=user.getUserID();
     String username = request.getParameter("username");
     String firstname= request.getParameter("fname");
     String lastname= request.getParameter("lname");
     String password= request.getParameter("password");
     
     
    

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
//response.sendRedirect("HeadOfficeHomepage.jsp");
          }
          else{
          out.println("Error");
         // response.sendRedirect("HeadOfficeHomepage.jsp");
          }

      %>
    </body>
</html>
