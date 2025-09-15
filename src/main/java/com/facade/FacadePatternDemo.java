package com.facade;
public class FacadePatternDemo {
    public static void main(String[] args) {
        OrderFacade orderFacade = new OrderFacade();

        orderFacade.placeOrder("ORD123", "iPhone 15", "user123", 1200.00);
        orderFacade.placeOrder("ORD124", "MacBook Pro", "user456", 2500.00);
    }
}