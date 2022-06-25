import Items.Instruments.Guitar;
import Items.Item;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    private Shop shop;
    private Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar("Fender Stratocaster", 200, 600, 6);
        shop = new Shop("CCShop", 2000);
    }

    @Test
    public void hasName() {
        assertEquals("CCShop", shop.getName());
    }

    @Test
    public void hasArrayListOfItems() {
        assertEquals(shop.getItems(), new ArrayList<Item>());
    }

    @Test
    public void hasTill() {
        assertEquals(2000, shop.getTill());
    }

    @Test
    public void shouldBeAbleToBuyAndSellItems() {
//        shop buys item
        shop.buyItem(guitar);
        assertEquals(new ArrayList<Item>(Collections.singletonList(guitar)), shop.getItems());
        assertEquals(1800, shop.getTill(), 0.001);

//        shop sells item
        shop.sellItem(guitar);
        assertEquals(new ArrayList<Item>(), shop.getItems());
        assertEquals(2400, shop.getTill(), 0.001);
    }
}
