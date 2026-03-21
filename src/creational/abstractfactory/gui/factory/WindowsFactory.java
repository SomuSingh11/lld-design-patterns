package creational.abstractfactory.gui.factory;

import creational.abstractfactory.gui.button.Button;
import creational.abstractfactory.gui.button.WindowsButton;
import creational.abstractfactory.gui.checkbox.Checkbox;
import creational.abstractfactory.gui.checkbox.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton(){
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
