<%-- 
    Document   : Killsession
    Created on : Feb 6, 2021, 12:09:51 AM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <%
    session.invalidate();
     response.sendRedirect("UserLogin.jsp");
%>
    </body>
</html>
