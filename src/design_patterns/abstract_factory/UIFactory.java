package design_patterns.abstract_factory;

import design_patterns.abstract_factory.components.buttons.Button;
import design_patterns.abstract_factory.components.dropdowns.DropDown;
import design_patterns.abstract_factory.components.menus.Menu;

public interface UIFactory {
    Button createButton();
    Menu createMenu();
    DropDown createDropDown();
}
