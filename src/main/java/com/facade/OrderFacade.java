package com.facade;

class OrderFacade {
    private InventoryService inventory;
    private PaymentService payment;
    private DeliveryService delivery;
    private NotificationService notification;

    public OrderFacade() {
        this.inventory = new InventoryService();
        this.payment = new PaymentService();
        this.delivery = new DeliveryService();
        this.notification = new NotificationService();
    }

    public void placeOrder(String orderId, String item, String account, double amount) {
        System.out.println("Placing order: " + orderId);
        inventory.updateInventory(item);
        payment.processPayment(account, amount);
        delivery.assignDeliveryPartner(orderId);
        notification.sendOrderConfirmation(orderId);
        System.out.println("Order placed successfully!\n");
    }
}
