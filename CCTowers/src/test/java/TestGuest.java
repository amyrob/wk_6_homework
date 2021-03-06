import Hotel.Guest;
import Room.Bedroom;
import Room.RoomDetails;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestGuest {
    Guest guest;
    Bedroom room;

    @Before
    public void before() {
        guest = new Guest("Brodie Robertson");
        room = new Bedroom(RoomDetails.ROOM1, 100);
    }

    @Test
    public void canGetname() {
        assertEquals("Brodie Robertson", guest.getName());
    }
    @Test
    public void canAddGuestToRoom() {
        room.add(guest);
        assertEquals(1, room.count());
    }
    @Test
    public void canRemoveGuestFromRoom() {
        room.add(guest);
        room.add(guest);
        room.remove(guest);
        assertEquals(1, room.count());
    }
}
