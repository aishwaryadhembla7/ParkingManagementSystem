package com.parking.ParkingManagementSystem.models;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {

    private static ParkingLot parkingLot;

    private static final int MAX_FLOOR = 5;
    List<ParkingFloor> parkingFloorList;

    private ParkingLot(){
        parkingFloorList = new ArrayList<>();
        int i = 0;
        while(i < MAX_FLOOR){
            parkingFloorList.add(new ParkingFloor(i));
            i++;
        }
    }

    public static ParkingLot getInstance(){
        if(parkingLot == null){
            synchronized(ParkingLot.class){
                parkingLot = new ParkingLot();
            }
        }
        return parkingLot;
    }

    public List<ParkingFloor> getParkingFloorList(){
        return parkingFloorList;
    }

    public ParkingLocation isParkingAvailable(Vehicle vehicle){
        int i = 0;
        while (i<MAX_FLOOR){
            ParkingFloor parkingFloor = parkingFloorList.get(i);
            for(ParkingSlot parkingSlot : parkingFloor.getParkingSlotList()){
                if(parkingSlot.isParkingSlotAvailableForVehicle(vehicle)) {
                    return new ParkingLocation(parkingFloor, parkingSlot);
                }
            }
            i++;
        }
        return null;
    }

}
