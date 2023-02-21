package design_patterns.observer;

public class Client {

    public static void main(String[] args) {
        Amazon amazon = Amazon.getInstance();

        SendEmailOnOrderPlacedEvent sendEmailOnOrderPlacedEvent = new SendEmailOnOrderPlacedEvent();
        InventoryUpdateOnOrderPlacedEvent inventoryUpdateOnOrderPlacedEvent = new InventoryUpdateOnOrderPlacedEvent();

        amazon.placeOrder();

        sendEmailOnOrderPlacedEvent.unregister();
        System.out.println("------------------------");
        amazon.placeOrder();
    }
}
