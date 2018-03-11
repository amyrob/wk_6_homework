import Hotel.Guest;
import Hotel.Room.Bedroom;
import Hotel.Room.RoomNumber;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBedroom {
    Bedroom bedroom;

    @Before
    public void before() {
        bedroom = new Bedroom(RoomNumber.ROOM1, 100 );
    }

    @Test
    public void canGetRoomNumber() {
        assertEquals(RoomNumber.ROOM1, bedroom.getRoomNumber());
    }

    @Test
    public void canGetRoomCapacity() {
        assertEquals(1, bedroom.getCapacity());
    }

    @Test
    public void canGetRoomType() {
        assertEquals("Single", bedroom.getType());
    }

    @Test
    public void canGetRoomRate() {
        assertEquals(100, bedroom.getRoomRate());
    }

}
