
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author michael
 */
public class IOU {
    
    private HashMap<String, Double> hashmap;

    public IOU() {
        this.hashmap = new HashMap<>();
    }
    
    public void setSum(String toWhom, double amount) {
        String whom = sanitizedString(toWhom);
        double owedAmount = this.hashmap.getOrDefault(whom, 0.0);
        owedAmount += amount;
        this.hashmap.put(whom, owedAmount);
    }
    
    public double howMuchDoIOweTo(String toWhom) {
        String whom = sanitizedString(toWhom);
        return this.hashmap.getOrDefault(whom, 0.0);
    }
    
    public String sanitizedString(String string) {
        if (string == null) {
            return "";
        }
        
        string = string.toLowerCase();
        return string.trim();
    }
}
