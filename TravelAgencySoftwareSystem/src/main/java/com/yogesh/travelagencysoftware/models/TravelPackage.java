package com.yogesh.travelagencysoftware.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class TravelPackage {
    private Long id;
    private String name;
    private int passengerCapacity;

    private int enrolledPassengers;
    private List<Destination> destinations;
    private List<Passenger> passengers;

    public TravelPackage(Builder builder) {
        this.id = builder.getId();
        this.name = builder.getName();
        this.passengerCapacity = builder.getPassengerCapacity();
        this.destinations = builder.getDestinations();
        this.passengers = builder.getPassengers();
    }

    public void printItinerary() {
        System.out.println("Travel Package Name : " + this.getName());
        System.out.println("Destinations (along with Activities Present at each Destination) : ");
        for(Destination currDestination : this.destinations) {
            currDestination.printDetails();
        }
    }

    public void printPassengerList() {
        System.out.println("Travel Package Name : " + this.getName());
        System.out.println("Passenger Capacity : " + this.getPassengerCapacity());
        System.out.println("Number of Passengers Enrolled : " + this.getEnrolledPassengers());
        System.out.println("Name and Number of each Passenger : ");
        for(Passenger passenger : this.passengers) {
            System.out.println("Name : " + passenger.getName());
            System.out.println("Number : " + passenger.getNumber());
        }
    }

    @Getter
    public static class Builder {
        private Long id;
        private String name;
        private int passengerCapacity;
        private List<Destination> destinations;
        private List<Passenger> passengers;

        private Builder() {}

        public static Builder createPackage() {
            return new Builder();
        }

        public Builder setId(Long id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setPassengerCapacity(int passengerCapacity) {
            this.passengerCapacity = passengerCapacity;
            return this;
        }

        public Builder addDestination(Destination destination) {
            this.destinations.add(destination);
            return this;
        }

        public Builder addPassenger(Passenger passenger) {
            this.passengers.add(passenger);
            return this;
        }

        public TravelPackage build() {
            return new TravelPackage(this);
        }
    }
}
