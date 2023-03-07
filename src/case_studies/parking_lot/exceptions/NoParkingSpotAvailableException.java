package case_studies.parking_lot.exceptions;

public class NoParkingSpotAvailableException extends Exception{
    public NoParkingSpotAvailableException(String message) {
        super(message);
    }
}
