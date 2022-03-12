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
public class Encap {
    
    private String name;
    private int age;
    private int gender;

    public String getName() {  
        return name;
    }

    public void setName(String name) {
        
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        
        if (gender == 1) {
            name = "Mr. "+name;
        }else{
            name = "Mrs. "+name;
        }
        
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Encap{" + "name=" + name + ", age=" + age + ", gender=" + gender + '}';
    }
}
