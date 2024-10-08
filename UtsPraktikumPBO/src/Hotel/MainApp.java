package Hotel;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        hotel hotel = new hotel();
        System.out.println("===============================================");
        System.out.println("| Selamat datang di Aplikasi Reservasi Hotel! |");
        System.out.println("===============================================");

        System.out.print(" Masukkan nama Anda:");
        String name = scanner.nextLine();
        System.out.println("===============================================");
        System.out.print(" Masukkan email Anda: ");
        String email = scanner.nextLine();
 
        
        
        Customer customer = new Customer(name, email);
        System.out.println("===============================================");
        System.out.println("| 1. Cek Ketersediaan Kamar                   |");
        System.out.println("| 2. Pesan Kamar                              |");
        System.out.println("===============================================");
        System.out.print(" Pilih opsi (1/2): ");
        int option = scanner.nextInt();

        if (option == 1) {
            System.out.print(" Masukkan tipe kamar (Single/Double): ");
            String roomType = scanner.next();
            if (hotel.checkAvailability(roomType)) {
            	System.out.println("===============================================");
                System.out.println("| Kamar tersedia: " + hotel.getavailableSingleRooms());
                System.out.println("===============================================");
            } else {
                System.out.println("Kamar tidak tersedia.");
            }
        } else if (option == 2) {
            System.out.print("Masukkan tipe kamar (Single/Double): ");
            String roomType = scanner.next();
            customer.bookRoom(hotel, roomType);
        }
    }
}
