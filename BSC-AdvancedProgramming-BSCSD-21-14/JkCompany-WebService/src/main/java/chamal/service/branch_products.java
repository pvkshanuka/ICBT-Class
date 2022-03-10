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
public class branch_products {
    int branchproduct_ID;
    String productName;
    int price;
    int quantity;
    int headofficeproduct_ID;
    int branch_ID;

    public branch_products() {
        this.branchproduct_ID = 0;
        this.productName = "";
        this.price = 0;
        this.quantity = 0;
        this.headofficeproduct_ID = 0;
        this.branch_ID = 0;
    }

    public branch_products(int branchproduct_ID, String productName, int price, int quantity, int headofficeproduct_ID, int branch_ID) {
        this.branchproduct_ID = branchproduct_ID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.headofficeproduct_ID = headofficeproduct_ID;
        this.branch_ID = branch_ID;
    }

    public int getBranchproduct_ID() {
        return branchproduct_ID;
    }

    public void setBranchproduct_ID(int branchproduct_ID) {
        this.branchproduct_ID = branchproduct_ID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
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

    public int getHeadofficeproduct_ID() {
        return headofficeproduct_ID;
    }

    public void setHeadofficeproduct_ID(int headofficeproduct_ID) {
        this.headofficeproduct_ID = headofficeproduct_ID;
    }

    public int getBranch_ID() {
        return branch_ID;
    }

    public void setBranch_ID(int branch_ID) {
        this.branch_ID = branch_ID;
    }
    
    
    
}
