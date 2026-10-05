package com.kodewala.Exception;

public class ParkingFullException extends RuntimeException {
    public ParkingFullException(String message) {
        super(message);
    }
}
