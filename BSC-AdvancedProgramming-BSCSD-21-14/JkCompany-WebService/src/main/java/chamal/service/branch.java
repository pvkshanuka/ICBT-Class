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
public class branch {
    private int branchId;
    private String location;
    private String branch_Type;

    public branch() {
        this.branchId = 0;
        this.location = "";
        this.branch_Type = "";
    }

    public branch(int branchId, String location, String branch_Type) {
        this.branchId = branchId;
        this.location = location;
        this.branch_Type = branch_Type;
    }

    public int getBranchId() {
        return branchId;
    }

    public void setBranchId(int branchId) {
        this.branchId = branchId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getBranch_Type() {
        return branch_Type;
    }

    public void setBranch_Type(String branch_Type) {
        this.branch_Type = branch_Type;
    }
    
    
    
}
