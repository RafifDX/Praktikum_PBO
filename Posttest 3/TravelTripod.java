public class TravelTripod extends Tripod {
    private double foldedSize;  // Ukuran terlipat dalam cm

    public TravelTripod(int id, String merk, double harga, double foldedSize) {
        super(id, merk, harga);
        this.foldedSize = foldedSize;
    }

    public double getFoldedSize() {
        return foldedSize;
    }

    public void setFoldedSize(double foldedSize) {
        this.foldedSize = foldedSize;
    }

    @Override
    public String toString() {
        return super.toString() + " | Folded Size: " + foldedSize + " cm";
    }
}
