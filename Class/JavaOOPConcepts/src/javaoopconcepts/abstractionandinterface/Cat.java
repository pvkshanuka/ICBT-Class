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
public class Cat extends Mamal{
    
    @Override
    public void shout() {
        System.out.println("Naw.. Naw...");
    }

    @Override
    public void run() {
        System.out.println("Cat Running..");
    }

    @Override
    public void getMainType() {
        System.out.println("Type "+getType());
    }

    private String getType() {
        return this.getClass().toString();
    }
    
     @Override
    public void walk() {
        System.out.println("Cat walk.");
    }
    
}
