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
public class customers extends user {
    private int customer_Id;
    private String email;
    private String contact;

    
    public customers(){
    
    }
    
    
    public customers(int customer_Id, String email, String contact) {
        this.customer_Id = customer_Id;
        this.email = email;
        this.contact = contact;
    }

 

    public int getCustomer_Id() {
        return customer_Id;
    }

    public void setCustomer_Id(int customer_Id) {
        this.customer_Id = customer_Id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }


    
    
}
