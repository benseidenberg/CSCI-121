public class ItemOrder {
    int numberItems;
    Item object;
    float newPrice;
    public ItemOrder(Item object, int numberItems) {
        float discPrice = (float) (object.getPrice()/1.5);
        if (numberItems >= 3) {
            int count = numberItems/3;
            int remainder;
            if (numberItems%3!=0) {
                remainder = numberItems % 3;
            } else {
                remainder = 0;
            }
            this.newPrice = count*discPrice + remainder*object.getPrice();
        } else {
            float newPrice = object.getPrice()*numberItems;
        }
        this.object = object;
        this.numberItems = numberItems;
    }
    public Item getItem() { return object;}
    public float getNewPrice() { return newPrice; }
    public int getNumberItems() { return numberItems; }
}
