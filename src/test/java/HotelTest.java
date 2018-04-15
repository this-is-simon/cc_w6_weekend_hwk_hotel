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
    Guest guest2;
    Guest guest3;


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
        guest2 = new Guest("Chairman Mao");
        guest3 = new Guest("Aileen");

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

    @Test
    public void canRemoveGuest(){
        hotel1.addGuest(guest1);
        hotel1.addGuest(guest2);
        hotel1.removeGuest(guest1);
        assertEquals(1, hotel1.countGuests());
    }

    @Test
    public void canCheckInGuestToSingleBedroom(){
        hotel1.addGuestToRoomInHotel(guest1, bedroom1);
        assertEquals(1, bedroom1.numberOfGuests());
    }

    //Is this a legitimate test?
    @Test
    public void canGetHotelGuestListByRoom(){
        bedroom1.addAGuest(guest1);
//        hotel1.addGuestToRoomInHotel(guest1, bedroom1);
        assertEquals(bedroom1.getGuestsByRoom(), hotel1.getHotelGuestListByRoom(bedroom1));
    }
    //----

    @Test
    public void canGetGuestList(){
        bedroom1.addAGuest(guest1);
        bedroom1.addAGuest(guest2);
        assertEquals(2, hotel1.getHotelGuestListByRoom(bedroom1).size());
    }

}
