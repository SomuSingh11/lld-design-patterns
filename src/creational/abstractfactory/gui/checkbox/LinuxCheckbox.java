package creational.abstractfactory.gui.checkbox;

public class LinuxCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Painting a Linux-style checkbox.");
    }

    @Override
    public void onSelect() {
        System.out.println("Linux checkbox selected.");
    }
}
