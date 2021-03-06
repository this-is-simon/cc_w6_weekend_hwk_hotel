import java.util.ArrayList;

public class Hotel {

    private String name;
    private ArrayList<Guest> guestList;
    private ArrayList<Bedroom> bedrooms;

    public Hotel(String name, ArrayList<Bedroom> bedrooms){
        this.name = name;
        this.bedrooms = bedrooms;
        this.guestList = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public int countRooms(){
        return bedrooms.size();
    }

    public int countGuests(){
        return guestList.size();
    }

    public void addGuest(Guest guest){
        guestList.add(guest);
    }

    public void removeGuest(Guest guest){
        if (guestList.size() > 0) {guestList.remove(guest);}
    }

    public void addGuestToRoomInHotel(Guest guest, Room room){
        room.addAGuest(guest);
    }

    public ArrayList<Guest> getHotelGuestListByRoom(Room room){
        for (int i = 0; i < bedrooms.size(); i++) {
            if (bedrooms.get(i) == room){
                return room.getGuestsByRoom();
            }
        }
        return null;
    }

}
