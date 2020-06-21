package model;

public class Cake extends Pastery{
    private boolean hasCandles;

    public Cake(String productName, int quantity, boolean isVegan, double productPrice, boolean hasCandles) {
        super(productName, quantity, isVegan, productPrice);
        this.hasCandles = hasCandles;
    }

    public boolean isHasCandles() {
        return hasCandles;
    }

    public void setHasCandles(boolean hasCandles) {
        this.hasCandles = hasCandles;
    }

    @Override
    public String toString() {
        return "Cake{" + super.toString() +
                "hasCandles=" + hasCandles +
                '}';
    }
}
