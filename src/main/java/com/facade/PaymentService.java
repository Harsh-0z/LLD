package com.facade;

public class PaymentService {
    public void processPayment(String account , double amount){
        System.out.println("Payment of "+amount+" processed from account :"+account);
    }
}
