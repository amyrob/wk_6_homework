package Hotel.Room;

public class Bedroom extends Room {
    private int nightlyRate;

    public Bedroom(RoomNumber roomNumber, int nightlyRate) {
        super(roomNumber);
        this.nightlyRate = nightlyRate;
    }

    public int getRoomRate() {
        return this.nightlyRate;
    }
}
