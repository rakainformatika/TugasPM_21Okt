//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {class Passenger {
        String name;
        Passenger next;

        // Constructor
        public Passenger(String name) {
            this.name = name;
            this.next = null;
        }
    }

        class Flight {
            private Passenger head;

            // Constructor
            public Flight() {
                this.head = null;
            }

            // Menambahkan penumpang di akhir daftar
            public void addPassenger(String name) {
                Passenger newPassenger = new Passenger(name);
                if (head == null) {
                    head = newPassenger;
                } else {
                    Passenger temp = head;
                    while (temp.next != null) {
                        temp = temp.next;
                    }
                    temp.next = newPassenger;
                }
            }

            // Menghapus penumpang berdasarkan nama
            public void removePassenger(String name) {
                if (head == null) {
                    System.out.println("No passengers to remove.");
                    return;
                }

                if (head.name.equals(name)) {
                    head = head.next;
                    return;
                }

                Passenger current = head;
                Passenger prev = null;

                while (current != null && !current.name.equals(name)) {
                    prev = current;
                    current = current.next;
                }

                if (current == null) {
                    System.out.println("Passenger not found.");
                } else {
                    prev.next = current.next;
                }
            }

            // Menampilkan semua penumpang
            public void displayPassengers() {
                if (head == null) {
                    System.out.println("No passengers.");
                    return;
                }

                Passenger temp = head;
                while (temp != null) {
                    System.out.println(temp.name);
                    temp = temp.next;
                }
            }
        }

    }
}