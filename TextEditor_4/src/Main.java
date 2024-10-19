import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        Scanner scanner = new Scanner(System.in);
        String command;

        while (true) {
            System.out.println("\nCommands: write, show, undo, redo, exit");
            System.out.print("Enter command: ");
            command = scanner.nextLine();

            switch (command) {
                case "write":
                    System.out.print("Enter text to write: ");
                    String text = scanner.nextLine();
                    editor.write(text);
                    break;
                case "show":
                    editor.show();
                    break;
                case "undo":
                    editor.undo();
                    break;
                case "redo":
                    editor.redo();
                    break;
                case "exit":
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Unknown command. Try again.");
            }
        }
    }
}
