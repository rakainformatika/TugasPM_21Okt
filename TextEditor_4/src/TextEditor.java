import java.util.Stack;

public class TextEditor {
    private String currentText;
    private Stack<String> undoStack;
    private Stack<String> redoStack;

    public TextEditor() {
        this.currentText = "";
        this.undoStack = new Stack<>();
        this.redoStack = new Stack<>();
    }

    public void write(String text) {
        undoStack.push(currentText);  // Simpan teks saat ini untuk undo
        currentText += text;           // Tambahkan teks baru
        redoStack.clear();             // Kosongkan redo stack
    }

    public void show() {
        System.out.println("Current Text: " + currentText);
    }

    public void undo() {
        if (!undoStack.isEmpty()) {
            redoStack.push(currentText);   // Simpan teks saat ini untuk redo
            currentText = undoStack.pop();  // Kembalikan teks sebelumnya
        } else {
            System.out.println("No actions to undo.");
        }
    }

    public void redo() {
        if (!redoStack.isEmpty()) {
            undoStack.push(currentText);    // Simpan teks saat ini untuk undo
            currentText = redoStack.pop();   // Kembalikan teks yang baru saja di-undo
        } else {
            System.out.println("No actions to redo.");
        }
    }
}
