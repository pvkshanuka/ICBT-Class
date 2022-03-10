/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chamal.service;

/**
 *
 * @author HP
 */
public class cart {
    private int cart_Id;
    private String Product_Name;
    private int price;
    private int quantity;
    private String date;
    private int branchProduct_ID;
    private int customer_Id;
    private String order_status;
    private int branch_ID;
    
    
    public cart(){
    
    }
    

    public cart(int cart_Id, String Product_Name, int price, int quantity, String date, int branchProduct_ID, int customer_Id, String order_status, int branch_ID) {
        this.cart_Id = cart_Id;
        this.Product_Name = Product_Name;
        this.price = price;
        this.quantity = quantity;
        this.date = date;
        this.branchProduct_ID = branchProduct_ID;
        this.customer_Id = customer_Id;
        this.order_status = order_status;
        this.branch_ID = branch_ID;
    }

    
    
    
    
    public int getCart_Id() {
        return cart_Id;
    }

    public void setCart_Id(int cart_Id) {
        this.cart_Id = cart_Id;
    }

    public String getProduct_Name() {
        return Product_Name;
    }

    public void setProduct_Name(String Product_Name) {
        this.Product_Name = Product_Name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getBranchProduct_ID() {
        return branchProduct_ID;
    }

    public void setBranchProduct_ID(int branchProduct_ID) {
        this.branchProduct_ID = branchProduct_ID;
    }

    public int getCustomer_Id() {
        return customer_Id;
    }

    public void setCustomer_Id(int customer_Id) {
        this.customer_Id = customer_Id;
    }

    public String getOrder_status() {
        return order_status;
    }

    public void setOrder_status(String order_status) {
        this.order_status = order_status;
    }

    public int getBranch_ID() {
        return branch_ID;
    }

    public void setBranch_ID(int branch_ID) {
        this.branch_ID = branch_ID;
    }
    
    
    
    
}
