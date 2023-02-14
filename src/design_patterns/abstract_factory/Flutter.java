package design_patterns.abstract_factory;

public class Flutter {

    void setRefreshRate(){

    }

    public UIFactory createUIFactory(String platform){
        return UIFactoryFactory.getUIFactoryByName(platform);
    }
}
