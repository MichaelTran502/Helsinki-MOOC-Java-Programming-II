import java.util.ArrayList;

/**
 *
 * @author michael
 */
public class OneItemBox extends Box {
    
    private ArrayList<Item> items;

    public OneItemBox() {
        this.items = new ArrayList<>();
    }
    
    @Override
    public void add(Item item) {
        if (items.size() == 0) {
            items.add(item);
        }
    }
    
    @Override
    public boolean isInBox(Item item) {
        return items.contains(item);
    }
}
