package Items;

import Actions.ISell;

public abstract class Item implements ISell {

    private final String name;
    private final double acquisitionPrice;
    private double sellingPrice;

    public Item(String name, double acquisitionPrice, double sellingPrice) {
        this.name = name;
        this.acquisitionPrice = acquisitionPrice;
        this.sellingPrice = sellingPrice;
    }

    public String getName() {
        return name;
    }

    public double getAcquisitionPrice() {
        return acquisitionPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }
}
