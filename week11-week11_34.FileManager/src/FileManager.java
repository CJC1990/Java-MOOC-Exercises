
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileManager {

    public List<String> read(String file) throws FileNotFoundException {
        File fileToRead = new File(file);
        Scanner reader = new Scanner(fileToRead);
        ArrayList<String> fileLines = new ArrayList<String>();
        while(reader.hasNext()){    
            fileLines.add(reader.nextLine());
        }
        return fileLines;
    }

    public void save(String file, String text) throws IOException {
        FileWriter writer = new FileWriter(file);
        writer.write(text);
        writer.close();
    }

    public void save(String file, List<String> texts) throws IOException {
        FileWriter writer = new FileWriter(file);
        for (String line : texts) {
            writer.write(line + "\n");
        }
        writer.close();
    }
}
