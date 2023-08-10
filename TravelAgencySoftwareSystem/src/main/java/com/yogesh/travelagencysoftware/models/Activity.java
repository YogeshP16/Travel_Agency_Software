package com.yogesh.travelagencysoftware.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Activity {
    private Long id;
    private String name;
    private String description;
    private Double cost;
    private int capacity;
    private int passengersEnrolled;
    private Destination destination;

    public void printDetails() {
        System.out.println("Activity Name : " + this.getName());
        System.out.println("Description : " + this.getDescription());
        System.out.println("Cost : " + this.getCost());
        System.out.println("Capacity : " + this.getCapacity());
    }

    public void printAvailableActivities() {
        if(this.getPassengersEnrolled() < this.getCapacity()) {
            this.printDetails();
            System.out.println("Available Spaces : " + (this.getCapacity()-this.getPassengersEnrolled()));
        }
    }
}
