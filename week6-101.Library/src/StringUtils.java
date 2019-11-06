public class StringUtils {
    
    public static boolean included(String word, String searched){
        return word.toUpperCase().trim().contains(searched.toUpperCase().trim());
        
    }
}
