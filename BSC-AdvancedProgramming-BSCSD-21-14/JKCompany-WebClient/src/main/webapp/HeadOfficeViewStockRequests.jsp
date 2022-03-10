<%-- 
    Document   : HeadOfficeViewStockRequests
    Created on : Feb 10, 2021, 11:37:18 AM
    Author     : HP
--%>

<%@page import="com.mycompany.jkcompany.webclient.Webhelper"%>
<%@page import="chamal.service.Stockrequest"%>
<%@page import="java.util.List"%>
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
                    <a class="nav-link " href="#">Home <span class="sr-only">(current)</span></a>
                  </li>
                  <li class="nav-item active ">
                    <a class="nav-link" href="Managebranch.jsp">Manage Branch</a>
                  </li>
                  <li class="nav-item active ">
                    <a class="nav-link" href="ManageStock.jsp">Manage Products</a>
                  </li>
                  <li class="nav-item active ">
                    <a class="nav-link text-danger" href="HeadOfficeViewStockRequests.jsp">Stock Requests</a>
                  </li>



                  <li class="nav-item acc">

                      <a class="nav-link " href="Killsession.jsp" > <i class='fas fa-user-alt'></i>Logout</a>

                      </li>




                </ul>




              </div>
            </div>
          </nav>


           <%
                  Webhelper obj = new Webhelper();

                     List<Stockrequest> stock= obj.getpendingstockrequest();
                   // List<Branch> branch  = obj.getbranches();


                out.print("<div class='container mt-5'>");
                    out.print("<table id='' class='display table table-striped table-dark modalfonts'>");
                    out.print("<thead><tr><th>Date</th><th>Quantity</th><th>Branch ID</th><th>Product ID</th></tr></thead>");

                    out.print("<tbody>");
                    for(Stockrequest st : stock) {
                        out.print("<tr>");
                         st.getRequestID();
                        out.print("<td>" + st.getDate()+"</td>");
                        st.getAcceptedBranch();
                        out.print("<td>" + st.getQuantity()+"</td>");
                        out.print("<td>" + st.getBranchId()+"</td>");
                        out.print("<td>" + st.getHeadofficeproductId()+"</td>");
                        //out.print("<td>" + st.getHeadofficeproductID()+"</td>");
                        //out.print("<td>" + st.getBranchID()+"</td>");
                      out.print("<td><a href='headofficeacceptrequest.jsp?RequestID="+st.getRequestID()+"&Quantity="+st.getQuantity()+"&BranchID="+st.getBranchId()+"&HeadofficeproductID="+st.getHeadofficeproductId()+"'><button class='btn btn-success w-25 p-0'>Accept Request</button></a></td>");
                        out.print("</tr>");

                    }
                    out.print("</tbody>");
                    out.print("</table>");
                    out.print("</div>");
                %>

</body>
<script>
   
   function  destroyses(){
     window.location="Killsession.jsp";
    }
</script>
</html>
