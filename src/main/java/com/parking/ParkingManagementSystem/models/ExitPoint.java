package com.parking.ParkingManagementSystem.models;

public class ExitPoint {
    public void onExit(Ticket ticket, PaymentMode paymentMode){
        ParkingLocation parkingLocation = ticket.getParkingLocation();
        ParkingSlot parkingSlot = parkingLocation.getParkingSlot();
        parkingSlot.vacateParkingSlot();
        long startTime = ticket.getStartTime();
        long exitTime = System.currentTimeMillis();
        long duration = exitTime - startTime;
        double amount = calculateParkingCost(duration, parkingSlot.getVehicleType());
        makePayment(amount, paymentMode);
    }

    private double calculateParkingCost(long duration, VehicleType vehicleType) {
        return switch (vehicleType) {
            case CAR -> duration * 100;
            case BIKE -> duration * 50;
        };
    }

    public void makePayment(double amount,  PaymentMode paymentMode){
        paymentMode.pay(amount);

    }

}
