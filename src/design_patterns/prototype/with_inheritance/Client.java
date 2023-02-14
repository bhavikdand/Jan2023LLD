package design_patterns.prototype.with_inheritance;

public class Client {

    public static final String GREEN_IPHONE = "GREEN_IPHONE";
    public static final String GREEN_IPHONE_15 = "GREEN_IPHONE_15";
    public static final String BLUE_IPHONE = "BLUE_IPHONE";
    public static final String BLUE_IPHONE_15 = "BLUE_IPHONE_15";


    public static void main(String[] args) {
        Registry<Iphone> iphoneRegistry = new Registry<>();
        populateRegistry(iphoneRegistry);

        Iphone green1 = iphoneRegistry.get(GREEN_IPHONE).clone();
        Iphone blue1 = iphoneRegistry.get(BLUE_IPHONE).clone();

        System.out.println("DEBUG");
    }

    private static void populateRegistry(Registry<Iphone> iphoneRegistry) {
        Iphone greenIphone = new Iphone();
        greenIphone.setColor("Green");
        greenIphone.setImei("uuid");
        greenIphone.setHeight(5);
        greenIphone.setWidth(3);
        greenIphone.setWeight(100);

        Iphone blueIphone = new Iphone();
        blueIphone.setColor("Blue");
        blueIphone.setImei("uuid");
        blueIphone.setHeight(5);
        blueIphone.setWidth(3);
        blueIphone.setWeight(100);

        Iphone15 greenIphone15 = new Iphone15();
        greenIphone15.setColor("Green");
        greenIphone15.setImei("uuid");
        greenIphone15.setHeight(5);
        greenIphone15.setWidth(3);
        greenIphone15.setWeight(100);
        greenIphone15.setCrashDetectionSensor("yes");

        Iphone15 blueIphone15 = new Iphone15();
        blueIphone15.setColor("Blue");
        blueIphone15.setImei("uuid");
        blueIphone15.setHeight(5);
        blueIphone15.setWidth(3);
        blueIphone15.setWeight(100);
        blueIphone15.setCrashDetectionSensor("yes");



        iphoneRegistry.register(GREEN_IPHONE, greenIphone);
        iphoneRegistry.register(BLUE_IPHONE, blueIphone);
        iphoneRegistry.register(GREEN_IPHONE_15, greenIphone15);
        iphoneRegistry.register(BLUE_IPHONE_15, blueIphone15);
    }
}
