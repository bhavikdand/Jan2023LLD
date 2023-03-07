package case_studies.parking_lot.controllers;

import case_studies.parking_lot.dtos.GenerateTicketRequestDTO;
import case_studies.parking_lot.dtos.GenerateTicketResponseDTO;
import case_studies.parking_lot.models.*;
import case_studies.parking_lot.services.TicketService;

public class TicketController {
    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    private TicketService ticketService;
    public GenerateTicketResponseDTO generateTicket(GenerateTicketRequestDTO requestDTO){
        long gateId = requestDTO.getGateId();
        //To fetch gate details:
        // 1. Fetch directly from gaterepo
        // 2. Fetch from gateService
        // 3. Call ticket Service -> ticketService will fetch data from gateService/gaterepo

        try {
            Ticket ticket = ticketService.generateTicket(requestDTO.getVehicleNumber(), requestDTO.getVehicleType(),
                    requestDTO.getGateId());
            GenerateTicketResponseDTO responseDTO = new GenerateTicketResponseDTO();
            responseDTO.setTicket(ticket);
            responseDTO.setResponseStatus(ResponseStatus.SUCCESS);
            return responseDTO;
        } catch (Exception e){
            GenerateTicketResponseDTO responseDTO = new GenerateTicketResponseDTO();
            responseDTO.setResponseStatus(ResponseStatus.FAILURE);
            return responseDTO;
        }

    }

    public Ticket getTicket(){
        return null;
    }

    //delete ticket

    //update ticket
}
