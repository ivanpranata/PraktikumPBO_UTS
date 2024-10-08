package Hotel;

public interface BookingManagement {
	void bookRoom(String roomType);
    boolean checkAvailability(String roomType);
    
}
