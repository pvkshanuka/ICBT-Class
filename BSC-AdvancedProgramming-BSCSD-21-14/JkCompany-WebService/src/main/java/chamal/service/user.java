package chamal.service;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class user {
    
    private int userID;
    private String Username;
    private String fname;
    private String lname;
    private String password;
    private int branch_ID;

    
    public user(){
        this.userID=0;
         this.Username="";
         this.fname="";
         this.lname="";
         this.password="";
         this. branch_ID=0;
    }

    public user(int userID, String Username, String fname, String lname, String password, int branch_ID) {
        this.userID = userID;
        this.Username = Username;
        this.fname = fname;
        this.lname = lname;
        this.password = password;
        this.branch_ID = branch_ID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getBranch_ID() {
        return branch_ID;
    }

    public void setBranch_ID(int branch_ID) {
        this.branch_ID = branch_ID;
    }

   
    
}
