package design_patterns.abstract_factory;

public class UIFactoryFactory {

    public static UIFactory getUIFactoryByName(String platform){
        if(platform.equalsIgnoreCase("Android")){
            return new AndroidFactory();
        } else if(platform.equalsIgnoreCase("iOS")){
            return new IosFactory();
        }
        else {
            return null;
        }
    }
}
