package com.parking.ParkingManagementSystem.models;

import java.util.UUID;

public class Ticket {
    private String ticketId;
    private Vehicle vehicle;
    private ParkingLocation parkingLocation;

    long startTime;

    public Ticket(Vehicle vehicle, ParkingLocation parkingLocation){
        this.ticketId = UUID.randomUUID().toString();
        this.vehicle = vehicle;
        this.parkingLocation = parkingLocation;
        startTime = System.currentTimeMillis();
    }

    public ParkingLocation getParkingLocation() {
        return parkingLocation;
    }

    public long getStartTime() {
        return startTime;
    }
}
