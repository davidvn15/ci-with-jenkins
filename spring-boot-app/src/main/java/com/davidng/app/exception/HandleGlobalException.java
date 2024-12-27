package com.davidng.app.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class HandleGlobalException extends ResponseEntityExceptionHandler {
    @ExceptionHandler(DuplicationException.class)
    private ResponseEntity<?> handleError(Exception ex) {

        //TODO: you should custom more here

        Map<String, String> body = new HashMap<>();
        body.put("code", ((DuplicationException) ex).getCode());
        body.put("message", ex.getMessage());
        return new ResponseEntity<>(body, HttpStatus.BAD_REQUEST);
    }
}
