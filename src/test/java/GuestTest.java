import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class GuestTest {

    Guest guest1;
    Guest guest2;
    Guest guest3;

    @Before
    public void before(){
        guest1 = new Guest("Simon");
        guest2 = new Guest("Chairman Mao");
        guest3 = new Guest("Aileen");

    }

    @Test
    public void canGetName(){
        assertEquals("Simon", guest1.getName());
    }

}
