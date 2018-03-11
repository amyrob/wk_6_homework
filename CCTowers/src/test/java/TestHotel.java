package Hotel;
import Hotel.Guest;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestHotel {
    Hotel hotel;
    Guest guest;

    @Before
    public void before() {
        hotel = new Hotel(hotel);
        guest = new Guest();
    }



}
