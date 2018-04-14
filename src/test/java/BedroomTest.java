import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class BedroomTest {

    Bedroom bedroom1;
    Bedroom bedroom2;
    Bedroom bedroom3;
    Guest guest1;
//    ArrayList<Guest> occupants;

    @Before
    public void before(){
        bedroom1 = new Bedroom("Rockefeller Suite", RoomType.SINGLE_ROOM, 100.00);
        bedroom2 = new Bedroom("Osbourne Suite", RoomType.DOUBLE_ROOM, 200.00);
        bedroom3 = new Bedroom("Atkins Suite", RoomType.FAMILY_ROOM, 300.00);

        guest1 = new Guest("Simon");

//        occupants = new ArrayList<>();
    }

    @Test
    public void canGetRoomType(){
        assertEquals(RoomType.SINGLE_ROOM, bedroom1.getRoomType());
    }

    @Test
    public void canGetNumberOfGuests(){
        assertEquals(0, bedroom1.numberOfGuests());
    }

    @Test
    public void canAddGuestToBedroom(){
        bedroom1.addAGuest(guest1);
        assertEquals(1, bedroom1.numberOfGuests());
    }

//    @Test
//    public void canGetBedroomGuests(){
//        bedroom1.addAGuest(guest1);
//        assertEquals(//GUEST OBJECT ARRAY, bedroom1.getGuestsByRoom());
//    }
}
