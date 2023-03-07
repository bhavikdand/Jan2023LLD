package case_studies.parking_lot.repositories;

import case_studies.parking_lot.models.Ticket;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TicketRepository {

    private Map<Long, Ticket> map = new HashMap<>();

    private long idSequence = 0;

    public Ticket saveTicket(Ticket ticket){
        idSequence++;
        ticket.setId(idSequence);
        map.put(idSequence, ticket);
        return ticket;
    }
}
