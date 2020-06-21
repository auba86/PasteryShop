package model;

public class Cupcake extends Pastery{
    private double weight;

    public Cupcake(String productName, int quantity, boolean isVegan, double productPrice, double weight) {
        super(productName, quantity, isVegan, productPrice);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Cupcake{" + super.toString() +
                "weight=" + weight +
                '}';
    }
}
