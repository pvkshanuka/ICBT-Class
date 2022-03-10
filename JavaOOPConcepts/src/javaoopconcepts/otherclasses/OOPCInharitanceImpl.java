/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaoopconcepts.otherclasses;

/**
 *
 * @author Kusal Shanuka
 */
public class OOPCInharitanceImpl extends OOPCInharitance{
    
    public OOPCInharitanceImpl() {
        System.out.println("OOPCInharitanceImpl Default Cons");
    }
    
    public OOPCInharitanceImpl(String firstName, String lastName) {
        super(firstName, lastName);
        this.firstName = firstName;
        this.lastName = lastName;
        
        System.out.println("OOPCInharitanceImpl Created Cons");
    }
    
}
