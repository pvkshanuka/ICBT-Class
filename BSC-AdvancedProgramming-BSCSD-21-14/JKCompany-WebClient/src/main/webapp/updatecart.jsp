<%-- 
    Document   : ViewCart
    Created on : Feb 10, 2021, 9:01:40 PM
    Author     : HP
--%>

<%@page import="com.mycompany.jkcompany.webclient.Webhelper"%>

<%@page import="chamal.service.Cart"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
       <style>
.panelheading{
  font-family:'Felix Tilting';
}
.sidebar{
  font-family:'Rockwell';   
                                                         /*sidebar*/
}
.adminform{
  background-color: #303030;
}
.headings{
  color:white;
  font-family:'Rockwell';
}
.sideNavBar{
  background-color: #333333;
}

.btn{
  margin-left:400px;
  width:200px;
}
.img{
  margin-left:80px;
}
.modalfonts{
    font-family:'footlight MT' ;
    font-weight:Bold;
    font-size: 15px;
  }
  .footerheadings{
    color:white;
  }

</style>


<meta name="viewport" content="width=device-width, initial-scale=1.0">
<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
<script src="FormVAlidations.js"></script>

    <link rel="stylesheet" type="text/css" href="css/styles.css" />
    <link rel="stylesheet" type="text/css" href="adminpagestyles.css"/>
    <link rel="stylesheet" type="text/css" href="bootstrap-social.css"/>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
    <link
    rel="stylesheet"
    href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.0.0/animate.min.css"
  />
  
  <link rel="stylesheet" href="https://unpkg.com/aos@next/dist/aos.css" />
  <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
  <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css" integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous">
</head>

    <body>
        <%
            int id=(int)session.getAttribute("CustomerID");
            
             if(id==0){
        
           out.println("Please select a customer");
            }
            else
            {
            /*sendEmail obj = new sendEmail();
           string valid=obj.alertByEmail("Dear Customer thank You for shopping with Us!");*/
              
           boolean success= Webhelper.updateCart(id);
           if(success==true){
           
         
              out.println("Success");
              session.removeAttribute("total");
            }
            else{
              out.println("Error");
            
            }
            
            }
            
            /*
            
            
          
        int id=(int)session.getAttribute("CustomerID");
        if(id==0){
        
           out.println("Please select a customer");
            }
            else
            {
              
            List<Cart> requests = Webhelper.getcustomercart(id);
          
            
         
        out.print("<div class='container mt-5'>");
            out.print("<table id='' class='display table table-striped table-dark modalfonts'>");
            out.print("<thead><tr><th>RequestID</th><th>Date</th><th>AcceptedBranch</th><th>ProductID</th></tr></thead>");
            
            out.print("<tbody>");
            for(Cart st : requests) {
                out.print("<tr>");
                out.print("<td>" + st.getCartId()+"</td>");
                out.print("<td>" + st.getProductName()+"</td>");
                out.print("<td>" + st.getDate()+"</td>");
               
                 
               
                 //out.print("<td>" + st.getHeadofficeproductQuantity()+"</td>");
              
                out.print("</tr>");
               
            }
            out.print("</tbody>");
            out.print("</table>");
            out.print("</div>");
           
            
            
            
            
        // out.println(id);
            }*/
        %>
    </body>
</html>
