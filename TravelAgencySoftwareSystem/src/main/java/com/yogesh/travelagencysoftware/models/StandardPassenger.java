package com.yogesh.travelagencysoftware.models;

import com.yogesh.travelagencysoftware.Exceptions.FullCapacityException;
import com.yogesh.travelagencysoftware.Exceptions.InsufficientBalanceException;

import lombok.Getter;

@Getter
public class StandardPassenger extends Passenger {

    public StandardPassenger() {
        discount = 0.0;
    }

    @Override
    public void signUp(Destination destination, Activity activity) throws FullCapacityException, InsufficientBalanceException {
        if(activity.getPassengersEnrolled() < activity.getCapacity() && this.balance >= activity.getCost()) {
            activity.setPassengersEnrolled(activity.getPassengersEnrolled()+1);
            this.balance -= activity.getCost();
        } else if(activity.getPassengersEnrolled() >= activity.getCapacity()) {
            throw new FullCapacityException();
        } else if (this.balance < activity.getCost()) {
            throw new InsufficientBalanceException();
        }
    }
}
