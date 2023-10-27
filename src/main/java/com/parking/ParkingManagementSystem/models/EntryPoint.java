package com.parking.ParkingManagementSystem.models;

import java.util.Objects;

public class EntryPoint {
    int entryPointId;
    public ParkingLocation isParkingSlotAvailableForVehicle(Vehicle vehicle){
        ParkingLot parkingLot = ParkingLot.getInstance();
        return parkingLot.isParkingAvailable(vehicle);
    }
    public Ticket generateParkingTicketForVehicle(Vehicle vehicle){
        ParkingLocation parkingLocation = isParkingSlotAvailableForVehicle(vehicle);
        if(Objects.isNull(parkingLocation)){
            return null;
        }
        return new Ticket(vehicle, parkingLocation);
    }
}
