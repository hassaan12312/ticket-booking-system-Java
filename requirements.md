# Ticketing System

## Requirements

Since this is a ticketing system, here's what the basic requirements are:

1. The user should be able to signup and login.
2. Fetch/Search trains A -> B.
3. Show available seats.
4. Book seat.
5. Ticket download.

## Entities

1. User
    1. String - ID
    2. String - Name
    3. String - Hashed Password
    4. Ticket_List - Tickets List

2. Ticket
   1. String - Ticket Number
   2. String - Source
   3. String - Destination
   4. Train - Train
   5. String - User
   6. DateTime - Time

3. Train
   1. String - Train ID
   2. String - Train number
   3. DateTime - Dept_Time
   4. DateTime - Arrival_Time
   5. Bool 2DArray - Seats

## Services

1. UserBookingService
   1. loginUser(User user)
   2. signUp(User user)
   3. fetchBooking()
   4. cancelBooking()
   5. bookTicket(String a, String b)
