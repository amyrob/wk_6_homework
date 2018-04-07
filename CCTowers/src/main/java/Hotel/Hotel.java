package Hotel;

import Room.*;

import java.util.ArrayList;


public class Hotel {
    private String name;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<DiningRoom> diningRooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel(String name, ArrayList<Bedroom> bedrooms, ArrayList<DiningRoom> diningRooms, ArrayList<ConferenceRoom> conferenceRooms) {
        this.name = name;
        this.bedrooms = bedrooms;
        this.diningRooms = diningRooms;
        this.conferenceRooms = conferenceRooms;
    }

    public int checkGuestInToBedroom(Guest guest, RoomDetails roomNumber) {
        for (Bedroom bedroom : bedrooms) {
            if (bedrooms.size() < roomNumber.getCapacity())
            {
                bedroom.add(guest);
            }
        }
        return bedrooms.size();
    }

    public int checkOutGuestFromBedroom(Guest guest) {
        for (Bedroom bedroom : bedrooms)
            if (bedrooms.size() != 0) {
                bedroom.remove(guest);
            }
        {
            return bedrooms.size();
        }
    }

    public int checkGuestInToDiningRoom(Guest guest, RoomDetails roomNumber) {
        for (DiningRoom diningRoom : diningRooms) {
            if (diningRooms.size() < roomNumber.getCapacity())
            {
                diningRoom.add(guest);
            }
        }
        return diningRooms.size();
    }

    public int checkOutGuestFromDiningRoom(Guest guest) {
        for (DiningRoom diningRoom : diningRooms)
            if (diningRooms.size() != 0) {
                diningRoom.remove(guest);
            }
        {
            return diningRooms.size();
        }
    }

    public int checkGuestInToConferenceRoom(Guest guest, RoomDetails roomNumber) {
        for (ConferenceRoom conferenceRoom : conferenceRooms) {
            if (conferenceRooms.size() < roomNumber.getCapacity())
            {
                conferenceRoom.add(guest);
            }
        }
        return conferenceRooms.size();
    }

    public int checkOutGuestFromConferenceRoom(Guest guest) {
        for (ConferenceRoom conferenceRoom : conferenceRooms)
            if (conferenceRooms.size() != 0) {
                conferenceRoom.remove(guest);
            }
        {
            return conferenceRooms.size();
        }
    }
}

