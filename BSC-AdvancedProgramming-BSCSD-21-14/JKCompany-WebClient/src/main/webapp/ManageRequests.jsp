<%-- 
    Document   : HeadOfficeHomepage
    Created on : Feb 6, 2021, 12:11:57 AM
    Author     : HP
--%>

<%@page import="chamal.service.Stockrequest"%>
<%@page import="chamal.service.HeadofficeProducts"%>
<%@page import="java.util.List"%>
<%@page import="chamal.service.BranchProducts"%>
<%@page import="com.mycompany.jkcompany.webclient.Webhelper"%>
<%@page import="chamal.service.Branch"%>
<%@page import="chamal.service.User"%>
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
  }
  .footerheadings{
    color:white;
   float: left;
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

</head>
<body style="background-image: url('images/background.jpg');">
<% 
User user= (User)session.getAttribute("branchID");

Branch branch= Webhelper.getonebranch(user.getBranchID());
String branchLocation=branch.getLocation();
%>


<!--navigation bar-->
<nav class="navbar navbar-expand-lg navbar-light " id="navbar">
        
    <div class="container">
      <a class="navbar-brand  " href="#">
          <img src="images/JK COMPANY.png" height="80" width="80" alt="">
         </a>
         <h6 style="font-weight: bold; font-size: medium; color: white;"><%out.println(" "+ branchLocation+" ");%> Branch Dashboard</h6>
      <button style="background-color: white;" class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon" ></span>
      </button>
    
      <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav ml-auto">
          <li class="nav-item active ">
              <a class="nav-link " href="BranchHomepage.jsp">Home <span class="sr-only">(current)</span></a>
          </li>
          <li class="nav-item active ">
              <a class="nav-link " href="Branchavailablestock.jsp">Available Stock</a>
          </li>
          <li class="nav-item active ">
              <a class="nav-link text-danger" href="ManageRequests.jsp">Manage Requests</a>
          </li>
          <li class="nav-item active ">
              <a class="nav-link" href="OtherBranchRequests.jsp">Other Branch Requests</a>
          </li>
          
        
      
          <li class="nav-item acc">
          
              <a class="nav-link " href="Killsession.jsp" > <i class='fas fa-user-alt'></i>Logout</a>
               
              </li>
              
              
        
          
        </ul>
        
     
        
     
      </div>
    </div>
  </nav>
<div class="col-sm d-flex justify-content-center mt-5"> <!--Marging padding css-->
           <h1 class="panelheading footerheadings "> Request Stock</h1>   <!--heading class-->
          </div>
 <%
            
          Webhelper obj= new Webhelper();
            
            List<HeadofficeProducts> products = obj.getAllHeadofficeProducts();
            
         
        out.print("<div class='container mt-5'>");
            out.print("<table id='' class='display table table-striped table-dark modalfonts'>");
            out.print("<thead><tr><th>ProductID</th><th>Name</th><th>Price</th></th></tr></thead>");
            
            out.print("<tbody>");
            for(HeadofficeProducts st : products) {
                out.print("<tr>");
                out.print("<td>" + st.getHeadofficeProdctID() +"</td>");
                out.print("<td>" + st.getHeadofficeproductName()+"</td>");
                out.print("<td>" + st.getHeadofficeproductPrice()+"</td>");
               
                 //out.print("<td>" + st.getHeadofficeproductQuantity()+"</td>");
                out.print("<td><a href='makerequest.jsp?AcceptedBy="+branchLocation+"&BranchID="+user.getBranchID()+"&HeadofficeProductID="+st.getHeadofficeProdctID()+"'><button class='btn btn-success w-25 p-0'>Request Stock</button></a></td>");
                out.print("</tr>");
               
            }
            out.print("</tbody>");
            out.print("</table>");
            out.print("</div>");
        %>
        <div class="col-sm d-flex justify-content-center mt-5"> <!--Marging padding css-->
           <h1 class="panelheading footerheadings "> Confirm Delivery</h1>   <!--heading class-->
          </div>
 <%
            
          
            List<Stockrequest> requests = obj.getbranchRequest(user.getBranchID());
          
            
         
        out.print("<div class='container mt-5'>");
            out.print("<table id='' class='display table table-striped table-dark modalfonts'>");
            out.print("<thead><tr><th>RequestID</th><th>Date</th><th>AcceptedBranch</th><th>ProductID</th></tr></thead>");
            
            out.print("<tbody>");
            for(Stockrequest st : requests) {
                out.print("<tr>");
                out.print("<td>" + st.getRequestID()+"</td>");
                out.print("<td>" + st.getDate()+"</td>");
                out.print("<td>" + st.getAcceptedBranch()+"</td>");
                 out.print("<td>" + st.getHeadofficeproductId()+"</td>");
                 
               
                 //out.print("<td>" + st.getHeadofficeproductQuantity()+"</td>");
                out.print("<td><a href='confirmstocksrecieved.jsp?Request_ID="+st.getRequestID()+"&AcceptedBy="+st.getAcceptedBranch()+"&BranchID="+user.getBranchID()+"&HeadofficeproductId="+st.getHeadofficeproductId()+"&Quantity="+st.getQuantity()+"'><button class='btn btn-success w-25 p-0'>Recieved Goods</button></a></td>");
                out.print("</tr>");
               
            }
            out.print("</tbody>");
            out.print("</table>");
            out.print("</div>");
        %>
        
        <script>
            $(document).ready( function () {
                $('#student-tbl').DataTable();
            } );
        </script>
            
</body>
</html>
<script>
   
   function  destroyses(){
     window.location="Killsession.jsp";
    }
</script>