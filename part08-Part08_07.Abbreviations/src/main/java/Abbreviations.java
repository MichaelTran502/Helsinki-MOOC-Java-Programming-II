
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
public class Abbreviations {
    
    private HashMap<String, String> hashmap;

    public Abbreviations() {
        this.hashmap = new HashMap<>();
    }
    
    public void addAbbreviation(String abbreviation, String explanation) {
        String name = sanitizedString(abbreviation);
        
        if (this.hashmap.containsKey(name)) {
            System.out.println("Already contains abbreviation");
        } else {
            this.hashmap.put(name, explanation);
        }
    }
    
    public boolean hasAbbreviation(String abbreviation) {
        return this.hashmap.containsKey(sanitizedString(abbreviation));
    }
    
    public String findExplanationFor(String abbreviation) {
        return this.hashmap.get(sanitizedString(abbreviation));
    }
    
    public static String sanitizedString(String string) {
        if (string == null) {
            return "";
        }
        
        string = string.toLowerCase();
        return string.trim();
    }
}
