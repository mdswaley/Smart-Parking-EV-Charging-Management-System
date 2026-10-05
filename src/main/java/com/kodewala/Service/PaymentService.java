package com.kodewala.Service;

import com.kodewala.Payment.Payment;

public class PaymentService {
    public boolean processPayment(Payment payment, double amount){
        if (amount <= 0){
            throw new IllegalArgumentException("Payment amount must be greater than zero");
        }

        return payment.pay(amount);
    }
}
