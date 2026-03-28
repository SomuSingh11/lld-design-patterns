package behavioral.command.smarthome.invoker;

import behavioral.command.smarthome.command.Command;

import java.util.Stack;

public class RemoteControl {
    private final Stack<Command> history = new Stack<>();

    public void executeCommand(Command command){
        command.execute();
        history.push(command);
    }

    public void undoLast(){
        if(!history.isEmpty()){
            Command lastCommand = history.pop();
            lastCommand.undo();
        } else {
            System.out.println("Nothing to undo");
        }
    }
}
