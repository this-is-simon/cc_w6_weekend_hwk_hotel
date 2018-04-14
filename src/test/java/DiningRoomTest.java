import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DiningRoomTest {

    DiningRoom diningRoom1;

    @Before
    public void before(){
        diningRoom1 = new DiningRoom("Main SuperCool DiningRoom", 35);
    }

    @Test
    public void canGetName(){
        assertEquals("Main SuperCool DiningRoom", diningRoom1.getName());
    }

    @Test
    public void canGetCapacity(){
        assertEquals(35, diningRoom1.getCapacity());
    }

    @Test
    public void isDiningRoomEmpty(){
        assertEquals(0, diningRoom1.howManyPeopleInDiningRoom());
    }
}
