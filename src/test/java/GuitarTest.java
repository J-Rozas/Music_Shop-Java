import Items.Instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    private Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar("Fender Stratocaster", 300.84, 559.99);
    }

    @Test
    public void hasName() {
        assertEquals("Fender Stratocaster", guitar.getName());
    }

    @Test
    public void hasAcquisitionPrice() {
        assertEquals(300.84, guitar.getAcquisitionPrice(), 0.0);
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(559.99, guitar.getSellingPrice(), 0.0);
    }

    @Test
    public void canPlaySound() {
        assertEquals("Guitar riff", guitar.play());
    }
}
