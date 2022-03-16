/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.icbt.samplebackend.modles.response;

/**
 *
 * @author Kusal Shanuka
 */
public class ErrorData {
    
    private String errorCode;
    private String errorMessage;

    public String getErrorCode() {
        return errorCode;
    }

    public ErrorData setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public ErrorData setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    
    public static ErrorData getErrorData(){
        return new ErrorData();
    }
    
}
