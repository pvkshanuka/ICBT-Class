<%-- 
    Document   : HeadOfficeHomepage
    Created on : Feb 6, 2021, 12:11:57 AM
    Author     : HP
--%>

<%@page import="chamal.service.Cart"%>
<%@page import="chamal.service.BranchProducts"%>
<%@page import="java.util.List"%>
<%@page import="chamal.service.Customers"%>
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
    font-size: 15px;
  }
  .footerheadings{
    color:white;
  }
    .modalBackground{
      background-color: #333333;
    }
    .modalfonts{
    font-family:'footlight MT' ;
    font-weight:Bold;
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
            <a class="nav-link" href="Branchavailablestock.jsp">Available Stock</a>
          </li>
          <li class="nav-item active ">
              <a class="nav-link" href="ManageRequests.jsp">Manage Requests</a>
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

 <!-- Sidebar -->
 <div class="d-flex mt-5 " id="wrapper">

    <!-- Sidebar -->
    <div class="bg-light border-right " id="sidebar-wrapper" style="background-color: #333333 !important;">
      <div class="sidebar-heading">  </div>
      <div class="list-group list-group-flush">
        
        <h5 class="sidebar text-center">HELLO</h5>
        <h5 class="sidebar text-center"><%out.println(user.getFname());%></h5>
        
        <a href="BranchHomepage.jsp" class="list-group-item list-group-item-action bg-dark font-weight-bold sidebar" style="color: #FFFFFF !important;">Manage Account</a>  <!--font weight bold css and etc-->
        <a href="Managecustomers.jsp" class="list-group-item list-group-item-action bg-dark sidebar" style="color: #FFFFFF!important;">Manage Customers</a>  
         <a href="customershopproduct.jsp" class="list-group-item list-group-item-action bg-dark sidebar" style="color: #D67C6D !important;">Customer Shop Products</a>  
          <a href="ViewBranchSales.jsp" class="list-group-item list-group-item-action bg-dark sidebar" style="color: #FFFFFF !important;">View Sales</a>
          <a href="ManageDrivers.jsp" class="list-group-item list-group-item-action bg-dark sidebar" style="color: #FFFFFF !important;">Manage Driver</a>
         <a href="ManageVehicles.jsp" class="list-group-item list-group-item-action bg-dark sidebar" style="color: #FFFFFF !important;">Manage Vehciles</a>  
      </div>
    </div>
    <!-- /#sidebar-wrapper -->

    <!-- Page Content -->
    <div id="page-content-wrapper">

      <nav class="navbar navbar-expand-lg navbar-light bg-light border-bottom d-xl-none">
        <button class="btn btn-success" id="menu-toggle">Click</button>

   
        
      </nav>
        
      <div class="col-sm m-5 pb-5 adminform ml-5 modalBackground" style=" border-radius:30px; box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.6);width:50%; border: 3px solid #000; padding:30px;"  >
            <form name=""  action="" method="POST" >
            <div class="form-group">
                <h3 class="footerHeadings modalfonts">Search Customer</h3>
              <label for="exampleInputEmail1" class="footerHeadings modalfonts" id="">Customer Name</label>
              <input type="text" class="form-control" id="emaaail" aria-describedby="emailHelp" name="fname" placeholder="Name">
              <div class="invalid-feedback" id="mail2" style="font-weight: bold;" data-aos="zoom-in-down"></div>             <!--invalid Feedback-->
              
            </div>

            <div class="row justify-content-center ">
            <button type="submit" name="submit" value="submit" class="btn btn-secondary ">Verify</button>    <!--aligns content to the center-->
            </div>
          </form>
          
</div> 
        
         <div class="row justify-content-center">
             <a href="#"><button type="button" name="button" value="submit" onclick="viewCart()" class="btn btn-success mr-5 modalfonts " data-toggle="modal" data-target="#exampleModalCenter" style="font-weight: bold;">View Cart</button></a>   <!--aligns content to the center-->
            </div>
  <%

  
            



%>     
        
        
        
        
      
<%
    int id=0;
  if(request.getParameter("fname")!=null)
    {
    String fname =request.getParameter("fname");
    Customers customer=Webhelper.getCustomer(fname);
    
    if(customer==null){
    out.println("<script> swal('Sorry Invalid Cutomer', 'Error!', 'error');</script>");
    //int ID =customer.getCustomerId();
        }
        else{

        out.println("<script> swal('Customer Found', 'Success!', 'success');</script>");
            id =customer.getCustomerId();
            session.setAttribute("CustomerID", id );
        }
    
    }
    
    
    
    
    
    
    
           Webhelper obj = new Webhelper();
          
             List<BranchProducts> products= obj.getBranchProducts(user.getBranchID());
           // List<Branch> branch  = obj.getbranches();
          
           // out.print("<thead><tr><th>Product ID</th><th>Name</th><th>Price</th><th>Quantity</th></tr></thead>");
            
            //out.print("<tbody>");
            for(BranchProducts st : products) {
            int quanity=0;
            
             out.print("<div class='col-sm m-5 pb-5 adminform modalBackground' style=' border-radius:30px;width:150px;height:40%;float:left; box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.6); border: 3px solid #000; padding:30px;'>");
           
              //  out.print("<tr>");
               // out.print("<label>" + st.getBranchproductID() +"</label>");
                out.print("<label class='modalfonts'>" + st.getProductName()+"</label>");
                out.print("<label class='modalfonts'>" + st.getPrice()+" Rs./each</label>");
                //out.print("<td>" + st.getPrice()+"</td>");
               // out.print("<td>" + st.getQuantity()+"</td>");
                //out.print("<td>" + st.getHeadofficeproductID()+"</td>");
                //out.print("<td>" + st.getBranchID()+"</td>");
               // out.print("<td><a href='deletbranch.jsp?BranchID="+st.getBranchId()+"'><button class='btn btn-danger w-25 p-0'>Delete</button></a></td>");
                //out.print("</tr>");
                 out.print("<label class='modalfonts'>Amount:</label>");
                out.print("<form action='cart.jsp?CustomerID="+id+"&BranchID="+st.getBranchID()+"&ProductName="+st.getProductName()+"&HeadofficeproductID="+st.getHeadofficeproductID()+"&BranchProductID="+st.getBranchproductID()+"&StockQuanity="+st.getQuantity()+"&Price="+st.getPrice()+"' method='POST'>");
                out.print("<input id='demoInput' name='amount'  type=number min=1 max=110>");
             
               out.print("<button type='submit'onclick='quantity();'  class='mt-5 ' style='height:50px;background-color: #5BD625;'>Add To Cart</button>");
               
               out.print("</div>");
               out.print("</form>");
            }
            //out.print("</tbody>");
            
        %>
        <!-- Modal -->
<div class="modal fade" id="exampleModalCenter" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
  <div class="modal-dialog modal-dialog-centered " role="document">
    <div class="modal-content modalBackground ">
      <div class="modal-header modalBackground">
        <h5 class="" id="exampleModalLongTitle">Checkout</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body modalBackground">
          <%
        //int id=(int)session.getAttribute("CustomerID");
        
       int total;
        if(session.getAttribute("total")==null){
              
              total=0;
              
              }
              else{
              
          total=(int)session.getAttribute("total");
              
              
              }
        
        if(id==0){
        
           out.println("Please select a customer");
            }
            else
            {
              
            List<Cart> requests = Webhelper.getcustomercart(id);
          
            
         
        out.print("<div class='container mt-5'>");
            out.print("<table id='' class='display table table-striped table-dark modalfonts'>");
            out.print("<thead><tr><th>Name</th><th>Price</th><th>Quantity</th></tr></thead>");
            
            out.print("<tbody>");
            for(Cart st : requests) {
                out.print("<tr>");
                
                out.print("<td>" + st.getProductName()+"</td>");
                out.print("<td>" + st.getPrice()+"</td>");
                 out.print("<td>" + st.getQuantity()+"</td>");
                 
               
                 
               
                 //out.print("<td>" + st.getHeadofficeproductQuantity()+"</td>");
              
                out.print("</tr>");
               
            }
            
               
               
            out.print("</tbody>");
                out.print("<td> Total:Rs. " + total+"</td>");
            out.print("</table>");
            out.print("</div>");
           
            
            
            
            
        // out.println(id);
            }
        %>
      </div>
      <div class="modal-footer modalBackground">
        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
        <a href="updatecart.jsp?"><button type="button" class="btn btn-danger float-left">Checkout</button></a>
      </div>
    </div>
  </div>
</div>
</body>
</html>
<script>
   
   function  destroyses(){
     window.location="Killsession.jsp";
    }
    
    
</script>
<script>
   function increment() {
      document.getElementById('demoInput').stepUp();
   }
   function decrement() {
      document.getElementById('demoInput').stepDown();
   }
   
   function  viewCart(){
       window.location("ViewCart.jsp");
   }
   
</script>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
