package behavioral.command.textEditor.command;

import behavioral.command.textEditor.receiver.TextEditor;

public class TypeCommand implements Command {
    private final TextEditor editor;
    private final String text;

    public TypeCommand(TextEditor editor, String text){
        this.editor = editor;
        this.text = text;
    }

    @Override
    public void execute(){
        editor.append(text);
        System.out.println("Typed: \"" + text + "\"");
    }

    @Override
    public void undo(){
        editor.deleteLast(text.length());
        System.out.println("Undo type: \"" + text + "\"");
    }
}
