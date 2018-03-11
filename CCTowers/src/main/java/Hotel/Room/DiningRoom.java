package Hotel.Room;
import Hotel.Guest;

public class DiningRoom extends Room {
    private int menuPrice;

    public DiningRoom(RoomNumber roomNumber, Guest guest, int menuPrice) {
        super(roomNumber);
        this.menuPrice = menuPrice;
    }

    public int getMenuPrice() {
        return this.menuPrice;
    }
}
