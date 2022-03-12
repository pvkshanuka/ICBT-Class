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
public class PersonFactory {
    
    public Person getPerson(String personType){
    
        if (personType == null) {
            return null;
        }
    
        if (personType.equalsIgnoreCase("STUDENT")) {
            
            return new Student();
            
        } else if(personType.equalsIgnoreCase("TEACHER")){
            
            return new Teacher();
        }
        
        return null;
    }
    
}
