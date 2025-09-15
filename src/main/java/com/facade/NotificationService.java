package com.facade;

public class NotificationService {
    public void sendOrderConfirmation(String orderId){
        System.out.println("order confirmation sent for order :"+orderId);
    }

}
