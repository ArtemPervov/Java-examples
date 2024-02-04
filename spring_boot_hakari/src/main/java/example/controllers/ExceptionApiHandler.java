package example.controllers;

import org.hibernate.exception.JDBCConnectionException;
import org.hibernate.exception.SQLGrammarException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionApiHandler {

    @ExceptionHandler(SQLGrammarException.class)
    public ResponseEntity<String> SQLGrammarException(SQLGrammarException exception) {
        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(exception.getMessage());
    }

    @ExceptionHandler(JDBCConnectionException.class)
    public ResponseEntity<String> JDBCConnectionException(JDBCConnectionException exception) {
        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body("Database connection is not active. " + exception.getMessage());
    }

}
