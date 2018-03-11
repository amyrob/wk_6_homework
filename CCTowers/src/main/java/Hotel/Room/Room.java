package Hotel.Room;

import Hotel.Guest;

import java.util.ArrayList;

public abstract class Room {
    private Room room;
    private RoomNumber roomNumber;
    private ArrayList<Guest> guest;

    public Room(RoomNumber roomNumber) {
        this.room = room;
        this.roomNumber = roomNumber;
        this.guest = new ArrayList<>();
    }

    public RoomNumber getRoomNumber() {
        return this.roomNumber;
    }

    public int getCapacity() {
        return roomNumber.getCapacity();
    }

    public String getType() {
        return roomNumber.type();
    }

    public void add(Guest guest1) {
        this.guest.add(guest1);
    }

    public int count() {
        return this.guest.size();
    }

    public int checkInGuest(Guest guest1) {
        if (count() < roomNumber.getCapacity()) add(guest1);
        return count();
    }

    public int checkOutGuest() {
        if (count()!= 0) guest.clear();
        return count();
    }
}