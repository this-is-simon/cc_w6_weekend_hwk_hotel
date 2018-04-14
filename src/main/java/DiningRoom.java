import java.util.ArrayList;

public class DiningRoom extends Room {

    private int capacity;
    private ArrayList<Guest> diners;

    public DiningRoom(String name, int capacity){
        super(name);
        this.capacity = capacity;
        this.diners = new ArrayList<>();
    }

    public int getCapacity(){
        return this.capacity;
    }

    public int howManyPeopleInDiningRoom(){
        return this.diners.size();
    }

}
