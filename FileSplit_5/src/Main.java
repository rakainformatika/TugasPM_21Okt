import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TextFileSplitter splitter = new TextFileSplitter();
        Scanner scanner = new Scanner(System.in);

        // Get the file path from the user
        System.out.print("Enter the file path: ");
        String filePath = scanner.nextLine();

        // Read the file
        splitter.readFile(filePath);

        // Get the size of each part from the user
        System.out.print("Enter the size of each part (in characters): ");
        int partSize = scanner.nextInt();

        // Split the file into parts
        splitter.splitFile(partSize);

        System.out.println("File has been split successfully.");
    }
}
