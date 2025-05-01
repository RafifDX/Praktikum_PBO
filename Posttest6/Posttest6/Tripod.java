// Tripod.java (Abstract Class)
public abstract class Tripod {
    private int id;
    private String merk;
    private double harga;

    public Tripod(int id, String merk, double harga) {
        this.id = id;
        this.merk = merk;
        this.harga = harga;
    }

    // Abstract method to be overridden by subclasses
    public abstract double calculateRentalPrice();

    // Getter and Setter methods
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
}