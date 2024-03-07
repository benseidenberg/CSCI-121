public class DeliveryPizza extends Pizza {

    public DeliveryPizza(String[] toppings, String deliveryAddress, int numToppings) {
        super(toppings, numToppings);
        double deliveryFee;
        if (getCost() > 18) {
            deliveryFee = 3.0;
        } else {
            deliveryFee = 5.0;
        }
    }
}
