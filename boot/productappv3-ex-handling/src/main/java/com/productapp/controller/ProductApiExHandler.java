package com.productapp.controller;

import com.productapp.dto.ErrorInfo;
import com.productapp.exception.ProductNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice   //AOP
@RestController
public class ProductApiExHandler {

    //hey sp boot anywhere ProductNotFoundException transfer control here
    //and pass that ex to  me as method arg
    @ExceptionHandler(ProductNotFoundException.class)
    public ResponseEntity<ErrorInfo> handle404(ProductNotFoundException ex){

        ErrorInfo errorInfo=new ErrorInfo();
        errorInfo.setToContact("amit@ukg.com");
        errorInfo.setStatus(HttpStatus.NOT_FOUND.toString());
        errorInfo.setErrorMessage(ex.getMessage());
        errorInfo.setTimestamp(LocalDateTime.now());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorInfo);
    }
    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorInfo> handle500(Exception ex){

        ErrorInfo errorInfo=new ErrorInfo();
        errorInfo.setToContact("amit@ukg.com");
        errorInfo.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.toString());
        errorInfo.setErrorMessage("please try after some time");
        errorInfo.setTimestamp(LocalDateTime.now());
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorInfo);
    }

    //MethodArgumentNotValidException
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorInfo> handle400(MethodArgumentNotValidException ex){

        Map<String, String> errorMap = new HashMap<>();

        ex.getBindingResult()
                .getFieldErrors().forEach(error -> {
            errorMap.put(error.getField(), error.getDefaultMessage());
        });

        ErrorInfo errorInfo=new ErrorInfo();
        errorInfo.setToContact("amit@ukg.com");
        errorInfo.setStatus(HttpStatus.BAD_REQUEST.toString());

        errorInfo.setErrorMap(errorMap);

        errorInfo.setTimestamp(LocalDateTime.now());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorInfo);
    }
}
