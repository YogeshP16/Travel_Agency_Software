package com.yogesh.travelagencysoftware.Exceptions;

public class InsufficientBalanceException extends Exception {

    public InsufficientBalanceException() {
        super("You don't have sufficient balance to  signup for this activity");
    }
}
