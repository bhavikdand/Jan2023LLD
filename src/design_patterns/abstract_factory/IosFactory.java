package design_patterns.abstract_factory;

import design_patterns.abstract_factory.components.buttons.Button;
import design_patterns.abstract_factory.components.buttons.IosButton;
import design_patterns.abstract_factory.components.dropdowns.DropDown;
import design_patterns.abstract_factory.components.dropdowns.IosDropDown;
import design_patterns.abstract_factory.components.menus.IosMenu;
import design_patterns.abstract_factory.components.menus.Menu;

public class IosFactory implements UIFactory{

    @Override
    public IosButton createButton() {
        return new IosButton();
    }

    @Override
    public IosMenu createMenu() {
        return new IosMenu();
    }

    @Override
    public IosDropDown createDropDown() {
        return new IosDropDown();
    }
}
