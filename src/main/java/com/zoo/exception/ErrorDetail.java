package com.zoo.exception;

public class ErrorDetail {
    private String message;
    private Integer messageCode;
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public Integer getMessageCode() {
        return messageCode;
    }
    public void setMessageCode(Integer messageCode) {
        this.messageCode = messageCode;
    }    
}
