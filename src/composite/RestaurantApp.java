package composite;

// RestaurantApp to demonstrate the Composite pattern
public class RestaurantApp {

    public static void main(String[] args) {
        // Create menu items
        MenuComponent pasta = new MenuItem("Pasta", "Italian pasta with tomato sauce", 12.99);
        MenuComponent burger = new MenuItem("Burger", "Beef burger with fries", 22);
        MenuComponent salad = new MenuItem("Salad", "Fresh garden salad", 33);

        // Create a dessert menu with menu items
        MenuComponent dessertMenu = new Menu("Dessert Menu", "Delicious desserts");
        MenuComponent iceCream = new MenuItem("Ice Cream", "Vanilla ice cream with chocolate topping", 4.99);
        MenuComponent cake = new MenuItem("Cake", "Chocolate cake", 5.99);
        dessertMenu.add(iceCream);
        dessertMenu.add(cake);

        // Create a main menu with both items and submenus
        MenuComponent mainMenu = new Menu("Main Menu", "All main dishes");
        mainMenu.add(pasta);
        mainMenu.add(burger);
        mainMenu.add(salad);
        mainMenu.add(dessertMenu);

        // Print the complete menu
        mainMenu.print();
    }
}

