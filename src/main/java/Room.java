import java.util.ArrayList;

public abstract class Room {
    private String name;
    private ArrayList<Guest> occupants;

    public Room(String name){
        this.name = name;
        this.occupants = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public int numberOfGuests(){
        return occupants.size();
    }

    public void addAGuest(Guest guest){
        occupants.add(guest);
    }

}
