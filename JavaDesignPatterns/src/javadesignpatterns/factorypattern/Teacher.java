/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadesignpatterns.factorypattern;

/**
 *
 * @author Kusal Shanuka
 */
public class Teacher implements Person{
    
    String name;
    
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
