package Items.Instruments;

public class Guitar extends Instrument {

    private int numberOfStrings;

    public Guitar(String name, double acquisitionPrice, double sellingPrice, int numberOfStrings) {
        super(name, acquisitionPrice, sellingPrice);
        this.numberOfStrings = numberOfStrings;
    }

    @Override
    public String play() {
        return "Guitar riff";
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }
}
