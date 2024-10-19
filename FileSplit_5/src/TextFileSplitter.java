import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class TextFileSplitter {
    private Queue<String> textQueue;

    public TextFileSplitter() {
        textQueue = new LinkedList<>();
    }

    // Method to read a file and store the content in the queue
    public void readFile(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                textQueue.offer(line); // Add each line to the queue
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    // Method to split the content of the file into parts
    public void splitFile(int partSize) {
        int partNumber = 1;
        StringBuilder partContent = new StringBuilder();

        while (!textQueue.isEmpty()) {
            partContent.append(textQueue.poll()).append("\n");
            if (partContent.length() >= partSize || textQueue.isEmpty()) {
                savePartToFile(partContent.toString(), partNumber);
                partNumber++;
                partContent.setLength(0); // Clear the StringBuilder for the next part
            }
        }
    }

    // Method to save each part into a new file
    private void savePartToFile(String content, int partNumber) {
        String fileName = "part" + partNumber + ".txt";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            bw.write(content);
            System.out.println("Saved part " + partNumber + " to " + fileName);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
