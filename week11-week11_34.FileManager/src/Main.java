
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        FileManager t = new FileManager();

        for (String line : t.read("src/testinput1.txt")) {
            System.out.println(line);
        }
        
        t.save("src/testinput1.txt", "This should print second");
        
        for (String line : t.read("src/testinput1.txt")) {
            System.out.println(line);
        }
        
        ArrayList<String> newLines = new ArrayList<String>();
        newLines.add("This should print...");
        newLines.add("third");
        newLines.add("with this extra line");
        
        t.save("src/testinput1.txt", newLines);
        
        for (String line : t.read("src/testinput1.txt")) {
            System.out.println(line);
        }
        
        
    }
}
