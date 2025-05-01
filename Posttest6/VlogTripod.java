// VlogTripod.java (Child Class)
public class VlogTripod extends Tripod {
    private boolean hasGripHandle;

    public VlogTripod(int id, String merk, double harga, boolean hasGripHandle) {
        super(id, merk, harga);
        this.hasGripHandle = hasGripHandle;
    }

    @Override
    public double calculateRentalPrice() {
        // Formula to calculate rental price for VlogTripod
        return super.getHarga() + (hasGripHandle ? 20 : 0);
    }

    // Getter and Setter for hasGripHandle
    public boolean isHasGripHandle() {
        return hasGripHandle;
    }

    public void setHasGripHandle(boolean hasGripHandle) {
        this.hasGripHandle = hasGripHandle;
    }
}