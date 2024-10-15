package decorator;

// Concrete class: MargheritaPizza
public class MargheritaPizza implements Pizza {

    @Override
    public String getDescription() {
        return "Margherita Pizza";
    }

    @Override
    public double getCost() {
        return 8.00; // base price for Margherita
    }
}
