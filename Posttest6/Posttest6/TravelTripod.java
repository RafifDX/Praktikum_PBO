// TravelTripod.java (Child Class)
public class TravelTripod extends Tripod {
    private double foldedSize;

    public TravelTripod(int id, String merk, double harga, double foldedSize) {
        super(id, merk, harga);
        this.foldedSize = foldedSize;
    }

    @Override
    public double calculateRentalPrice() {
        // Formula to calculate rental price for TravelTripod
        return super.getHarga() + (foldedSize * 0.05);
    }

    // Getter and Setter for foldedSize
    public double getFoldedSize() {
        return foldedSize;
    }

    public void setFoldedSize(double foldedSize) {
        this.foldedSize = foldedSize;
    }
}