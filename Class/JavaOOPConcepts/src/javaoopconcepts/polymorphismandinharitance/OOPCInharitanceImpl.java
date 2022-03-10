/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaoopconcepts.polymorphismandinharitance;

import javaoopconcepts.polymorphismandinharitance.OOPCInharitance;

/**
 *
 * @author Kusal Shanuka
 */
public class OOPCInharitanceImpl extends OOPCInharitance{
    
    public OOPCInharitanceImpl() {
//        System.out.println("OOPCInharitanceImpl Default Cons");
    }
    
    public OOPCInharitanceImpl(String firstName, String lastName) {
        super(firstName, lastName);
        this.firstName = firstName;
        this.lastName = lastName;
//        System.out.println("OOPCInharitanceImpl Created Cons");
    }

    @Override
    public String getFirstName() {
        return "Name "+super.getFirstName()+ " " +super.getLastName(); //To change body of generated methods, choose Tools | Templates.
    }
    
    //Overloading
    public String getFirstName(String greeting) {
        return greeting+" "+super.getFirstName()+ " " +super.getLastName(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
