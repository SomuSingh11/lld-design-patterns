package behavioral.command.textEditor.receiver;

public class TextEditor {
    private StringBuilder content = new StringBuilder();

    public void append(String text){
        content.append(text);
    }

    public String deleteLast(int count){
        int start = Math.max(0, content.length()-count);
        String deleted = content.substring(start);
        content.delete(start, content.length());
        return deleted;
    }

    public String getContent(){
        return content.toString();
    }
}
