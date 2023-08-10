package com.yogesh.travelagencysoftware.models;

import com.yogesh.travelagencysoftware.Exceptions.FullCapacityException;
import com.yogesh.travelagencysoftware.Exceptions.InsufficientBalanceException;

import lombok.Getter;

@Getter
public class GoldPassenger extends Passenger {

    public GoldPassenger() {
        this.discount = 10.0;
    }

    @Override
    public void signUp(Destination destination, Activity activity) throws FullCapacityException, InsufficientBalanceException {
        Double discountedAmount = ((100-this.getDiscount())*activity.getCost())/100;
        if(activity.getPassengersEnrolled() < activity.getCapacity() && this.balance >= discountedAmount) {
            activity.setPassengersEnrolled(activity.getPassengersEnrolled()+1);
            this.balance -= activity.getCost();
        } else if(activity.getPassengersEnrolled() >= activity.getCapacity()) {
            throw new FullCapacityException();
        } else if (this.balance < discountedAmount) {
            throw new InsufficientBalanceException();
        }
    }
}
