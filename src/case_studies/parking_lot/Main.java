package case_studies.parking_lot;

import case_studies.parking_lot.controllers.TicketController;
import case_studies.parking_lot.dtos.GenerateTicketRequestDTO;
import case_studies.parking_lot.dtos.GenerateTicketResponseDTO;
import case_studies.parking_lot.models.VehicleType;
import case_studies.parking_lot.repositories.ParkingLotReposirtory;
import case_studies.parking_lot.repositories.TicketRepository;
import case_studies.parking_lot.services.GateService;
import case_studies.parking_lot.services.TicketService;
import case_studies.parking_lot.services.VehicleService;
import case_studies.parking_lot.strategies.spotassignment.NearestAvailableSpotStrategy;
import case_studies.parking_lot.strategies.spotassignment.SpotAssignmentStrategy;

public class Main {
    public static void main(String[] args) {
//        TicketController controller = new TicketController();

        // Controller -> Services -> Repositories
        ParkingLotReposirtory parkingLotReposirtory = new ParkingLotReposirtory();
        TicketRepository ticketRepository = new TicketRepository();

        SpotAssignmentStrategy spotAssignmentStrategy = new NearestAvailableSpotStrategy(parkingLotReposirtory);

        GateService gateService = new GateService();
        VehicleService vehicleService = new VehicleService();
        TicketService ticketService = new TicketService(gateService, vehicleService, ticketRepository, spotAssignmentStrategy);
        TicketController ticketController = new TicketController(ticketService);

        //Simulating a request
        GenerateTicketRequestDTO generateTicketRequestDTO = new GenerateTicketRequestDTO();
        generateTicketRequestDTO.setGateId(1);
        generateTicketRequestDTO.setVehicleNumber("ABC_XYZ");
        generateTicketRequestDTO.setVehicleType(VehicleType.BIKE);
        GenerateTicketResponseDTO responseDTO = ticketController.generateTicket(generateTicketRequestDTO);
        System.out.println(responseDTO);
    }
}
