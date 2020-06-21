package model;

public class Pastery {
    private String productName;
    private int quantity;
    private boolean isVegan;
    private double productPrice;

    public Pastery(){
    }

    public Pastery(String productName, int quantity, boolean isVegan, double productPrice) {
        this.productName = productName;
        this.quantity = quantity;
        this.isVegan = isVegan;
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isVegan() {
        return isVegan;
    }

    public void setVegan(boolean vegan) {
        isVegan = vegan;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return "Pastery{" +
                "productName='" + productName + '\'' +
                ", quantity=" + quantity +
                ", isVegan=" + isVegan +
                ", productPrice=" + productPrice +
                '}';
    }
}
