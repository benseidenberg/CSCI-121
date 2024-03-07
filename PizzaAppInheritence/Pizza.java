public class Pizza {
    private String[] toppings;
    private double price;

    public Pizza(String[] toppings, int numToppings) {
        this.toppings = new String[numToppings];
        for (int i = 0; i < numToppings; i++) {
            this.toppings[i] = toppings[i];
        }
        this.price = 14 + (2 * numToppings);
    }

    @Override
    public String toString() {
        String description = "Pizza with toppings: ";
        for (int i = 0; i < toppings.length; i++) {
            description += toppings[i];
            if (i < toppings.length - 1) {
                description += ", ";
            }
        }
        return description + " - Price: $" + price;
    }

    public double getCost() {
        return price;
    }
}
