import java.util.ArrayList;

public class ShoppingCart {
    ArrayList<ItemOrder> Cart = new ArrayList<ItemOrder>();
    public void addItem (ItemOrder order) {
        Cart.add(order);
    }
    public void removeItem (ItemOrder order) {
        Cart.remove(order);
    }
    public int searchItem (ItemOrder order) {
        return Cart.indexOf(order);
        }
    public Float getTotalPrice() {
        float totalPrice = 0;
        for (ItemOrder order : Cart) {
            totalPrice += order.getNewPrice();
        }
        return totalPrice;
    }
}

