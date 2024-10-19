class Playlist {
    private Song head;

    public Playlist() {
        this.head = null;
    }

    public void addSong(String title) {
        Song newSong = new Song(title);
        if (head == null) {
            head = newSong;
        } else {
            Song temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newSong;
        }
    }

    public void displayPlaylist() {
        if (head == null) {
            System.out.println("No songs in the playlist.");
            return;
        }

        Song temp = head;
        while (temp != null) {
            System.out.println(temp.title);
            temp = temp.next;
        }
    }
}
