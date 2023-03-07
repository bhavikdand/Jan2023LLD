package case_studies.parking_lot.dtos;

import case_studies.parking_lot.models.Gate;
import case_studies.parking_lot.models.VehicleType;

public class GenerateTicketRequestDTO {

    private long gateId;
    private String vehicleNumber;

    private VehicleType vehicleType;

    public long getGateId() {
        return gateId;
    }

    public void setGateId(long gateId) {
        this.gateId = gateId;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
