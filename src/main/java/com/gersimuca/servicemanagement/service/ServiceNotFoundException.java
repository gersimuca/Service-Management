package com.gersimuca.servicemanagement.service;

public class ServiceNotFoundException extends Exception{
    public ServiceNotFoundException(){
        super();
    }

    public ServiceNotFoundException(String message){
        super(message);
    }

    public ServiceNotFoundException(String message, Throwable cause){
        super(message, cause);
    }

    public ServiceNotFoundException(Throwable cause){
        super(cause);
    }

    protected ServiceNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writeableStackTrace){
        super(message, cause, enableSuppression, writeableStackTrace);
    }
}
