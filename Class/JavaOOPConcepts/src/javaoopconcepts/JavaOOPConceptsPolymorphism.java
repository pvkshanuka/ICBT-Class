/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaoopconcepts;

import javaoopconcepts.polymorphismandinharitance.OOPCInharitance;
import javaoopconcepts.polymorphismandinharitance.OOPCInharitanceImpl;

/**
 *
 * @author Kusal Shanuka
 */
public class JavaOOPConceptsPolymorphism {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        OOPCInharitanceImpl oopci = new OOPCInharitanceImpl();
        OOPCInharitance oopci1 = new OOPCInharitanceImpl("Lakshan", "Damitha");

        System.out.println(oopci1.getFirstName());

        OOPCInharitanceImpl oopci2 = new OOPCInharitanceImpl("Lakshan", "Damitha");

        System.out.println(oopci2.getFirstName());
        System.out.println(oopci2.getLastName());
        
        String hello = "Hello";
        
        System.out.println(oopci2.getFirstName(hello));

    }

}
