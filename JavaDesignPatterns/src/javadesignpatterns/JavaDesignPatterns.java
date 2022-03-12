/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadesignpatterns;

import javadesignpatterns.singleton.SingletonPattern;

/**
 *
 * @author Kusal Shanuka
 */
public class JavaDesignPatterns {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println(SingletonPattern.getInstance());
        System.out.println(SingletonPattern.getInstance());
        
    }
    
}
