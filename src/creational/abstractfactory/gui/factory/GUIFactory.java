package creational.abstractfactory.gui.factory;

import creational.abstractfactory.gui.button.Button;
import creational.abstractfactory.gui.checkbox.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
