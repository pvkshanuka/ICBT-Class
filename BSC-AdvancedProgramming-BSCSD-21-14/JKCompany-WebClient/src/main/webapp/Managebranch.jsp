<%-- 
    Document   : Managebranch
    Created on : Feb 8, 2021, 2:19:42 PM
    Author     : HP
--%>

<%@page import="chamal.service.Branch"%>
<%@page import="java.util.List"%>
<%@page import="com.mycompany.jkcompany.webclient.Webhelper"%>
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
    color:white;
  }
  .footerheadings{
    color:white;
  }
     .modalBackground{
      background-color: #333333;
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
    href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.0.0/animate.min.css"/>
   <script
            src="https://code.jquery.com/jquery-3.5.1.min.js"
            integrity="sha256-9/aliU8dGd2tb6OSsuzixeV4y/faTqgFtohetphbbj0="
            crossorigin="anonymous">
        </script>

        <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.22/css/jquery.dataTables.css">
        <script type="text/javascript" charset="utf8" src="https://cdn.datatables.net/1.10.22/js/jquery.dataTables.js"></script>
  <link rel="stylesheet" href="https://unpkg.com/aos@next/dist/aos.css" />
  <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
  <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css" integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous">
</head>

</head>
<body style="background-image: url('images/background.jpg');">
<% 
User user= (User)session.getAttribute("branchID");
%>


<!--navigation bar-->
<nav class="navbar navbar-expand-lg navbar-light " id="navbar">
        
    <div class="container">
      <a class="navbar-brand  " href="#">
          <img src="images/JK COMPANY.png" height="80" width="80" alt="">
         </a>
         <h6 style="font-weight: bold; font-size: medium; color: white;">Head Office Dashboard</h6>
      <button style="background-color: white;" class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon" ></span>
      </button>
    
      <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav ml-auto">
          <li class="nav-item active ">
              <a class="nav-link " href="HeadOfficeHomepage.jsp">Home <span class="sr-only">(current)</span></a>
          </li>
          <li class="nav-item active ">
            <a class="nav-link text-danger" href="Managebranch.jsp">Manage Branch</a>
          </li>
          <li class="nav-item active ">
            <a class="nav-link" href="ManageStock.jsp">Manage Products</a>
          </li>
          <li class="nav-item active ">
            <a class="nav-link" href="AdminViewAllOrders.php">Stock Requests</a>
          </li>
          
        
      
          <li class="nav-item acc">
          
              <a class="nav-link " href="Killsession.jsp" > <i class='fas fa-user-alt'></i>Logout</a>
               
              </li>
              
              
        
          
        </ul>
        
     
        
     
      </div>
    </div>
  </nav>
 <div class="container w-75 p-3  ">
       <div class="row ">
          
   <div class="col-sm m-5 pb-5 adminform modalBackground" style=" border-radius:30px; box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.6); border: 3px solid #000; padding:30px;"  >
 <form   action="addbranch.jsp" method="POST" >
                <div class="form-row">
                  
                    <label for="inputPassword4" class="modalfonts">Branch Location</label>
                    <input type="text" class="form-control d-inline-flex p-2 " id="contactno" name="branchlocation" placeholder="Colombo.."  value=""> <!--defines the max age for registration-->
                    <div class="invalid-feedback" id="con" style="font-weight: bold;" data-aos="zoom-in-down"></div>             <!--invalid Feedback-->
                  
                </div>
              
            
                  <!--invalid Feedback-->
                <div class="form-row mt-5">
                <div class="form-group col-md-6">
                <button type="submit" name="submit" value="submit" class="btn btn-success" >Add</button>
              </div>
                </div>
               
             
                
                
               
               
               
   </form>
</div>
 </div>
 </div>


 <%
            Webhelper obj = new Webhelper();
          
            
            List<Branch> branch  = obj.getbranches();
            
         
        out.print("<div class='container mt-5'>");
            out.print("<table id='' class='display table table-striped table-dark modalfonts'>");
            out.print("<thead><tr><th>BranchID</th><th>Locations</th><th>BranchType</th></tr></thead>");
            
            out.print("<tbody>");
            for(Branch st : branch) {
                out.print("<tr>");
                out.print("<td>" + st.getBranchId() +"</td>");
                out.print("<td>" + st.getLocation()+"</td>");
                out.print("<td>" + st.getBranchType()+"</td>");
                out.print("<td><a href='deletbranch.jsp?BranchID="+st.getBranchId()+"'><button class='btn btn-danger w-25 p-0'>Delete</button></a></td>");
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
