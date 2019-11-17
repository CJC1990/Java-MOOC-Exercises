
import java.util.ArrayList;
import java.util.HashMap;

public class Dictionary {
    
    private HashMap<String, String> dictionary;

    public Dictionary() {
        dictionary = new HashMap<String, String>();
    }
    
    public String translate(String word){
        if(this.dictionary.containsKey(word)){
            return this.dictionary.get(word);
        }
        return null;
    }
    
    public void add(String word, String translation){
        this.dictionary.put(word, translation);
    }
    
    public int amountOfWords(){
        return this.dictionary.size();
    }
    
    public ArrayList<String> translationList(){
        ArrayList<String> translations = new ArrayList<String>();
        for (String key : this.dictionary.keySet()) {
            translations.add(key + " = " + this.dictionary.get(key));
        }
        return translations;
    }
    
    
    
}
