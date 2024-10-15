package decorator;

public class PizzaShop {

    public static void main(String[] args) {
        // Order a Margherita Pizza with cheese and mushrooms
        Pizza pizza1 = new MargheritaPizza();
        pizza1 = new CheeseTopping(pizza1);  // Add cheese
        pizza1 = new MushroomTopping(pizza1);  // Add mushrooms

        System.out.println(pizza1.getDescription() + " - Cost: $" + pizza1.getCost());

        // Order a Vegetarian Pizza with cheese, mushrooms, and pepperoni
        Pizza pizza2 = new VegetarianPizza();
        pizza2 = new CheeseTopping(pizza2);  // Add cheese
        pizza2 = new MushroomTopping(pizza2);  // Add mushrooms
        pizza2 = new PepperoniTopping(pizza2);  // Add pepperoni

        System.out.println(pizza2.getDescription() + " - Cost: $" + pizza2.getCost());
    }
}

