package case_studies.parking_lot.strategies.spotassignment;


import case_studies.parking_lot.exceptions.NoParkingSpotAvailableException;
import case_studies.parking_lot.models.Gate;
import case_studies.parking_lot.models.ParkingSpot;
import case_studies.parking_lot.models.VehicleType;

public interface SpotAssignmentStrategy {
    ParkingSpot assignSpot(VehicleType vehicleType, Gate gate) throws NoParkingSpotAvailableException;
}
