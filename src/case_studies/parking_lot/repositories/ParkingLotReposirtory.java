package case_studies.parking_lot.repositories;

import case_studies.parking_lot.models.Gate;
import case_studies.parking_lot.models.ParkingLot;

import java.util.HashMap;
import java.util.Map;

public class ParkingLotReposirtory {

    private Map<Long, ParkingLot> map = new HashMap<>();

    public ParkingLot getParkingLotByGateId(long gateId){
        //In real life, this would have been done via Joins
        for (ParkingLot parkingLot : map.values()) {
            for (Gate gate : parkingLot.getGates()) {
                if(gate.getId() == gateId){
                    return parkingLot;
                }
            }
        }
        return null;
    }

}
