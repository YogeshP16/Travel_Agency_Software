package com.yogesh.travelagencysoftware.Exceptions;

public class FullCapacityException extends Exception {

    public FullCapacityException() {
        super("The Activity has reached it's Capacity. No more Enrollments allowed");
    }
}
