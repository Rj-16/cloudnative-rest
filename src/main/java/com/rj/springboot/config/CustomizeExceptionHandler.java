package com.rj.springboot.config;

import com.rj.springboot.exception.CustomException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;

@RestController
public class CustomizeExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(Exception.class)
    public final ResponseEntity<Object> handleExceptionAllEx
            (Exception ex, WebRequest request) throws Exception {
       return new ResponseEntity<>(CustomException.builder().message(ex.getMessage()).date(new Date())
               .details(ex.getLocalizedMessage()).build(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
    }
