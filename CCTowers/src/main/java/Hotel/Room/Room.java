package Hotel.Room;

import Hotel.Guest;

import java.util.ArrayList;

public abstract class Room {
    private RoomDetails roomNumber;
    private ArrayList<Guest> guests;

    public Room(RoomDetails roomNumber) {
        this.roomNumber = roomNumber;
        this.guests = new ArrayList<>();
    }

    public RoomDetails getRoomNumber() {
        return this.roomNumber;
    }

    public int getCapacity() {
        return roomNumber.getCapacity();
    }

    public String getType() {
        return roomNumber.type();
    }

    public void add(Guest guest) {
        this.guests.add(guest);
    }

    public int count() {
        return this.guests.size();
    }

    public void remove(Guest guest) {
        this.guests.remove(guest);
    }
}