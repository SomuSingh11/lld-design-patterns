package behavioral.command.textEditor.invoker;

import behavioral.command.textEditor.command.Command;

import java.util.Stack;

public class EditorInvoker {
    private final Stack<Command> undoStack = new Stack<>();
    private final Stack<Command> redoStack = new Stack<>();

    public void execute(Command command){
        command.execute();
        undoStack.push(command);
        redoStack.clear();
    }

    public void undo(){
        if(!undoStack.isEmpty()){
            Command command = undoStack.pop();
            command.undo();
            redoStack.push(command);
        } else {
            System.out.println("Nothing to undo.");
        }
    }

    public void redo() {
        if (!redoStack.isEmpty()) {
            Command command = redoStack.pop();
            command.execute();
            undoStack.push(command);
        } else {
            System.out.println("Nothing to redo.");
        }
    }
}
