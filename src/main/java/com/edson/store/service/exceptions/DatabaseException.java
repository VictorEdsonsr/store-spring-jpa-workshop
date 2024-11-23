package com.edson.store.service.exceptions;

public class DatabaseException extends RuntimeException{
    public DatabaseException(String mesasge){
        super(mesasge);
    }
}
