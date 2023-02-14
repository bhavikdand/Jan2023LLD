package design_patterns.abstract_factory;

import design_patterns.abstract_factory.components.buttons.Button;
import design_patterns.abstract_factory.components.dropdowns.DropDown;
import design_patterns.abstract_factory.components.menus.Menu;

public class Client {

    public static void main(String[] args) {
        Flutter flutter = new Flutter();
        UIFactory factory = flutter.createUIFactory("Android");

        Menu menu = factory.createMenu();
        DropDown dropDown = factory.createDropDown();
        Button button = factory.createButton();

    }
}
