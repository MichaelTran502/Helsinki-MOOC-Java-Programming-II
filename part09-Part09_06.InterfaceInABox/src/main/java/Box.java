import java.util.ArrayList;

/**
 *
 * @author michael
 */
public class Box implements Packable{
    
    private double capacity;
    private ArrayList<Packable> items;

    public Box(double capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }
    
    public void add(Packable item) {
        if (item.weight() + weight() <= this.capacity) {
            items.add(item);
        }
    }
    
    public double weight() {
        Double weight = 0.0;
        for (Packable item : items) {
            weight += item.weight();
        }
        return weight;
    }
    
    @Override
    public String toString() {
        return "Box: " + this.items.size() + " items, total weight " + 
                weight() + " kg";
    }
}
