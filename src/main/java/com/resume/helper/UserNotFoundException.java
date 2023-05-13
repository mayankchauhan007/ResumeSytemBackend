package com.resume.helper;

public class UserNotFoundException extends Exception{
    public UserNotFoundException()
    {
        super("User with this username is not found in the DB ");
    }
    public UserNotFoundException(String msg) {
        super(msg);
    }
}
