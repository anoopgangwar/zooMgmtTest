package com.zoo.excetptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.zoo.exception.ErrorDetail;
import com.zoo.exception.UserNotFoundException;

@RestControllerAdvice
public class ZooExceptionHandler extends ResponseEntityExceptionHandler{
    
    @ExceptionHandler(Exception.class)
    public final ResponseEntity<ErrorDetail> handleUserNotFoundException(RuntimeException e, WebRequest w){
        ErrorDetail ed = new ErrorDetail();
        ed.setMessage(e.getMessage());
        ed.setMessageCode(123);
        return new ResponseEntity<ErrorDetail>(ed, HttpStatus.NOT_FOUND);
    }
}
