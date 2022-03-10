<%-- 
    Document   : HeadofficeLogin
    Created on : Feb 5, 2021, 12:34:02 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <style>
.adminpanel{
 
  font-family: 'Lucida Sans';
  color: white !important;
}
.btn-admin{
  margin-left:200px;
  width:100px;
}


</style>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
    <link rel="stylesheet" type="text/css" href="styles.css" />
    <link rel="stylesheet" type="text/css" href="bootstrap-social.css" />
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
    <link
    rel="stylesheet"
    href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.0.0/animate.min.css"
  />
  
  <link rel="stylesheet" href="https://unpkg.com/aos@next/dist/aos.css" />
  <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">

</head>
<body style="background-color: #303030;" >

    
    <div class="container mt-5 rounded border border-secondary" style="background-color: #303030;">  <!--login container/borders-->
          <!--animations-->
        <div class="row">
          <div class="col">
             
          </div>
          
          <div class="w-100"></div>
        <div class="col mt-5 ml-5 ">
            <img class="img-fluid" src="images/JK COMPANY.png" height="400" width="400"  >
            </div>
          <div class="col"> <div class="modal-body">
          <h1 class="txt-dark d-none d-sm-block font-weight-bold ml-5 mt-2 text-center adminpanel" data-aos="fade-right"
        data-aos-anchor="#example-anchor"
        data-aos-offset="500"
        data-aos-duration="1500" style="color: white;">WELCOME </h1>                 <!--Admin panel heading-->

        <h1 class="txt-dark d-none d-sm-block font-weight-bold ml-5 mt-1 text-center adminpanel" data-aos="fade-right"
        data-aos-anchor="#example-anchor"
        data-aos-offset="500"
        data-aos-duration="1500" style="color: white;"> USER LOGIN</h1>   
        <form onsubmit="return adminValidation()" action="RedirectPage.jsp"  method="POST" >
              <div class="form-group">
                <label class="mt-5 adminpanel" for="exampleInputEmail1" style="color: white;" ><i class="fa fa-user" aria-hidden="true" ></i>   Username</label>
                <input type="text" class="form-control mt-3" id="username" name="username"  placeholder="Enter Ueerame">
               <div class="invalid-feedback" id="Username" style="font-weight: bold;" data-aos="zoom-in-down"></div>             <!--invalid Feedback-->
              </div>
              <div class="form-group">                          <!--Form-->
                <label class="mt-3 adminpanel" for="exampleInputPassword1" style="color: white;" ><i class="fa fa-lock" aria-hidden="true"></i>   Password</label>
                <input type="password" class="form-control mt-3" id="password" name="password" placeholder="Password">
                <div class="invalid-feedback" id="Password" style="font-weight: bold;"></div>             <!--invalid Feedback-->
              </div>
             <div class="form-group">
             <div class="row justify-content-center">
              <button type="submit" name="submit" value="submit" class="btn btn-secondary">Login</button>
              </div>
            </div>
            </form>
          </div>
              
          </div>
        </div>
      </div>
      
</div>
</body>
<script src="https://unpkg.com/aos@next/dist/aos.js"></script>
<script>
  AOS.init();
</script>
<script src="FormVAlidations.js"></script>

</html>
