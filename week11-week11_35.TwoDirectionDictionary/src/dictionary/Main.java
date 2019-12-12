package dictionary;

public class Main {

    public static void main(String[] args) {
        // Test your dictionary here
        MindfulDictionary dict = new MindfulDictionary("src/words.txt");
        dict.load();
        
        System.out.println(dict.translate("monkey"));
        
        dict.add("george", "Finnish");
// using the dictionary
        dict.save();
    }
}
