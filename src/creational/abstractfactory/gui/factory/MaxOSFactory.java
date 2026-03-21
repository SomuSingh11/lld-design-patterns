package creational.abstractfactory.gui.factory;

import creational.abstractfactory.gui.button.Button;
import creational.abstractfactory.gui.button.MacOSButton;
import creational.abstractfactory.gui.checkbox.Checkbox;
import creational.abstractfactory.gui.checkbox.MacOSCheckbox;

public class MaxOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
