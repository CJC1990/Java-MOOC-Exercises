
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Printer {

    private File file;
    private Scanner reader;

    public Printer(String filename) throws Exception {
        file = new File(filename);
    }

    public void printLinesWhichContain(String word) throws FileNotFoundException {
        reader = new Scanner(file);
        while (reader.hasNext()) {
            String line = reader.nextLine();
            if (line.contains(word)) {
                System.out.println(line);
            }
        }
    }

}
