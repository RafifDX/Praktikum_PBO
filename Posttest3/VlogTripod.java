public class VlogTripod extends Tripod {
    private boolean hasGripHandle;  // Apakah ada pegangan untuk vlog

    public VlogTripod(int id, String merk, double harga, boolean hasGripHandle) {
        super(id, merk, harga);
        this.hasGripHandle = hasGripHandle;
    }

    public boolean isHasGripHandle() {
        return hasGripHandle;
    }

    public void setHasGripHandle(boolean hasGripHandle) {
        this.hasGripHandle = hasGripHandle;
    }

    @Override
    public String toString() {
        return super.toString() + " | Grip Handle: " + (hasGripHandle ? "Yes" : "No");
    }
}
