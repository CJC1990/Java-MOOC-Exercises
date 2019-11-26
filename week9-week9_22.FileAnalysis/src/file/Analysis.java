
package file;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Analysis {
    
    private List<String> fileLines;

    public Analysis(File file) throws Exception {
        Scanner reader = new Scanner(file);
        fileLines = new ArrayList<String>();
        while(reader.hasNext()){
            fileLines.add(reader.nextLine());
        }
    }
    
    public int lines(){
        return fileLines.size();
    }
    
    public int characters(){
        int chars = 0;
        for (String fileLine : fileLines) {
            chars += fileLine.length();
        }
        return chars + fileLines.size();
    }
    
    
}
