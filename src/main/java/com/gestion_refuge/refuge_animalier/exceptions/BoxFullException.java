package com.gestion_refuge.refuge_animalier.exceptions;

public class BoxFullException extends RuntimeException {
    public BoxFullException(String message) {
        super(message);
    }
}
