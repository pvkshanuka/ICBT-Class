/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testmavenproject.modles.response;

/**
 *
 * @author Kusal Shanuka
 */
public class ResponseData {
    
    private Object data;
    private Error error;

    public Object getData() {
        return data;
    }

    public ResponseData setData(Object data) {
        this.data = data;
        return this;
    }

    public Error getError() {
        return error;
    }

    public ResponseData setError(Error error) {
        this.error = error;
        return this;
    }
    
    public static ResponseData getResponseData(){
        return new ResponseData();
    }
    
}
