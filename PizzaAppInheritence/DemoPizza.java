import java.util.Scanner;

public class DemoPizza {
    private static final String QUIT = "QUIT";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter pizza toppings. Enter 'QUIT' to finish or after 10 toppings.");
        String[] toppings = new String[10];
        int numToppings = 0;

        while (numToppings < 10) {
            System.out.print("Enter topping (or 'QUIT' to finish): ");
            String topping = scanner.nextLine();

            if (topping.equalsIgnoreCase(QUIT)) {
                break;
            }

            toppings[numToppings++] = topping;
        }

        System.out.print("Do you want the pizza to be delivered? (yes/no): ");
        String deliveryChoice = scanner.nextLine();

        if (deliveryChoice.equalsIgnoreCase("yes")) {
            System.out.print("Enter delivery address: ");
            String deliveryAddress = scanner.nextLine();

            DeliveryPizza deliveryPizza = new DeliveryPizza(toppings, deliveryAddress, numToppings);
            displayPizzaInfo(deliveryPizza);
        } else {
            Pizza pizza = new Pizza(toppings, numToppings);
            displayPizzaInfo(pizza);
        }

        scanner.close();
    }

    private static void displayPizzaInfo(Pizza pizza) {
        System.out.println("Pizza Information:");
        System.out.println(pizza.toString());
    }

    private static void displayPizzaInfo(DeliveryPizza deliveryPizza) {
        System.out.println("Delivery Pizza Information:");
        System.out.println(deliveryPizza.toString());
    }
}
