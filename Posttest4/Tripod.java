public class Tripod {
    private int id;
    private String merk;
    private double harga;

    public Tripod(int id, String merk, double harga) {
        this.id = id;
        this.merk = merk;
        this.harga = harga;
    }

    public int getId() {
        return id;
    }

    public String getMerk() {
        return merk;
    }

    public double getHarga() {
        return harga;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setHarga(double harga) {
        if (harga < 0) {
            System.out.println("Harga tidak boleh negatif!");
        } else {
            this.harga = harga;
        }
    }

    // Method untuk menghitung harga sewa dasar
    public double calculateRentalPrice() {
        return harga;  // Harga dasar
    }

    @Override
    public String toString() {
        return "ID: " + id + " | Merk: " + merk + " | Harga: Rp" + String.format("%,.2f", harga);
    }
}
