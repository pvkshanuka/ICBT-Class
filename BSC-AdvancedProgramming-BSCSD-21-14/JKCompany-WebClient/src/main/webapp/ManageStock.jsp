<%-- 
    Document   : ManageStock
    Created on : Feb 8, 2021, 6:45:07 PM
    Author     : HP
--%>

<%@page import="com.mycompany.jkcompany.webclient.Webhelper"%>
<%@page import="java.util.List"%>
<%@page import="chamal.service.HeadofficeProducts"%>
<%@page import="chamal.service.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
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
  }
  
  .container2{
    width: 20%;
   	margin: 20px auto;
   	border: 1px solid #cbcbcb;
    border-radius: 15px; 

  }

  .testdesc{
      font-family: 'Segoe UI';
    }
    .footerHeadings{
      text-decoration: none;
      color: white;
    }
    .modalBackground{
      background-color: #333333;
    }

    .modalfonts{
      font-family:'footlight MT' ;
    }

  .panelheading{
  font-family:'Felix Tilting';
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
            <a class="nav-link " href="Managebranch.jsp">Manage Branch</a>
          </li>
          <li class="nav-item active ">
            <a class="nav-link text-danger" href="ManageStock.jsp">Manage Products</a>
          </li>
          <li class="nav-item active ">
              <a class="nav-link" href="HeadOfficeViewStockRequests.jsp">Stock Requests</a>
          </li>
          
        
      
          <li class="nav-item acc">
          
              <a class="nav-link " href="Killsession.jsp" > <i class='fas fa-user-alt'></i>Logout</a>
               
              </li>
              
              
        
          
        </ul>
        
     
        
     
      </div>
    </div>
  </nav>
 <div class="container container2 modalBackground footerHeadings">
  <h2 class="modalfonts">Add Products</h2>
  <form  name="addpackage" action="addproduct.jsp" method="POST"  >
    <div class="form-group">
      <label class="control-label col-sm-2 modalfonts" for="package_name">Product Name:</label>
      <div class="col-sm-10">
        <input type="text" class="form-control" id="Packname" placeholder="Product Name" name="prodctname">
      </div>
    </div>
   
    <div class="form-group">

  
    <div class="form-group">
      <label class="control-label col-sm-2" for="tents">Price:</label>
      <div class="col-sm-10">          
        <input type="text" class="form-control modalfonts" id="tents" placeholder="Price" name="price">
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-2" for="chairs">Quantity</label>
      <div class="col-sm-10">          
        <input type="text" class="form-control modalfonts" id="chairs" placeholder="Quantity" name="quantity">
      </div>
    </div>
   
    <div class="form-group">        
      <div class="col-sm-offset-2 col-sm-10 modalfonts">
        <button type="submit" name="Insert" class="btn btn-success">Add Product</button>
      </div>
    </div>

</div>
  </form>

 </div>


 <%
            
          Webhelper obj= new Webhelper();
            
            List<HeadofficeProducts> products = obj.getAllHeadofficeProducts();
            
         
        out.print("<div class='container mt-5'>");
            out.print("<table id='' class='display table table-striped table-dark modalfonts'>");
            out.print("<thead><tr><th>ProductID</th><th>Name</th><th>Price</th></th><th>Quantity</th></tr></thead>");
            
            out.print("<tbody>");
            for(HeadofficeProducts st : products) {
                out.print("<tr>");
                out.print("<td>" + st.getHeadofficeProdctID() +"</td>");
                out.print("<td>" + st.getHeadofficeproductName()+"</td>");
                out.print("<td>" + st.getHeadofficeproductPrice()+"</td>");
                 out.print("<td>" + st.getHeadofficeproductQuantity()+"</td>");
                out.print("<td><a href='deletproducts.jsp?ProductID="+st.getHeadofficeProdctID()+"'><button class='btn btn-danger w-25 p-0'>Delete</button></a></td>");
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
