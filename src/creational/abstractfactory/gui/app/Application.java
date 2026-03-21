package creational.abstractfactory.gui.app;

import creational.abstractfactory.gui.button.Button;
import creational.abstractfactory.gui.checkbox.Checkbox;
import creational.abstractfactory.gui.factory.GUIFactory;

public class Application {
    private final Button button;
    private final Checkbox checkbox;

    public Application(GUIFactory factory){
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
    }

    public void renderUI(){
        button.paint();
        checkbox.paint();
    }
}
