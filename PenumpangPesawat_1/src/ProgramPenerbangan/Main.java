package ProgramPenerbangan;
public class Main {
    public static void main(String[] args) {
        Flight flight = new Flight();

        flight.addPassenger("Raka");
        flight.addPassenger("Briska");
        flight.addPassenger("Amar");

        System.out.println("Daftar penumpang:");
        flight.displayPassengers();

        flight.removePassenger("Briska");
        System.out.println("\nDaftar penumpang setelah menghapus Briska:");
        flight.displayPassengers();
    }
}
