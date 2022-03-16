/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.icbt.samplebackend.modles.response;

/**
 *
 * @author Kusal Shanuka
 */
public class ResponseData {
    
    private Object data;
    private ErrorData error;

    public Object getData() {
        return data;
    }

    public ResponseData setData(Object data) {
        this.data = data;
        return this;
    }

    public ErrorData getError() {
        return error;
    }

    public ResponseData setError(ErrorData error) {
        this.error = error;
        return this;
    }
    
    public static ResponseData getResponseData(){
        
     ResponseData asdas =    new ResponseData();
        return asdas;
    }
    
}
