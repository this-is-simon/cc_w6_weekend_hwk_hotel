import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom1;

    @Before
    public void before(){
        conferenceRoom1 = new ConferenceRoom("Smithsonian Conference Room", 500.00, 45);
    }

    @Test
    public void canGetCapacity(){
        assertEquals(45, conferenceRoom1.getCapacity());
    }

    @Test
    public void canGetRate(){
        assertEquals(500.00, conferenceRoom1.getRate());
    }



}
