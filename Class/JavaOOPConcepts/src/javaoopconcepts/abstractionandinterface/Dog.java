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
public class Dog extends Mamal{

    @Override
    public void shout() {
        System.out.println("Baw.. Baw...");
    }

    @Override
    public void run() {
        System.out.println("Dog Running..");
    }

    @Override
    public void getMainType() {
        System.out.println("Type "+type);
    }

    @Override
    public void walk() {
        System.out.println("Dog walk.");
    }

    
}
