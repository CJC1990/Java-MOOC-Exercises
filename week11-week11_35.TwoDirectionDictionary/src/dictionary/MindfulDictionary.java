
package dictionary;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MindfulDictionary {
    
    private Map<String, String> translations;
    private Scanner reader;
    private String fileName;

    public MindfulDictionary() {
        //translations = new HashMap<String, String>();
        this("");
    }
    
    public MindfulDictionary(String file){
        translations = new HashMap<String, String>();
        fileName = file;
    }
    
    public boolean load(){
        try {
            reader = new Scanner(new File(fileName));
        } catch (FileNotFoundException e) {
            return false;
        }
        while(reader.hasNextLine()){
            String line = reader.nextLine();
            String[] words = line.split(":");
            add(words[0], words[1]);
        }
        return true;
    }
    
    public boolean save(){
        try {
            FileWriter writer = new FileWriter(fileName);
            for (String key : translations.keySet()) {
                writer.write(key + ":" + translations.get(key) + "\n");
            }
            writer.close();
        } catch (IOException e) {
            return false;
        }
        return true;
    }
    
    public void add(String word, String translation){
        if(!(translations.containsKey(word)) && !(translations.containsValue(word)) && 
            !(translations.containsKey(translation)) && !(translations.containsValue(translation)) ){
            translations.put(word, translation);
        }        
    }
    
    public String translate(String word){
        if(translations.containsKey(word)){
            return translations.get(word);
        }else if(translations.containsValue(word)){
            for (String key : translations.keySet()) {
                if(translations.get(key).equals(word)){
                    return key;
                }
            }
        }
        return null;
    }
    
    public void remove(String word){
        translations.remove(word);
        if(translations.containsValue(word)){
            String removeKey = null;
            for (String key : translations.keySet()) {
                if(translations.get(key).equals(word)){
                    removeKey = key;
                }
            }
            translations.remove(removeKey);
        }
    }
    
    
    
    
    
}
