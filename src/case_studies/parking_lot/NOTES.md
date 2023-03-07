Implement Generate ticket feature
 --> TicketController -> TicketService -> TicketRepository -> Ticket


generateTicket takes gate and vehicleNumber, 
1. But in future if it starts taking parkingspot also, we will
   need to change input parameters for the generateTicket
2. I dont want to expose all the attributes of my models

As a solution, we will create DTOs (Data Transfer Objects)
DTOs will be derived from models, like a subset of model. We can hide all the things of models that we dont 
want to show to the outside world.


In M/C coding interviews data is not stored in actual DBs, but it is stored in InMemory DB

H/W:
1. Implement missing TODOs and complete the generate ticket feature
   a] Implement functionality where you will mark the parking spot filled once it is assigned.
2. Adhere to DI principle
3. Implement the missing features
4. Try to time yourself when implementing.
