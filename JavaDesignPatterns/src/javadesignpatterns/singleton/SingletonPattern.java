/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadesignpatterns.singleton;

/**
 *
 * @author Kusal Shanuka
 */
public class SingletonPattern {

    private String txt;

    private static SingletonPattern obj;

    private SingletonPattern(String txt) {
        this.txt = txt;
    }

    public static SingletonPattern getInstance() {
        if (obj == null) {
            obj = new SingletonPattern("New Object"+System.currentTimeMillis());
        }
        return obj;
    }

    @Override
    public String toString() {
        return "SingletonPattern{" + "txt=" + txt + '}';
    }

}
