import java.util.ArrayList;

public class ConferenceRoom extends Room {

    private int capacity;
    private double rate;
    private ArrayList<Guest> delegates;

    public ConferenceRoom(String name, double rate, int capacity){
        super(name);
        this.rate = rate;
        this.capacity = capacity;
        this.delegates = new ArrayList<>(); // do we need this?
    }

    public int getCapacity(){
        return this.capacity;
    }

    public double getRate(){
        return this.rate;
    }

}
