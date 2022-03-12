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
public class FactoryPattern {

    public static void main(String[] args) {

        PersonFactory personFactory = new PersonFactory();
        
        Person studentPerson = personFactory.getPerson("student");
        
        Person teacherPerson = personFactory.getPerson("teacher");
        
        System.out.println(studentPerson.getClass());
        
        System.out.println(teacherPerson.getClass());
        
    }

}
