
import java.util.HashMap;
import java.util.Map;


/**
 *
 * @author michael
 */
public class ShoppingCart {
    
    private Map<String, Item> items;

    public ShoppingCart() {
        this.items = new HashMap<>();
    }
    
    public void add(String product, int price) {
        
        if (items.containsKey(product)) {
            Item item = items.get(product);
            item.increaseQuantity();
        } else {
            items.put(product, new Item(product, 1, price));
        }
    }
    
    public int price() {
        int total = 0;
        for (Item item : items.values()) {
            total += item.price();
        }
        return total;
    }
    
    public void print() {
        for (Item item : items.values()) {
            System.out.println(item);
        }
    }
}
