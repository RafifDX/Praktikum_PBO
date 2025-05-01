
public interface TripodInterface {
    static final double DISCOUNT_RATE = 0.10;
    
    static double applyDiscount(double price) {
        return price - (price * DISCOUNT_RATE);
    }
    
    void showDetails();
    void adjustPrice(double price);
}
    