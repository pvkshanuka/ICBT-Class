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
public class vehicle {
    private int vehicle_ID;
    private String vehicle_no;
    private int Branch_ID;

      public vehicle() {
        
    }
    
    
    public vehicle(int vehicle_ID, String vehicle_no, int Branch_ID) {
        this.vehicle_ID = vehicle_ID;
        this.vehicle_no = vehicle_no;
        this.Branch_ID = Branch_ID;
    }
      

    public int getVehicle_ID() {
        return vehicle_ID;
    }

    public void setVehicle_ID(int vehicle_ID) {
        this.vehicle_ID = vehicle_ID;
    }

    public String getVehicle_no() {
        return vehicle_no;
    }

    public void setVehicle_no(String vehicle_no) {
        this.vehicle_no = vehicle_no;
    }

    public int getBranch_ID() {
        return Branch_ID;
    }

    public void setBranch_ID(int Branch_ID) {
        this.Branch_ID = Branch_ID;
    }
    
}
