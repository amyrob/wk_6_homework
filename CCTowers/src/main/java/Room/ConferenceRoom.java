package Room;

public class ConferenceRoom extends Room {
    private int dailyRate;

    public ConferenceRoom(RoomDetails roomNumber, int dailyRate) {
        super(roomNumber);
        this.dailyRate = dailyRate;
    }

    public int getDailyRate() {
        return this.dailyRate;
    }
}
