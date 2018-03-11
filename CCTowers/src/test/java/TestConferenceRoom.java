import Hotel.Guest;
import Hotel.Room.ConferenceRoom;
import Hotel.Room.RoomNumber;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestConferenceRoom {
    ConferenceRoom  conferenceRoom;
    Guest  guest;

    @Before
    public void before() {
        conferenceRoom = new ConferenceRoom(RoomNumber.CONFERENCEROOM1, guest, 1000);
    }

    @Test
    public void canGetDailyRate() {
        assertEquals(1000, conferenceRoom.getDailyRate());
    }
}
