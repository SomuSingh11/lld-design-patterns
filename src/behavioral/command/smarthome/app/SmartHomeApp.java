package behavioral.command.smarthome.app;

import behavioral.command.smarthome.command.Command;
import behavioral.command.smarthome.command.LightOffCommand;
import behavioral.command.smarthome.command.LightOnCommand;
import behavioral.command.smarthome.command.SetTemperatureCommand;
import behavioral.command.smarthome.invoker.RemoteControl;
import behavioral.command.smarthome.receiver.Light;
import behavioral.command.smarthome.receiver.Thermostat;

public class SmartHomeApp {
    public static void main(String[] args) {
        Light light = new Light();
        Thermostat thermostat = new Thermostat();

        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);
        Command setTemp = new SetTemperatureCommand(thermostat, 25);

        RemoteControl remote = new RemoteControl();

        System.out.println("--- Executing Commands ---");
        remote.executeCommand(lightOn);
        remote.executeCommand(setTemp);
        remote.executeCommand(lightOff);

        System.out.println("\n--- Undoing Commands ---");
        remote.undoLast();
        remote.undoLast();
        remote.undoLast();
        remote.undoLast();
    }
}
