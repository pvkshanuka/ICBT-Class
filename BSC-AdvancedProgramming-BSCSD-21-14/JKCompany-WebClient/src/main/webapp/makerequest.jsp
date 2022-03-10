
<%@page import="chamal.service.Stockrequest"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
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
    href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.0.0/animate.min.css"
  />
  
  <link rel="stylesheet" href="https://unpkg.com/aos@next/dist/aos.css" />
  <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
  <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css" integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous">
</head>

</head>
<body style="background-image: url('images/background.jpg');">
              <%
              String branchlocation=request.getParameter("AcceptedBy");
              int branchID= Integer.valueOf(request.getParameter("BranchID"));
              int headofficeproduct_ID= Integer.valueOf(request.getParameter("HeadofficeProductID"));
              
              
              out.println(branchlocation+" "+branchID+" "+headofficeproduct_ID);
              
             // out.println(id);
             
  /*  boolean success= Webhelper.deleteBranch(id);
    
if(success==true){
out.println("success");
                  }else{
                  out.println("Error");
                  }*/

              %>  
              
 <div class="container container2 modalBackground footerHeadings">
  <h2 class="modalfonts">Request Amount<% out.println(branchlocation+" "+branchID+" "+headofficeproduct_ID);%></h2>
  <form  method="post" action="" name="uploadform" >
    <div class="form-group">
      <label class="control-label col-sm-2 modalfonts" for="amount">Required Amount</label>
      <div class="col-sm-10">
        <input type="text" class="form-control" id="amount" placeholder="amount" name="amount">
      </div>
    </div>
    
    <div class="form-group">        
      <div class="col-sm-offset-2 col-sm-10 modalfonts">
        <button type="submit" name="Insert" class="btn btn-success">Add Product</button>
      </div>
    </div>
 </form>
</div>
 
<%/* stockrequest obj= DbUtil.getstockrequest(3, 10);
           if(obj==null){
           out.println("Error");
           }else{
           out.println(obj.getBranch_Id());
           }*/

            int amount =0;

            if(request.getParameter("amount")!=null)
            {
            
            Stockrequest stock=Webhelper.getrequest(branchID, headofficeproduct_ID);
            if(stock==null){
            amount= Integer.valueOf(request.getParameter("amount"));
              out.println(amount);
              String date=new java.util.Date().toLocaleString(); 



            Stockrequest obj = new Stockrequest();

            obj.setDate(date);
            obj.setAcceptedBranch("Request still not accepted");
            obj.setQuantity(amount);
            obj.setBranchId(branchID);
            obj.setHeadofficeproductId(headofficeproduct_ID);

            boolean success= Webhelper.addRequest(obj);
            if(success==true){
            out.println("success");

            //response.sendRedirect("ManageRequests.jsp");
            }
            else{
            out.println("Error");
            }
           }
             //out.println("Error");
                else{
                out.println("YOU HAVE ALREADY REQUESTED");
               
                        }
            
        }
/*
            amount= Integer.valueOf(request.getParameter("amount"));
              out.println(amount);
              String date=new java.util.Date().toLocaleString(); 



            Stockrequest obj = new Stockrequest();

            obj.setDate(date);
            obj.setAcceptedBranch("Request still not accepted");
            obj.setQuantity(amount);
            obj.setBranchId(branchID);
            obj.setHeadofficeproductId(headofficeproduct_ID);

            boolean success= Webhelper.addRequest(obj);
            if(success==true){
            out.println("success");

            //response.sendRedirect("ManageRequests.jsp");
            }
            else{
            out.println("Error");
            }
            }
*/
  %>


    </body>
</html>
