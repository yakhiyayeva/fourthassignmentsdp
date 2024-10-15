package decorator;

public class VegetarianPizza implements Pizza {

    @Override
    public String getDescription() {
        return "Vegetarian Pizza";
    }

    @Override
    public double getCost() {
        return 10.00; // base price for Vegetarian pizza
    }
}
