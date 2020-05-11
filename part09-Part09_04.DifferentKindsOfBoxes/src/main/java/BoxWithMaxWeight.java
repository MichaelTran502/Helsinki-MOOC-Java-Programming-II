import java.util.ArrayList;

/**
 *
 * @author michael
 */
public class BoxWithMaxWeight extends Box{
    
    private int maxWeight;
    private ArrayList<Item> items;

    public BoxWithMaxWeight(int capacity) {
        this.maxWeight = capacity;
        this.items = new ArrayList<>();
    }
    
    @Override
    public void add(Item item) {
        int count = 0;
        for (Item addedItem : items) {
            count += addedItem.getWeight();
        }
        
        if (count + item.getWeight() <= maxWeight) {
            items.add(item);
        } 
    }
    
    @Override
    public boolean isInBox(Item item) {
        if (items.contains(item)) {
            return true;
        }
        return false;
    }
}
