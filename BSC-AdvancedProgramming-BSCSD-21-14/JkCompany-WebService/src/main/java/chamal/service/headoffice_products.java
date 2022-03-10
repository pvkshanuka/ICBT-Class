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
public class headoffice_products {
    int headoffice_prodctID;
    String headofficeproduct_name;
    int headofficeproduct_price;
    int headofficeproduct_quantity;

    public headoffice_products() {
        this.headoffice_prodctID = 0;
        this.headofficeproduct_name = "";
        this.headofficeproduct_price = 0;
        this.headofficeproduct_quantity = 0;
    }

    public headoffice_products(int headoffice_prodctID, String headofficeproduct_name, int headofficeproduct_price, int headofficeproduct_quantity) {
        this.headoffice_prodctID = headoffice_prodctID;
        this.headofficeproduct_name = headofficeproduct_name;
        this.headofficeproduct_price = headofficeproduct_price;
        this.headofficeproduct_quantity = headofficeproduct_quantity;
    }

    public int getHeadoffice_prodctID() {
        return headoffice_prodctID;
    }

    public void setHeadoffice_prodctID(int headoffice_prodctID) {
        this.headoffice_prodctID = headoffice_prodctID;
    }

    public String getHeadofficeproduct_name() {
        return headofficeproduct_name;
    }

    public void setHeadofficeproduct_name(String headofficeproduct_name) {
        this.headofficeproduct_name = headofficeproduct_name;
    }

    public int getHeadofficeproduct_price() {
        return headofficeproduct_price;
    }

    public void setHeadofficeproduct_price(int headofficeproduct_price) {
        this.headofficeproduct_price = headofficeproduct_price;
    }

    public int getHeadofficeproduct_quantity() {
        return headofficeproduct_quantity;
    }

    public void setHeadofficeproduct_quantity(int headofficeproduct_quantity) {
        this.headofficeproduct_quantity = headofficeproduct_quantity;
    }
    
    
  
    
}
