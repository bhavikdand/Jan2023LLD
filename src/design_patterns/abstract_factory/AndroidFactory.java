package design_patterns.abstract_factory;

import design_patterns.abstract_factory.components.buttons.AndroidButton;
import design_patterns.abstract_factory.components.buttons.Button;
import design_patterns.abstract_factory.components.dropdowns.AndroidDropDown;
import design_patterns.abstract_factory.components.dropdowns.DropDown;
import design_patterns.abstract_factory.components.menus.AndroidMenu;
import design_patterns.abstract_factory.components.menus.Menu;

public class AndroidFactory implements UIFactory{
    @Override
    public AndroidButton createButton() {
        return new AndroidButton();
    }

    @Override
    public AndroidMenu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public AndroidDropDown createDropDown() {
        return new AndroidDropDown();
    }
}
