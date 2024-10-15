package decorator;

// Abstract class: ToppingDecorator
public abstract class ToppingDecorator implements Pizza {
    protected Pizza pizza;  // The pizza being decorated

    public ToppingDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription();
    }

    @Override
    public double getCost() {
        return pizza.getCost();
    }
}

