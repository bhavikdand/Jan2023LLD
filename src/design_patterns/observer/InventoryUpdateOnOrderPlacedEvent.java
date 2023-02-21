package design_patterns.observer;

public class InventoryUpdateOnOrderPlacedEvent implements OnOrderPlacedEventHandler{

    public InventoryUpdateOnOrderPlacedEvent(){
        Amazon.getInstance().register(this);
    }

    @Override
    public void update() {
        System.out.println("Inventory updated");
    }
}
