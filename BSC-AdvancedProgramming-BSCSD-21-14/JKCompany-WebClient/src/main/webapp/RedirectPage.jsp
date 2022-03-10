<%-- 
    Document   : Headoffice
    Created on : Feb 5, 2021, 1:11:58 PM
    Author     : HP
--%>

<%@page import="com.mycompany.jkcompany.webclient.Webhelper"%>
<%@page import="java.util.UUID"%>
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
        User user = Webhelper.authenticate(request.getCookies(), session);
         if (user == null) {
                String username = request.getParameter("username");
                String password = request.getParameter("password");
            
            
                if (username != null && password != null) {
                    
                    user = Webhelper.authenticate(username, password);
                    if (user != null) {
                        String sessionId = UUID.randomUUID().toString().replace("-", "").toUpperCase();
                        // Create cookie and attach it to response
                        Cookie cookie = new Cookie("SESID", sessionId);
                        response.addCookie(cookie);
                        // Create session attribute
                        session.setAttribute(sessionId, user);
                       // out.print("Welcome " + user.getFname()+ " " + user.getBranchID());
                        int id=user.getBranchID();
                        if(id==1){
                           out.print("Welcome Head office " + user.getFname()+ " " + user.getBranchID());
                           response.sendRedirect("HeadOfficeHomepage.jsp");
                             session.setAttribute("branchID",user);
                        // response.sendRedirect("HeadofficeLogin.jsp");
                                }
                                else{
                                response.sendRedirect("BranchHomepage.jsp");
                                 out.print("Welcome branch");
                                 session.setAttribute("branchID",user);
                                    }
                             } 
                    else {
                        Webhelper.redirectToLogin(response);
                        
                      
                    }
                } else {
                   Webhelper.redirectToLogin(response);
                }
            } else {
                if(user.getBranchID()==1){
                  response.sendRedirect("HeadOfficeHomepage.jsp");
                  out.print("Welcome Head office " + user.getFname()+ " " + user.getBranchID());
                    session.setAttribute("branchID",user);
             }
             else{
               out.print("Welcome branch");
                response.sendRedirect("BranchHomepage.jsp");
                
                session.setAttribute("branchID",user);
             }
            }
            
        %>
    </body>
</html>
