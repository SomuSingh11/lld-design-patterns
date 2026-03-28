package behavioral.command.textEditor.command;

import behavioral.command.textEditor.receiver.TextEditor;

public class DeleteCommand implements Command {
    private final TextEditor editor;
    private final int count;
    private String deletedText;

    public DeleteCommand(TextEditor editor, int count){
        this.editor = editor;
        this.count = count;
    }

    @Override
    public void execute(){
        deletedText = editor.deleteLast(count);
        System.out.println("Deleted: \"" + deletedText + "\"");
    }

    @Override
    public void undo(){
        editor.append(deletedText);
        System.out.println("Undo delete: restored \"" + deletedText + "\"");
    }
}
