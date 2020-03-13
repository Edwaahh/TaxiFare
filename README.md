# TaxiFare


A simple program written to calculate fares paid for ride hailing services. In this program we have created 4 ways people can book a ride, 
  1. JustRide 
  Fare is based on the distance @ 22 cents per km
  Fare is the same regardless of the number of passengers (pax)
  A surcharge of 500 cents if a ride request is issued between the peak hour of 600 hrs to 900 hrs, both inclusive

  2. TakeACab
  Fare is based on the distance @ 33 cents per km, but there is a booking fee of 200 cents
  Fare is the same regardless of the number of passengers (pax)
  No peak hour surcharge

  3. ShareARide
  Fare is based on the distance @ 50 cents per km
  Fare is divided equally among the number of passengers
  Any fractional part of the fare is absorbed by your friendly driver
  A surcharge of 500 cents if a ride request is issued between 600 hrs to 900 hrs, both inclusive
  In addition, there are two types of drivers under Snatch. Each can provide a subset of the services above.

  4. NormalCab drivers provide JustRide and TakeACab services.
  PrivateCar drivers provide JustRide and ShareARide services.
  A customer can issue a Snatch ride request, specified by the distance of the ride, the number of passengers, and the time of the request. Given a request, the system generates a list of possible bookings, by matching the available drivers based on the services they provide to the given request.
  
To run the program
  1. Run Main.java
  2. The input will be as follows
      a. a request (an integer to indicate the distance of the journey, an integer to indicate how many pax and the time in 24hours format
      b. the car (a string to indicate type of car, a string to indicate the carplate number and an integer to indicate how far away)
  3. end the program with ctrl d
      
 A sample input and output will be included as a screenshot in the folder labelled 'demo'.
    
