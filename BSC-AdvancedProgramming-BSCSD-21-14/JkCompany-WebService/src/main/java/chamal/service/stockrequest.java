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
public class stockrequest {
    private int request_ID;
    private String date;
    private String accepted_branch;
    private int quantity;
    private int branch_Id;
    private int headofficeproduct_Id;
    
      public stockrequest() {
        this.request_ID =0;
        this.date = "";
        this.accepted_branch = "";
        this.quantity = 0;
        this.branch_Id = 0;
        this.headofficeproduct_Id = 0;
    }

    public stockrequest(int request_ID, String date, String accepted_branch, int quantity, int branch_Id, int headofficeproduct_Id) {
        this.request_ID = request_ID;
        this.date = date;
        this.accepted_branch = accepted_branch;
        this.quantity = quantity;
        this.branch_Id = branch_Id;
        this.headofficeproduct_Id = headofficeproduct_Id;
    }

    public int getRequest_ID() {
        return request_ID;
    }

    public void setRequest_ID(int request_ID) {
        this.request_ID = request_ID;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAccepted_branch() {
        return accepted_branch;
    }

    public void setAccepted_branch(String accepted_branch) {
        this.accepted_branch = accepted_branch;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getBranch_Id() {
        return branch_Id;
    }

    public void setBranch_Id(int branch_Id) {
        this.branch_Id = branch_Id;
    }

    public int getHeadofficeproduct_Id() {
        return headofficeproduct_Id;
    }

    public void setHeadofficeproduct_Id(int headofficeproduct_Id) {
        this.headofficeproduct_Id = headofficeproduct_Id;
    }

  

}