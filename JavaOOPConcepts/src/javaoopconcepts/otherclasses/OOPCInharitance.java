/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaoopconcepts.otherclasses;

/**
 *
 * @author Kusal Shanuka
 */
public class OOPCInharitance {

    public OOPCInharitance() {
        System.out.println("OOPCInharitance Default Cons");
    }

    public OOPCInharitance(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        
        System.out.println("OOPCInharitance Created Cons");
    }
    
    String firstName;
    String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
}
