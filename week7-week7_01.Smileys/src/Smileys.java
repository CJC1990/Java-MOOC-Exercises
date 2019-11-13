
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
        // printWithSmileys("Method");
        // printWithSmileys("Beerbottle");
        // printWithSmileys("Interface");
    }
    
    private static void printWithSmileys(String characterString){
        
        int smileyAmount = characterString.length() - (characterString.length() / 2) + 3;
        
        characterString = characterString.length() % 2 == 1 ? " " + characterString + "  " : " " + characterString + " ";
        
        printRow(smileyAmount);
        
        System.out.print(":)" +characterString+ ":)\n");
        
        printRow(smileyAmount);
    }
    
    private static void printRow(int times){
        for(int i=0; i<times; i++){
            System.out.print(":)");
        }
        System.out.println("");
    }

}
