package org.tech.world.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class CustomResponseExceptionHandler extends ResponseEntityExceptionHandler {
    
    @ExceptionHandler(CountryCodeNotFoundException.class)
    public final ResponseEntity<APIErrorResponse> handleCountryCodeNotFoundException(CountryCodeNotFoundException exception,
                                                                                     HttpStatus httpStatus) {
        APIErrorResponse errorResponse = new APIErrorResponse(LocalDateTime.now(), httpStatus.value(),
                httpStatus.getReasonPhrase(), httpStatus.toString(), exception.getMessage());
        return new ResponseEntity<>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }
    
    @ExceptionHandler(DatabaseDownException.class)
    public final ResponseEntity<APIErrorResponse> handleDatabaseDownException(DatabaseDownException exception,
                                                                              HttpStatus httpStatus) {
        APIErrorResponse errorResponse = new APIErrorResponse(LocalDateTime.now(), httpStatus.value(),
                httpStatus.getReasonPhrase(), httpStatus.toString(), exception.getMessage());
        return new ResponseEntity<>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }
    
}
