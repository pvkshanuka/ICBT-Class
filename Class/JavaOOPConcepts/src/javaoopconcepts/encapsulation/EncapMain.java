/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaoopconcepts.encapsulation;

/**
 *
 * @author Kusal Shanuka
 */
public class EncapMain {
    
    public static void main(String[] args) {
        
        Encap encap = new Encap();
        encap.setName("Saman");
        encap.setGender(1);
        encap.setAge(22);
        
        System.out.println(encap);
        
        Encap encap2 = new Encap();
        encap2.setName("Kumari");
        encap2.setGender(0);
        encap2.setAge(25);
        
        System.out.println(encap2);
        
    }
    
}
