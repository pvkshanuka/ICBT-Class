/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testmavenproject.modles.response;

/**
 *
 * @author Kusal Shanuka
 */
public class Error {
    
    private int errorCode;
    private String message;

    public int getErrorCode() {
        return errorCode;
    }

    public Error setErrorCode(int errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public Error setMessage(String message) {
        this.message = message;
        return this;
    }
    
    public static Error getError(){
        return new Error();
    }
    
}
