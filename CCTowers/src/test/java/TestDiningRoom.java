import Hotel.Guest;
import Hotel.Room.DiningRoom;
import Hotel.Room.RoomNumber;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDiningRoom {
    DiningRoom diningRoom;
    Guest guest;

    @Before
    public void before() {
        diningRoom = new DiningRoom(RoomNumber.AZURE, guest, 75);
    }

    @Test
    public void canGetMenuPrice() {
        assertEquals(75, diningRoom.getMenuPrice());
    }
}
