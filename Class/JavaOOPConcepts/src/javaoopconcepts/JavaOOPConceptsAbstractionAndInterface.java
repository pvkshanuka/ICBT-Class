/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaoopconcepts;

import javaoopconcepts.abstractionandinterface.Animal;
import javaoopconcepts.abstractionandinterface.Cat;
import javaoopconcepts.abstractionandinterface.Dog;
import javaoopconcepts.abstractionandinterface.Mamal;

/**
 *
 * @author Kusal Shanuka
 */
public class JavaOOPConceptsAbstractionAndInterface {
    
    public static void main(String[] args) {
        
        
        Animal dog = new Dog();
        dog.getMainType();
        dog.run();
        dog.shout();
        
        System.out.println("");
        
        Animal cat = new Cat();
        cat.getMainType();
        cat.run();
        cat.shout();
        
        System.out.println("");
        
        Mamal dog2 = new Dog();
        dog2.getMainType();
        dog2.run();
        dog2.shout();
        dog2.drink();
        dog2.walk();
        
        System.out.println("");
        
        Mamal cat2 = new Cat();
        cat2.getMainType();
        cat2.run();
        cat2.shout();
        cat2.drink();
        cat2.walk();
        
    }
    
}
