import dealership.Till;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TIllTest {

    Till till;
    @Before
    public void before() {
        till = new Till(500.0);
    }

    @Test
    public void startsWithMoney(){
        assertEquals(500.0, till.getMoney(), 0);
    }

    @Test
    public void canAcceptPayment() {
        till.takePayment(100.0);
        assertEquals(600, till.getMoney(), 0);
    }
}
