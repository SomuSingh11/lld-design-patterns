package behavioral.command.smarthome.command;

import behavioral.command.smarthome.receiver.Thermostat;

public class SetTemperatureCommand implements Command {
    private final Thermostat thermostat;
    private final int newTemperature;
    private int prevTemperature;

    public SetTemperatureCommand(Thermostat thermostat, int temperature) {
        this.thermostat = thermostat;
        this.newTemperature = temperature;
    }

    @Override
    public void execute(){
        prevTemperature = thermostat.getCurrentTemperature();
        thermostat.setTemperature(newTemperature);
    }

    @Override
    public void undo(){
        thermostat.setTemperature(prevTemperature);
    }
}
