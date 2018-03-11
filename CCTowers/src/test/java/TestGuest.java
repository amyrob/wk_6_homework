import Hotel.Guest;
import Hotel.Room.Bedroom;
import Hotel.Room.RoomNumber;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestGuest {
    Guest guest;
    Bedroom room;

    @Before
    public void before() {
        guest = new Guest();
        room = new Bedroom(RoomNumber.ROOM1, 100);
    }
    @Test
    public void canAddGuestToRoom() {
        room.add(guest);
        assertEquals(1, room.count());
    }

}
