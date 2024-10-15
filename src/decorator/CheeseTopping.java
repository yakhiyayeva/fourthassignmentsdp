package decorator;

// Concrete ToppingDecorator: CheeseTopping
public class CheeseTopping extends ToppingDecorator {

    public CheeseTopping(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Cheese";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 1.50; // cost of cheese topping
    }
}
