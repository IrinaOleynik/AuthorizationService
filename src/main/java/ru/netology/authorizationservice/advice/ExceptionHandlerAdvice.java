package ru.netology.authorizationservice.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import ru.netology.authorizationservice.exception.InvalidCredentials;
import ru.netology.authorizationservice.exception.UnauthorizedUser;

@RestControllerAdvice
public class ExceptionHandlerAdvice {

    @ExceptionHandler(InvalidCredentials.class)
    public ResponseEntity<String> handleInvalidCredentials(InvalidCredentials ic) {
        return new ResponseEntity<>(ic.getMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(UnauthorizedUser.class)
    public ResponseEntity<String> handleUnauthorizedUser(UnauthorizedUser uu) {
        System.out.println(uu.getMessage());
        return new ResponseEntity<>(uu.getMessage(), HttpStatus.UNAUTHORIZED);
    }

}
