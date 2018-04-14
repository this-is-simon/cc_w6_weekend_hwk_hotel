public enum RoomType {

    SINGLE_ROOM(1),
    DOUBLE_ROOM(2),
    FAMILY_ROOM(5);

    private final int roomType;

    RoomType(int roomType) {
        this.roomType = roomType;
    }

    public int getRoomType() {
        return roomType;
    }

}


// Should this be called RoomType or RoomCapacity?
