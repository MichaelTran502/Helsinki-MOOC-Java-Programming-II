
import java.util.ArrayList;


/**
 *
 * @author michael
 */
public class Herd implements Movable{
    
    private ArrayList<Movable> animals;

    public Herd() {
        this.animals = new ArrayList<>();
    }
    
    public void addToHerd(Movable movable) {
        animals.add(movable);
    }
    
    public void move(int dx, int dy) {
        for (Movable animal : animals) {
            animal.move(dx, dy);
        }
    }
    
    @Override
    public String toString() {
        String toPrint = "";
        
        for (Movable animal : animals) {
            toPrint += animal.toString() + "\n";
        }
        
        return toPrint;
    }
}
