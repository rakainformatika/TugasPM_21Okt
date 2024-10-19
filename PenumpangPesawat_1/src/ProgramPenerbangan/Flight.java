package ProgramPenerbangan;
class Flight {
    private Passenger head;

    public Flight() {
        this.head = null;
    }

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

    public void removePassenger(String name) {
        if (head == null) {
            System.out.println("Tidak ada penumpang yang harus dikeluarkan");
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
            System.out.println("Penumpang tidak ditemukan.");
        } else {
            prev.next = current.next;
        }
    }

    public void displayPassengers() {
        if (head == null) {
            System.out.println("Tidak ada penumpang");
            return;
        }

        Passenger temp = head;
        while (temp != null) {
            System.out.println(temp.name);
            temp = temp.next;
        }
    }
}
