public class Bedroom extends Room {

    private RoomType roomType;
    private double rate;

    public Bedroom(String name, RoomType roomType, double rate){
    super(name);
    this.roomType = roomType;
    this.rate = rate;
    }

    public RoomType getRoomType(){
        return this.roomType;
    }

    public double getRate(){
        return this.rate;
    }

}


// Method to get capacity from Enum, taken from Cards exercise?

//public int getCapacityFromEnum() {
//        return this.roomType.getCapacity();
//}
