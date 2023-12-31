# Travel_Agency_Software
This system allows travel agencies to maintain their travel packages' itinerary and passengers.

**Specification**
+ Each travel package has a name, a passenger capacity, an itinerary (list of destinations) and a list of it's passenger.
+ Each destination has a name, and a list of the activities available at that destination.
+ Each activity has a name, a description, a cost and a capacity. Each activity is available at one destination only.
+ Each passenger can sign up for zero or more activity at each destination of the travel package.
+ Once an activity has reached it's capacity no more passengers can sign up for it.
+ Each passenger has a name and a passenger number.
+ A passenger can be a standard, gold or premium passenger.

**Classes**
The following classes are used in the system:

+ TravelPackage: This class represents a travel package. It has attributes for the name, passenger capacity, itinerary, and list of passengers.
+ Destination: This class represents a destination. It has attributes for the name and list of activities.
+ Activity: This class represents an activity. It has attributes for the name, description, cost, and capacity.
+ Passenger: This class represents a passenger. It has attributes for the name, passenger number, balance, and list of activities.
  
**Functions**
The following functions are implemented in the system:

+ createTravelPackage(): This function will create a new travel package.
+ addDestination(): This function will add a destination to a travel package.
+ addActivity(): This function will add an activity to a destination.
+ signUpPassenger(): This function will sign up a passenger for an activity.
+ printItinerary(): This function will print the itinerary of a travel package.
+ printPassengerList(): This function will print the passenger list of a travel package.
+ printPassengerDetails(): This function will print the details of an individual passenger.
+ printActivitiesWithSpacesAvailable(): This function will print the activities that still have spaces available.
  
**Testing**
The system is tested using the following methods:

+ Unit testing: Unit tests are written to test the individual classes in the system.

**Class Diagram**
![TravelAgencySoftwareClassDiagram drawio (1)](https://github.com/YogeshP16/Travel_Agency_Software/assets/121794280/8d68111f-df9c-4ff5-9916-24439ce10587)
