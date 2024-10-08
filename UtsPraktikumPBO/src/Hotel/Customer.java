package Hotel;

public class Customer {
	String name;
    String email;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

 
    public void bookRoom(hotel hotel, String roomType) {
        System.out.println(name + " memesan kamar tipe " + roomType);
        hotel.bookRoom(roomType);
    }
}
