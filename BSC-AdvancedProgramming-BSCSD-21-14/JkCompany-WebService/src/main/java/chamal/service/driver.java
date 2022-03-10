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
public class driver extends user{
    private int driver_ID;
    private String email;
    private int Branch_ID;
    
    
    public driver(){
    
    }

    public driver(int driver_ID, String email, int Branch_ID) {
        this.driver_ID = driver_ID;
        this.email = email;
        this.Branch_ID = Branch_ID;
    }
    
    public int getDriver_ID() {
        return driver_ID;
    }

    public void setDriver_ID(int driver_ID) {
        this.driver_ID = driver_ID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getBranch_ID() {
        return Branch_ID;
    }

    public void setBranch_ID(int Branch_ID) {
        this.Branch_ID = Branch_ID;
    }
    
    
    
}
