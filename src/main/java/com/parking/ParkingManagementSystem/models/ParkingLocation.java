package com.parking.ParkingManagementSystem.models;

public class ParkingLocation {
    private ParkingFloor parkingFloor;

    private ParkingSlot parkingSlot;

    public ParkingLocation(ParkingFloor parkingFloor, ParkingSlot parkingSlot){
        this.parkingFloor = parkingFloor;
        this.parkingSlot = parkingSlot;
    }

    public ParkingFloor getParkingFloor(){
        return parkingFloor;
    }

    public ParkingSlot getParkingSlot() {
        return parkingSlot;
    }
}

