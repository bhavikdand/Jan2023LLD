package design_patterns.prototype.basic;

public class Client {

    public static final String GREEN_IPHONE = "GREEN_IPHONE";
    public static final String BLUE_IPHONE = "BLUE_IPHONE";

    public static void main(String[] args) {
        Registry<Iphone> iphoneRegistry = new Registry<>();
        populateRegistry(iphoneRegistry);

        Iphone green1 = iphoneRegistry.get(GREEN_IPHONE).clone();
        Iphone blue1 = iphoneRegistry.get(BLUE_IPHONE).clone();

        System.out.println("DEBUG");
    }

    private static void populateRegistry(Registry<Iphone> iphoneRegistry) {
        Iphone greenIphone = new Iphone(5,3,100,"uuid", "green");
        Iphone blueIphone = new Iphone(5,3,100,"uuid", "blue");


        iphoneRegistry.register(GREEN_IPHONE, greenIphone);
        iphoneRegistry.register(BLUE_IPHONE, blueIphone);
    }
}
