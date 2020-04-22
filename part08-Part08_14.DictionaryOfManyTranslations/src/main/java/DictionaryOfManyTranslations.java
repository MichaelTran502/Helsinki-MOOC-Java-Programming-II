
import java.util.ArrayList;
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
public class DictionaryOfManyTranslations {
    
    private HashMap<String, ArrayList<String>>translations = new HashMap<>();
    
    public void add(String word, String translation) {
        
        // add empty list if one not alreay added
        this.translations.putIfAbsent(word, new ArrayList<>());
        
        this.translations.get(word).add(translation);
    }
    
    public ArrayList<String> translate(String word) {
        
        if (this.translations.get(word)!= null) {
            return this.translations.get(word);
        }
        
        return new ArrayList<>();
    }
    
    public void remove(String word) {
        this.translations.remove(word);
    }
    
}
