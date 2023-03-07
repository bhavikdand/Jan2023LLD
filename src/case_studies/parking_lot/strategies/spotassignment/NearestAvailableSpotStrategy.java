package case_studies.parking_lot.strategies.spotassignment;

import case_studies.parking_lot.exceptions.NoParkingSpotAvailableException;
import case_studies.parking_lot.models.*;
import case_studies.parking_lot.repositories.ParkingLotReposirtory;

import java.util.List;

public class NearestAvailableSpotStrategy implements SpotAssignmentStrategy{

    private ParkingLotReposirtory parkingLotReposirtory;

    public NearestAvailableSpotStrategy(ParkingLotReposirtory parkingLotReposirtory) {
        this.parkingLotReposirtory = parkingLotReposirtory;
    }

    @Override
    public ParkingSpot assignSpot(VehicleType vehicleType, Gate gate) throws NoParkingSpotAvailableException {
        ParkingLot lot = parkingLotReposirtory.getParkingLotByGateId(gate.getId());
        List<ParkingFloor> parkingFloors = lot.getParkingFloors();
        for (ParkingFloor parkingFloor : parkingFloors) {
            for(ParkingSpot spot : parkingFloor.getParkingSpots()){
                if(spot.getParkingSpotStatus().equals(ParkingSpotStatus.AVAILABLE)
                && spot.getSupportedVehicleTypes().contains(vehicleType)){
                    // Mark the spot as filled
                    return spot;
                }
            }
        }
        throw new NoParkingSpotAvailableException("No parking spots found");
    }
}
