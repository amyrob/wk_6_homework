import Hotel.Guest;
import Room.DiningRoom;
import Room.RoomDetails;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDiningRoom {
    DiningRoom diningRoom;
    Guest guest;

    @Before
    public void before() {
        diningRoom = new DiningRoom(RoomDetails.AZURE, guest, 75);
    }

    @Test
    public void canGetMenuPrice() {
        assertEquals(75, diningRoom.getMenuPrice());
    }
}
