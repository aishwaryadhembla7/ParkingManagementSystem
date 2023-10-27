package com.parking.ParkingManagementSystem.models;

public class CardPaymentMode implements PaymentMode{

    private int cardNumber;
    private String cardName;

    public CardPaymentMode(int cardNumber, String cardName){
        this.cardNumber = cardNumber;
        this.cardName = cardName;
    }

    @Override
    public void pay(double amount) {

    }
}
