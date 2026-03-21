package creational.abstractfactory.gui.factory;

import creational.abstractfactory.gui.button.Button;
import creational.abstractfactory.gui.button.LinuxButton;
import creational.abstractfactory.gui.checkbox.Checkbox;
import creational.abstractfactory.gui.checkbox.LinuxCheckbox;

public class LinuxFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new LinuxCheckbox();
    }
}
