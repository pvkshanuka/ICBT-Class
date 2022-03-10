/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaoopconcepts.abstractionandinterface;

/**
 *
 * @author Kusal Shanuka
 */
public abstract class Mamal implements Animal{
    
    String mamalType = "Mamal";

    @Override
    public void getMainType() {
        System.out.println(mamalType);
    }

    public abstract void walk();
    
    public void drink(){
        System.out.println("Mamal drink..");
    }

    
    
    
    
}
