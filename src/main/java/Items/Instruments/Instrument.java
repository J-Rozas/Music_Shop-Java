package Items.Instruments;

import Actions.IPlay;
import Items.Item;

public abstract class Instrument extends Item implements IPlay {

    public Instrument(String name, double acquisitionPrice, double sellingPrice) {
        super(name, acquisitionPrice, sellingPrice);
    }
}
