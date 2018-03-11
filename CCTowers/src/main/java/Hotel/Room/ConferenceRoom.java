package Hotel.Room;
import Hotel.Guest;

public class ConferenceRoom extends Room {
    private int dailyRate;

    public ConferenceRoom(RoomNumber roomNumber, Guest guest, int dailyRate) {
        super(roomNumber);
        this.dailyRate = dailyRate;
    }

    public int getDailyRate() {
        return this.dailyRate;
    }
}
