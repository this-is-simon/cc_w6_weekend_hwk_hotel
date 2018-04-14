import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class HotelTest {

    Hotel hotel1;
    Bedroom bedroom1;
    Bedroom bedroom2;
    Bedroom bedroom3;
    ArrayList<Guest> guestList;
    Guest guest1;


    @Before
    public void before(){
        bedroom1 = new Bedroom("Rockefeller Suite", RoomType.SINGLE_ROOM, 100.00);
        bedroom2 = new Bedroom("Osbourne Suite", RoomType.DOUBLE_ROOM, 200.00);
        bedroom3 = new Bedroom("Atkins Suite", RoomType.FAMILY_ROOM, 300.00);

        ArrayList<Bedroom> bedrooms = new ArrayList<>();
        bedrooms.add(bedroom1);
        bedrooms.add(bedroom2);
        bedrooms.add(bedroom3);

        hotel1 = new Hotel("Hotel Paradiso", bedrooms);

        guest1 = new Guest("Simon");

//        guestList = new ArrayList<>();
//
//        guestList.add(guest1);

    }

    @Test
    public void canGetName(){
        assertEquals("Hotel Paradiso", hotel1.getName());
    }

    @Test
    public void canCountRooms(){
        assertEquals(3, hotel1.countRooms());
    }

    @Test
    public void canCountGuests(){
        assertEquals(0, hotel1.countGuests());
    }

    @Test
    public void canAddGuest(){
        hotel1.addGuest(guest1);
        assertEquals(1, hotel1.countGuests());
    }


}
