package Hotel.Room;

public enum RoomDetails {
    ROOM1(1, "Single"),
    ROOM2(2, "Double"),
    CONFERENCEROOM1(50, "Conference"),
    AZURE(76, "Dining");

    private int capacity;
    private String type;

    RoomDetails(int capacity, String type) {
        this.capacity = capacity;
        this.type = type;

    }
    public int getCapacity() {
        return this.capacity;
    }
    public String type() {
        return this.type;
    }
}
