package Hotel;
import Room.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class TestHotel {
    Hotel hotel;
    Guest guest;
    Bedroom bedroom1, bedroom2;
    DiningRoom diningRoom;
    ConferenceRoom conferenceRoom;

    @Before
    public void before() {
        guest = new Guest("Brodie Robertson");

        bedroom1 = new Bedroom(RoomDetails.ROOM1, 100);
        bedroom2 = new Bedroom(RoomDetails.ROOM2, 120);
        ArrayList<Bedroom> bedrooms = new ArrayList<>();
        bedrooms.addAll(Arrays.asList(bedroom1, bedroom2));

        diningRoom = new DiningRoom(RoomDetails.AZURE, guest, 75);
        ArrayList<DiningRoom> diningRooms = new ArrayList<>();
        diningRooms.addAll(Arrays.asList(diningRoom));

        conferenceRoom = new ConferenceRoom(RoomDetails.CONFERENCEROOM1, 1000);
        ArrayList<ConferenceRoom> conferenceRooms = new ArrayList<>();
        conferenceRooms.addAll(Arrays.asList(conferenceRoom));

        hotel = new Hotel("The Pokey Wee Inn", bedrooms, diningRooms, conferenceRooms);
    }

    @Test
    public void canCheckGuestInToBedroom() {
        hotel.checkGuestInToBedroom(guest, RoomDetails.ROOM1);
        assertEquals(1, bedroom1.count());
    }

    @Test
    public void canCheckOutGuestFromBedroom() {
        hotel.checkGuestInToBedroom(guest, RoomDetails.ROOM1);
        hotel.checkOutGuestFromBedroom(guest);
        assertEquals(0, bedroom1.count());
    }

    @Test
    public void canCheckGuestInToDiningRoom() {
        hotel.checkGuestInToDiningRoom(guest, RoomDetails.AZURE);
        assertEquals(1, diningRoom.count());
    }

    @Test
    public void canCheckOutGuestFromDiningRoom() {
        hotel.checkGuestInToDiningRoom(guest, RoomDetails.AZURE);
        hotel.checkOutGuestFromDiningRoom(guest);
        assertEquals(0, diningRoom.count());
    }

    @Test
    public void canCheckGuestInToConferenceRoom() {
        hotel.checkGuestInToConferenceRoom(guest, RoomDetails.CONFERENCEROOM1);
        assertEquals(1, conferenceRoom.count());
    }

    @Test
    public void canCheckOutGuestFromConferenceRoom() {
        hotel.checkGuestInToConferenceRoom(guest, RoomDetails.CONFERENCEROOM1);
        hotel.checkOutGuestFromConferenceRoom(guest);
        assertEquals(0, conferenceRoom.count());
    }
}
