
# **Travel Agency Software**

This system helps travel agencies manage packages, destinations, activities, and passengers.

## **Specifications:**
- **TravelPackage**: Name, passenger capacity, itinerary (list of destinations), and passengers.
- **Destination**: Name and list of activities.
- **Activity**: Name, description, cost, capacity (limited).
- **Passenger**: Name, passenger number, balance, and list of activities (can sign up for multiple activities per destination).

## **Key Functions:**
- `createTravelPackage()`: Creates a new travel package.
- `addDestination()`: Adds a destination to a package.
- `addActivity()`: Adds an activity to a destination.
- `signUpPassenger()`: Signs up a passenger for an activity.
- `printItinerary()`: Prints travel package itinerary.
- `printPassengerList()`: Prints the list of passengers in a package.
- `printPassengerDetails()`: Prints individual passenger details.
- `printActivitiesWithSpacesAvailable()`: Prints activities with available spaces.

## **Testing**: 
Unit tests for individual classes.
