package org.example.exceptions;

public class NotFoundExceptions extends RuntimeException{
    public NotFoundExceptions(long id) {
        super("Il record con id " + id + " non è stato trovato!");
    }
}
