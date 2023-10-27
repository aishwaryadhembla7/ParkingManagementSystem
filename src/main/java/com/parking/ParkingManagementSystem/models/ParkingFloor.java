package com.parking.ParkingManagementSystem.models;

import java.util.ArrayList;
import java.util.List;

public class ParkingFloor {
    public static final int MAX_PARKING_SLOT = 10;
    int               parkingFloorId;
    List<ParkingSlot> parkingSlotList;

    public ParkingFloor(int parkingFloorId){
        this.parkingFloorId = parkingFloorId;
        parkingSlotList = new ArrayList<>();
        int i = 0;
        while(i < MAX_PARKING_SLOT / 2){
            parkingSlotList.add(new ParkingSlot(i, VehicleType.CAR));
            i++;
        }
        while(i < MAX_PARKING_SLOT){
            parkingSlotList.add(new ParkingSlot(i, VehicleType.BIKE));
            i++;
        }
    }
    public int getParkingFloorId(){
        return parkingFloorId;
    }
    public List<ParkingSlot> getParkingSlotList(){
        return parkingSlotList;
    }
}
