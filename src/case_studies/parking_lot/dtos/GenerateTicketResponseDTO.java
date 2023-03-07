package case_studies.parking_lot.dtos;

import case_studies.parking_lot.models.ResponseStatus;
import case_studies.parking_lot.models.Ticket;

public class GenerateTicketResponseDTO {

    private Ticket ticket;

    private ResponseStatus responseStatus;

    public ResponseStatus getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(ResponseStatus responseStatus) {
        this.responseStatus = responseStatus;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
}
