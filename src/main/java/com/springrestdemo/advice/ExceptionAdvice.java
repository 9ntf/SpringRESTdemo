package com.springrestdemo.advice;

import com.springrestdemo.exception.InvalidCredentials;
import com.springrestdemo.exception.UnauthorizedUser;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionAdvice {

    @ExceptionHandler(InvalidCredentials.class)
    ResponseEntity<String> handleInvalidCredentials(InvalidCredentials ex) {
        return ResponseEntity.badRequest().body(ex.getMessage());
    }

    @ExceptionHandler(UnauthorizedUser.class)
    ResponseEntity handleUnauthorizedUser(UnauthorizedUser ex) {
        return new ResponseEntity(ex.getMessage(), HttpStatus.UNAUTHORIZED);
    }
}
