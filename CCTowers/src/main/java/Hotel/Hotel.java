package Hotel;

import Hotel.Room.*;

import java.util.ArrayList;

import static com.sun.tools.internal.xjc.reader.Ring.add;

public class Hotel {
    private Hotel hotel;
    private ArrayList<Bedroom> bedroom;
    private ArrayList<DiningRoom> diningRoom;
    private ArrayList<ConferenceRoom> conferenceRoom;
    private RoomNumber roomNumber;

    public Hotel(Hotel hotel, ArrayList<Bedroom> bedroom, ArrayList<DiningRoom> diningRoom,ArrayList<ConferenceRoom> conferenceRoom, RoomNumber roomNumber) {
        this.hotel = hotel;
        this.bedroom = bedroom;
        this.diningRoom = diningRoom;
        this.conferenceRoom = conferenceRoom;
        this.roomNumber = roomNumber;
    }

    public int checkInGuest(Guest guest) {
        if (bedroom.size() < roomNumber.getCapacity()) {
            add(guest);
        }
        return bedroom.size();
    }

    public int checkOutGuest() {
        if (bedroom.size()!= 0) bedroom.clear();
        return bedroom.size();
    }
}
