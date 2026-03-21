package creational.abstractfactory.gui.button;

public class LinuxButton implements Button {
    @Override
    public void paint(){
        System.out.println("Painting a Linux-style button.");
    }
    @Override
    public void onClick() {
        System.out.println("Linux button clicked.");
    }
}
