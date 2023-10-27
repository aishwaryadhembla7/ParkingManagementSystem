package com.parking.ParkingManagementSystem.models;

public class ParkingSlot {
    private int     parkingSLotId;
    private Vehicle vehicle;

    private boolean isParkingSLotAvailable;

    private VehicleType vehicleType;

    public ParkingSlot(int parkingSLotId, VehicleType vehicleType) {
        this.parkingSLotId = parkingSLotId;
        this.vehicleType = vehicleType;
        this.isParkingSLotAvailable = true;
    }

    public int getParkingSLotId() {
        return parkingSLotId;
    }

    public VehicleType getVehicleType() {
        return vehicle.getVehicleType();
    }

    public boolean isParkingSlotAvailableForVehicle(Vehicle v) {
        if(this.isParkingSLotAvailable && this.vehicleType.equals(v.getVehicleType())){
            return true;
        }
        return false;
    }

    public void vacateParkingSlot(){
        this.isParkingSLotAvailable = true;
    }

}
