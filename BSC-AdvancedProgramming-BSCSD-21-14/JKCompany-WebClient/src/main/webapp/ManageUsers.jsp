<%-- 
    Document   : HeadOfficeHomepage
    Created on : Feb 6, 2021, 12:11:57 AM
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
            <a class="nav-link text-danger" href="#">Home <span class="sr-only">(current)</span></a>
          </li>
          <li class="nav-item active ">
            <a class="nav-link" href="Managebranch.jsp">Manage Branch</a>
          </li>
          <li class="nav-item active ">
            <a class="nav-link" href="ManageStock.jsp">Manage Products</a>
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

 <!-- Sidebar -->
 <div class="d-flex mt-5 " id="wrapper">

    <!-- Sidebar -->
    <div class="bg-light border-right " id="sidebar-wrapper" style="background-color: #333333 !important;">
      <div class="sidebar-heading">  </div>
      <div class="list-group list-group-flush">
        
        <h5 class="sidebar text-center">HELLO</h5>
        <h5 class="sidebar text-center"><%out.println(user.getFname());%></h5>
        
        <a href="HeadOfficeHomepage.jsp" class="list-group-item list-group-item-action bg-dark font-weight-bold sidebar" style="color: #FFFFFF!important;">Manage Account</a>  <!--font weight bold css and etc-->
        <a href="ManageUsers.jsp" class="list-group-item list-group-item-action bg-dark sidebar" style="color: #D67C6D  !important;">Manage Users</a>  
     
      </div>
    </div>
    <!-- /#sidebar-wrapper -->

    <!-- Page Content -->
    <div id="page-content-wrapper">

      <nav class="navbar navbar-expand-lg navbar-light bg-light border-bottom d-xl-none">
        <button class="btn btn-success" id="menu-toggle">Click</button>

   
        
      </nav>
      <!--Body Contents-->
          <div class="col-sm m-5 pb-5 adminform ml-5 modalBackground  " style=" border-radius:30px;height: 40%; box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.6);width:90%; border: 3px solid #000; padding:30px;"  >
            <form name=""  action="" method="POST" >
            <div class="form-group">
                <h3 class="footerHeadings modalfonts">Search Branch</h3>
              <label for="exampleInputEmail1" class="footerHeadings modalfonts" id="">Branch Name</label>
              <input type="text" class="form-control" id="emaaail" aria-describedby="emailHelp" name="fname" placeholder="Name">
              <div class="invalid-feedback" id="mail2" style="font-weight: bold;" data-aos="zoom-in-down"></div>             <!--invalid Feedback-->
               <label for="exampleInputEmail1" class="footerHeadings modalfonts" id="">Branch ID:</label>
               <label for="exampleInputEmail1" class="footerHeadings modalfonts" id=""><%out.println(session.getAttribute("UsersBranchID"));%></label>
            </div>

            <div class="row justify-content-center ">
                <button type="submit" name="submit" value="submit" class="btn btn-success modalfonts" style="margin-left: 20px;width:70px;height: 30px;">Search</button>    <!--aligns content to the center-->
            </div>
          </form>
          
</div> 
        
    <!-- /#page-content-wrapper -->

  </div>
  <!-- /#wrapper -->
<%
      if(request.getParameter("fname")!=null)
    {
   String branchname =request.getParameter("fname");
   int branchid=Webhelper.getstocksendingbranchID(branchname);
    
    if(branchid==0){
    out.println("<script> swal('Sorry Invalid Branch', 'Error!', 'error');</script>");
    //int ID =customer.getCustomerId();
        }
        else{

        out.println("<script> swal('BranchFound', 'Success!', 'success');</script>");
            
            session.setAttribute("UsersBranchID", branchid );
        }
    //out.println(branchid);
    }
    
    %>
    
    
    
    <div class="row mt-5 " style="width: 60%;">
          
          <div class="col-sm m-5 pb-5 adminform modalBackground" style=" border-radius:30px; box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.6); border: 3px solid #000; padding:30px;"  > <!--aligns padding and margin-->
              <form   action="adduser.jsp" method="POST" >
                <div class="form-row">
                  <div class="form-group col-md-6">
                    <label for="inputPassword4" class="modalfonts">Username</label>
                    <input type="text" class="form-control" id="contactno" name="username" placeholder="abc123"  value=""> <!--defines the max age for registration-->
                    <div class="invalid-feedback" id="con" style="font-weight: bold;" data-aos="zoom-in-down"></div>             <!--invalid Feedback-->
                  </div>
              
                </div>
                <div class="form-row">
                  <div class="form-group col-md-6">
                    <label for="inputEmail4" class="modalfonts">FirstName</label>
                    <input type="text" class="form-control" id="address" name="fname" placeholder="john.." value="">
                    <div class="valid" id="no" style="font-weight: bold;" data-aos="zoom-in-down" ></div>       
                   
                  </div>
              <div class="form-row">
                 <div class="form-group col-md-6">
                  <label for="inputPassword4" class="modalfonts">LastName</label>
                  <input type="text" class="form-control" id="password" name="lname" placeholder="smith" value="">
                  <div class="valid" id="pass" style="font-weight: bold;" data-aos="zoom-in-down"></div>             <!--invalid Feedback-->
                 </div>
                
                <div class="form-group col-md-6">
                  <label for="inputPassword4" class="modalfonts"> New Passowrd</label>
                  <input type="password" class="form-control" id="confirmnewpassword" name="password" placeholder="New Password">
                  <div class="valid" id="confpass" style="font-weight: bold;" data-aos="zoom-in-down"></div>             <!--invalid Feedback-->
                </div>
                
                </div>
              </div>
                  <!--invalid Feedback-->
                <div class="form-row">
                <div class="form-group col-md-6">
                <button type="submit" name="submit" value="submit" class="btn btn-success float-right" >Add User</button>
              </div>
             
                
                </div>
               
               
               
              </form>
          </div>
         
        </div>
    
    
      </div>
    
    
    <%
            List<User> requests = Webhelper.getallUsers();
          
            
         
        out.print("<div class='container mt-5'>");
            out.print("<table id='' class='display table table-striped table-dark modalfonts'>");
            out.print("<thead><tr><th>Username</th><th>First Name</th><th>Last Name</th><th>Branch Location</th></tr></thead>");
            
            out.print("<tbody>");
            for(User st : requests) {
                out.print("<tr>");
                Branch branch= Webhelper.getonebranch(st.getBranchID());
                String branchLocation=branch.getLocation();
                out.print("<td>" + st.getUsername()+"</td>");
                out.print("<td>" + st.getFname()+"</td>");
                out.print("<td>" + st.getLname()+"</td>");
                out.print("<td>" + branchLocation+"</td>");
                 
                out.print("<td><a href='deleteuser.jsp?UserID="+st.getUserID()+"'><button class='btn btn-danger w-25 p-0'>Delete</button></a></td>");
                          
                out.print("</tr>");
               
            }
            out.print("</tbody>");
            out.print("</table>");
            out.print("</div>");
           
            
            
            
            
        // out.println(id);
            
        %>
  
</body>
</html>
<script>
   
   function  destroyses(){
     window.location="Killsession.jsp";
    }
</script>