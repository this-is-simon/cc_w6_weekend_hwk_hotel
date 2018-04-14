import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BedroomTest {

    Bedroom bedroom1;
    Bedroom bedroom2;
    Bedroom bedroom3;

    @Before
    public void before(){
        bedroom1 = new Bedroom("Rockefeller Suite", RoomType.SINGLE_ROOM, 100.00);
        bedroom2 = new Bedroom("Osbourne Suite", RoomType.DOUBLE_ROOM, 200.00);
        bedroom3 = new Bedroom("Atkins Suite", RoomType.FAMILY_ROOM, 300.00);
    }

    @Test
    public void canGetRoomType(){
        assertEquals(RoomType.SINGLE_ROOM, bedroom1.getRoomType());
    }

    @Test
    public void canGetNumberOfGuests(){
        assertEquals(0, bedroom1.numberOfGuests());
    }

}
