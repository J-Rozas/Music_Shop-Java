import Items.Item;

import java.util.ArrayList;

public class Shop {

    private final String name;
    private final ArrayList<Item> items;
    private int till;

    public Shop(String name, int till) {
        this.name = name;
        this.items = new ArrayList<>();
        this.till = till;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public int getTill() {
        return till;
    }

    public void buyItem(Item item) {
        getItems().add(item);
        till -= item.getAcquisitionPrice();
    }

    public void sellItem(Item item) {
        getItems().remove(item);
        till += item.getSellingPrice();
    }
}
