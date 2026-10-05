package com.kodewala.Payment;

public class CardPayment implements Payment{
    @Override
    public boolean pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Card");
        return true;
    }
}
