package com.kodewala.Exception;

public class InvalidTicketException extends RuntimeException {
    public InvalidTicketException(String message) {
        super(message);
    }
}
