
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author michael
 */
public class Warehouse {
    
    private Map<String, Integer> stocks;
    private Map<String, Integer> prices;

    public Warehouse() {
        this.stocks = new HashMap<>();
        this.prices = new HashMap<>();
    }
    
    
    public void addProduct(String product, int price, int stock) {
        if (!stocks.containsKey(product)) {
            stocks.put(product, stock);
        } else {
            stocks.put(product, stocks.get(product) + stock);
        }
        prices.put(product, price);
    }
    
    public int price(String product) {
        if (prices.containsKey(product)) {
            int price = prices.get(product);
            return price;
        }
        return -99;
    }
    
    public int stock(String product) {
        if (stocks.containsKey(product)) {
            return stocks.get(product);
        }
        
        return 0;
    }
    
    public boolean take(String product) {
        if (!stocks.containsKey(product)) {
            return false;
        }
        
        if (stocks.get(product) != 0) {
            stocks.put(product, stocks.get(product) - 1);
            return true;
        }

        return false;
    }
    
    public Set<String> products() {
        return stocks.keySet();
    }
}
