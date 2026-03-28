package behavioral.command.textEditor.app;

import behavioral.command.textEditor.command.Command;
import behavioral.command.textEditor.command.DeleteCommand;
import behavioral.command.textEditor.command.TypeCommand;
import behavioral.command.textEditor.invoker.EditorInvoker;
import behavioral.command.textEditor.receiver.TextEditor;

public class TextEditorApp {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        EditorInvoker invoker = new EditorInvoker();

        invoker.execute(new TypeCommand(editor, "Hello"));
        invoker.execute(new TypeCommand(editor, " World"));
        invoker.execute(new TypeCommand(editor, "!"));
        System.out.println("Content: \"" + editor.getContent() + "\"");

        System.out.println("\n--- Undo ---");
        invoker.undo();
        System.out.println("Content: \"" + editor.getContent() + "\"");

        invoker.undo();
        System.out.println("Content: \"" + editor.getContent() + "\"");

        System.out.println("\n--- Redo ---");
        invoker.redo();
        System.out.println("Content: \"" + editor.getContent() + "\"");

        System.out.println("\n--- New operation clears redo ---");
        invoker.execute(new DeleteCommand(editor, 3));
        System.out.println("Content: \"" + editor.getContent() + "\"");

        invoker.redo();

        System.out.println("\n--- Undo delete ---");
        invoker.undo();
        System.out.println("Content: \"" + editor.getContent() + "\"");
    }
}
