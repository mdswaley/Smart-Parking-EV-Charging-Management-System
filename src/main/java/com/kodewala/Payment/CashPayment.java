package com.kodewala.Payment;

public class CashPayment implements Payment{
    @Override
    public boolean pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Cash");
        return true;
    }
}
