package Hotel;

public class Admin 
{
	String username;

	    public Admin(String username) 
	    {
	        this.username = username;
	    }

	 
	    public void viewBookings(hotel hotel) 
	    {
	        System.out.println("Admin " + username + " melihat semua pemesanan:");
	        hotel.viewBookings();
	    }
}
