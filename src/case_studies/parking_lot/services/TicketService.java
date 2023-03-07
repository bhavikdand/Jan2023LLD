package case_studies.parking_lot.services;

import case_studies.parking_lot.exceptions.NoParkingSpotAvailableException;
import case_studies.parking_lot.models.*;
import case_studies.parking_lot.repositories.TicketRepository;
import case_studies.parking_lot.strategies.spotassignment.SpotAssignmentStrategy;

import java.util.Date;

public class TicketService {

    private GateService gateService;
    private VehicleService vehicleService;

    private TicketRepository ticketRepository;

    private SpotAssignmentStrategy spotAssignmentStrategy;

    public TicketService(GateService gateService, VehicleService vehicleService, TicketRepository ticketRepository, SpotAssignmentStrategy spotAssignmentStrategy) {
        this.gateService = gateService;
        this.vehicleService = vehicleService;
        this.ticketRepository = ticketRepository;
        this.spotAssignmentStrategy = spotAssignmentStrategy;
    }

    public Ticket generateTicket(String vehicleNumber, VehicleType vehicleType, long gateId) throws NoParkingSpotAvailableException{
        //To fetch gate details:
        // 1. Fetch directly from gaterepo
        // 2. Fetch from gateService --> Preferred Approach, SRP, REduces code duplication
        Gate gate = gateService.getGateById(gateId);

        Vehicle vehicle = vehicleService.getVehicleByNumber(vehicleNumber);

        if(vehicle == null){
            vehicle = vehicleService.createVehicle(vehicleNumber, vehicleType);
        }

        Ticket ticket = new Ticket();
        ticket.setGate(gate);
        ticket.setVehicle(vehicle);
        ticket.setEntryTime(new Date());

        ParkingSpot spot;
        try {
            spot = spotAssignmentStrategy.assignSpot(vehicleType, gate);
        } catch (NoParkingSpotAvailableException e) {
            throw e;
        }
        ticket.setParkingSpot(spot);
        return ticketRepository.saveTicket(ticket);
    }
}

