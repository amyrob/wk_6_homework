package Hotel;
import Hotel.Guest;
import Hotel.Room.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestHotel {
    Hotel hotel;
    Guest guest;
    Bedroom bedroom1, bedroom2;
    DiningRoom diningRoom;
    ConferenceRoom conferenceRoom;
    RoomNumber roomNumber;

    @Before
    public void before() {
        guest = new Guest();
        bedroom1 = new Bedroom(RoomNumber.ROOM1, 100);
        bedroom2 = new Bedroom(RoomNumber.ROOM2, 120);
        diningRoom = new DiningRoom(RoomNumber.AZURE, guest, 75);
        conferenceRoom = new ConferenceRoom(RoomNumber.CONFERENCEROOM1, guest, 1000);
    }
    @Test
    public void canCheckInGuest() {
        hotel.checkInGuest(guest);
        assertEquals(1, bedroom1.count());
    }

    @Test
    public void canCheckOutGuest() {
        hotel.checkOutGuest();
        assertEquals(0, bedroom1.count());
    }
}
