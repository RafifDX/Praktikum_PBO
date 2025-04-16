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

    // Overriding method untuk menghitung harga sewa
    @Override
    public double calculateRentalPrice() {
        // Menambahkan biaya berdasarkan ukuran terlipat
        return super.calculateRentalPrice() + (foldedSize * 0.05);
    }

    @Override
    public String toString() {
        return super.toString() + " | Folded Size: " + foldedSize + " cm";
    }
}
