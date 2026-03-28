package behavioral.command.smarthome.receiver;

public class Thermostat {
    private int currentTemperature = 20;

    public void setTemperature(int temp){
        System.out.println("Thermostat set to " + temp + "C");
        this.currentTemperature = temp;
    }

    public int getCurrentTemperature() {
        return currentTemperature;
    }
}
