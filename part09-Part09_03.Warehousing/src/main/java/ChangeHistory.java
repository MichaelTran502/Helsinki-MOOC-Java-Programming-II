
import java.util.ArrayList;

/**
 *
 * @author michael
 */
public class ChangeHistory {
    
    private ArrayList<Double> history;
    
    public ChangeHistory() {
        this.history = new ArrayList<>();
    }
    
    public void add(double status) {
        history.add(status);
    }
    
    public void clear() {
        history.clear();
    }
    
    public double maxValue() {
        if (!history.isEmpty()) {
            double value = history.get(0);
            for (Double d : history) {
                if (d > value) {
                    value = d;
                }
            }
            return value;
        }
        
        return 0.0;
    }
    
    public double minValue() {
        if (!history.isEmpty()) {
            double value = history.get(0);
            for (Double d : history) {
                if (d < value) {
                    value = d;
                }
            }
            return value;
        }
        
        return 0.0;
    }
    
    public double average() {
        if (!history.isEmpty()) {
            Double count = 0.0;
            for (Double value : history) {
                count += value;
            }
            
            return 1.0*count/history.size();
            
        }
        
        return 0.0;
    }
    
    
    
    @Override
    public String toString() {
        return history.toString();
    }
}
