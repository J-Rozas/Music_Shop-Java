package Items.Instruments;

public class Guitar extends Instrument {

    public Guitar(String name, double acquisitionPrice, double sellingPrice) {
        super(name, acquisitionPrice, sellingPrice);
    }

    @Override
    public String play() {
        return "Guitar riff";
    }
}
