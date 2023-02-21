package design_patterns.observer;

public class SendEmailOnOrderPlacedEvent implements OnOrderPlacedEventHandler{

    public SendEmailOnOrderPlacedEvent(){
        Amazon.getInstance().register(this);
    }
    @Override
    public void update() {
        System.out.println("Sending email to customer");
    }
}
