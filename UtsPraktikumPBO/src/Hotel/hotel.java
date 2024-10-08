package Hotel;

class hotel implements BookingManagement {

    private int availableSingleRooms = 5;
    private int availableDoubleRooms = 3;


    public void bookRoom(String roomType) 
    {
        if (checkAvailability(roomType)) 
        {
            if (roomType.equalsIgnoreCase("Single")) 
            {
                availableSingleRooms--;
            } 
       else if (roomType.equals("Double")) 
       		{
                availableDoubleRooms--;
            }
            	System.out.println("Kamar tipe " + roomType + " berhasil dipesan.");
        } 
        	else {
        			System.out.println("Maaf, kamar " + roomType + " tidak tersedia.");
        		 }
    }


    public boolean checkAvailability(String roomType) {
        if (roomType.equals("Single")) {
            return availableSingleRooms > 0;
        } else if (roomType.equals("Double")) {
            return availableDoubleRooms > 0;
        }
        return false;
    }

    public int getavailableSingleRooms() {
    	return availableSingleRooms;
    }
   
    
    public void viewBookings() {
        System.out.println("Kamar Single tersisa: " + availableSingleRooms);
        System.out.println("Kamar Double tersisa: " + availableDoubleRooms);
    }
    
    
    
    
    
}
