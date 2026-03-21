package creational.abstractfactory.gui.app;

import creational.abstractfactory.gui.factory.GUIFactory;
import creational.abstractfactory.gui.factory.LinuxFactory;
import creational.abstractfactory.gui.factory.MaxOSFactory;
import creational.abstractfactory.gui.factory.WindowsFactory;

public class AppLauncher {
    public static void main(String[] args) {
        String os = System.getProperty("os.name");
        GUIFactory factory;

        if(os.contains("Windows")){
            factory = new WindowsFactory();
        } else if(os.contains("Linux")) {
            factory = new LinuxFactory();
        } else {
            factory = new MaxOSFactory();
        }

        Application app = new Application(factory);
        app.renderUI();
    }
}
