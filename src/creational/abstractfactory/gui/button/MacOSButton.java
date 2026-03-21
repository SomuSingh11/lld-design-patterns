package creational.abstractfactory.gui.button;

public class MacOSButton implements Button{
    @Override
    public void paint() {
        System.out.println("Painting a macOS-style button.");
    }

    @Override
    public void onClick() {
        System.out.println("macOS button clicked.");
    }
}
