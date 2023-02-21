package design_patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Amazon {

    private Amazon(){

    }

    private static Amazon INSTANCE = null;

    public static Amazon getInstance(){
        if(INSTANCE == null){
            INSTANCE = new Amazon();
        }
        return INSTANCE;
    }
    private List<OnOrderPlacedEventHandler> onOrderPlacedSubscribers = new ArrayList<>();

    public void register(OnOrderPlacedEventHandler eventHandler){
        onOrderPlacedSubscribers.add(eventHandler);
    }

    public void unregister(OnOrderPlacedEventHandler eventHandler){
        onOrderPlacedSubscribers.remove(eventHandler);
    }

    public void placeOrder(){
        for(OnOrderPlacedEventHandler eventHandler: onOrderPlacedSubscribers){
            eventHandler.update();
        }
    }
}
