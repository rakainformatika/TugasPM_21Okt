import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        Scanner scanner = new Scanner(System.in);

        boolean running = true;

        while (running) {
            System.out.println("Masukkan judul lagu (atau ketik 'stop' untuk berhenti): ");
            String title = scanner.nextLine();

            if (title.equalsIgnoreCase("stop")) {
                running = false;
            } else {
                playlist.addSong(title);
            }
        }

        System.out.println("\nPlaylist:");
        playlist.displayPlaylist();
    }
}
