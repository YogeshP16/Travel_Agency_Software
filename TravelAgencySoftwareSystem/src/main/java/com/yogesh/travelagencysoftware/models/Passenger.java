package com.yogesh.travelagencysoftware.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

import com.yogesh.travelagencysoftware.Exceptions.FullCapacityException;
import com.yogesh.travelagencysoftware.Exceptions.InsufficientBalanceException;

@Getter
@Setter
public abstract class Passenger {
    protected Long number;
    protected String name;
    protected Double balance;
    protected Double discount;
    protected List<Activity> activities;

    public void printDetails() {
        System.out.println("Passenger Name : " + this.getName());
        System.out.println("Passenger Number : " + this.getNumber());
        System.out.println("Balance : " + this.getBalance());
        for(Activity activity : this.getActivities()) {
            System.out.println("Activity Details : ");
            activity.printDetails();
            System.out.println("Destination : " + activity.getDestination());
            System.out.println("Price paid by Passenger : " + ( (100-this.getDiscount()) * activity.getCost()/100 ));
        }
    }

    abstract public void signUp(Destination destination, Activity activity) throws FullCapacityException, InsufficientBalanceException;
}
