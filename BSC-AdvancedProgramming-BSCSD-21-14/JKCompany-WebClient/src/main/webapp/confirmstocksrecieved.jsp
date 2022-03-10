<%-- 
    Document   : acceptrequest
    Created on : Feb 9, 2021, 8:12:07 PM
    Author     : HP
--%>

<%@page import="chamal.service.HeadofficeProducts"%>
<%@page import="chamal.service.BranchProducts"%>
<%@page import="chamal.service.Stockrequest"%>
<%@page import="chamal.service.Branch"%>
<%@page import="com.mycompany.jkcompany.webclient.Webhelper"%>
<%@page import="chamal.service.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
      <% 
User user= (User)session.getAttribute("branchID");


Branch branch= Webhelper.getonebranch(user.getBranchID());
String branchLocation=branch.getLocation();
int requestID=Integer.valueOf(request.getParameter("Request_ID"));
String Acceptance=request.getParameter("AcceptedBy");
int quantity=Integer.valueOf(request.getParameter("Quantity"));
int RecievdbranchID=Integer.valueOf(request.getParameter("BranchID"));
int RecievedproductID=Integer.valueOf(request.getParameter("HeadofficeproductId"));

Webhelper obj= new Webhelper();
//BranchProducts products= Webhelper.validatebranchProducts(user.getBranchID(), RecievedproductID);

         if(Acceptance.equals("Request still not accepted"))
         {
          
          out.println("No Branch Has Accepted Your Request Yet");
         }
         else if(Acceptance.equals("Goods Delivered Successfully"))
         {
          
           out.println("Sorry! Good already Delivered");
           
         }
         else
         {
          
                int stocksendingbranchID= obj.getstocksendingbranchID(Acceptance);              //getting the stock sending branch id
                int stocksendingbranchquantity=obj.getstocksendingbranchQuantiy(stocksendingbranchID, RecievedproductID);
                
                
                if(stocksendingbranchID==1){

                //out.println(stocksendingbranchID);
                HeadofficeProducts headofficeprod= obj.getsingleHeadofficeProducts(RecievedproductID);
                    
               int headofficeproductamount =headofficeprod.getHeadofficeproductQuantity();
               int newamountinheadoffice=headofficeproductamount-quantity;
               
                    BranchProducts products= Webhelper.validatebranchProducts(user.getBranchID(), RecievedproductID);
                 if(products==null){

                                       boolean stock=obj.updateStockrequest(requestID, "Goods Delivered Successfully");
                                        //out.println("No Product");
                                       // HeadofficeProducts headofficeprod= obj.getsingleHeadofficeProducts(RecievedproductID);
                                        boolean success=obj.updateheadofficeStock(headofficeprod.getHeadofficeProdctID(), newamountinheadoffice);



                                        BranchProducts branchprod=new BranchProducts();
                                        branchprod.setProductName(headofficeprod.getHeadofficeproductName());
                                        branchprod.setPrice(headofficeprod.getHeadofficeproductPrice());
                                        branchprod.setQuantity(quantity);
                                        branchprod.setHeadofficeproductID(headofficeprod.getHeadofficeProdctID());
                                         branchprod.setBranchID(user.getBranchID());

                                         boolean valid= obj.addBranchProducts(branchprod);

                                         if(valid==true){
                                         out.println("Success");
                                        }

                           // out.println(prods.getHeadofficeProdctID());
                            //out.println(prods.getHeadofficeproductName());

                               }else{
      
      
      
                               boolean stock=obj.updateStockrequest(requestID, "Goods Delivered Successfully");
                                boolean success=obj.updateheadofficeStock(headofficeprod.getHeadofficeProdctID(), newamountinheadoffice);
                              int availableproductamount=products.getQuantity();
                              int newavailableproductamount=quantity+availableproductamount;

                               //boolean success1=obj.updateStocksendingAmount(user.getBranchID(), newavailableproductamount);
                               boolean success1=obj.updatenewbranchStock(user.getBranchID(),headofficeprod.getHeadofficeProdctID(), newavailableproductamount);
                              if(success1==true){
                               out.println("Success");
                                                  }
      
      
      
      
                                }
               
               
               
                 }
                else
                {
                int NewStockAmountInSendinBranch=stocksendingbranchquantity-quantity;

                 BranchProducts products= Webhelper.validatebranchProducts(user.getBranchID(), RecievedproductID);
                 if(products==null){

                                       boolean stock=obj.updateStockrequest(requestID, "Goods Delivered Successfully");
                                        //out.println("No Product");
                                        HeadofficeProducts headofficeprod= obj.getsingleHeadofficeProducts(RecievedproductID);
                                        boolean success=obj.updateStocksendingAmount(stocksendingbranchID, NewStockAmountInSendinBranch);



                                        BranchProducts branchprod=new BranchProducts();
                                        branchprod.setProductName(headofficeprod.getHeadofficeproductName());
                                        branchprod.setPrice(headofficeprod.getHeadofficeproductPrice());
                                        branchprod.setQuantity(quantity);
                                        branchprod.setHeadofficeproductID(headofficeprod.getHeadofficeProdctID());
                                         branchprod.setBranchID(user.getBranchID());

                                         boolean valid= obj.addBranchProducts(branchprod);

                                         if(valid==true){
                                         out.println("Success");
                                        }

                           // out.println(prods.getHeadofficeProdctID());
                            //out.println(prods.getHeadofficeproductName());

                               }
                 else{
                             HeadofficeProducts headofficeprod= obj.getsingleHeadofficeProducts(RecievedproductID);
                               boolean stock=obj.updateStockrequest(requestID, "Goods Delivered Successfully");
                                  int availableproductamount=products.getQuantity();
                              int newavailableproductamount=quantity+availableproductamount;
                              int newstocksendingbranchamount=stocksendingbranchquantity-quantity;
                               //boolean success=obj.updateStocksendingAmount(stocksendingbranchID, NewStockAmountInSendinBranch);
                              boolean success=obj.updatenewbranchStock(stocksendingbranchID,headofficeprod.getHeadofficeProdctID(), newstocksendingbranchamount); //update sending branch stock
                           

                             boolean success1=obj.updatenewbranchStock(user.getBranchID(),headofficeprod.getHeadofficeProdctID(), newavailableproductamount);  //update accepting branch stock
                              if(success1==true){
                               out.println("Success");
                                                  }
                        }
                 }
          }
  
%>

    </body>
</html>
