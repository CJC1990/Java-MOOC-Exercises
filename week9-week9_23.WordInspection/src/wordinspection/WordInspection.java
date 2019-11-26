package wordinspection;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordInspection {

    private List<String> fileLines;

    public WordInspection(File file) throws Exception {
        Scanner reader = new Scanner(file);
        fileLines = new ArrayList<String>();

        while (reader.hasNext()) {
            fileLines.add(reader.nextLine());
        }
    }

    public int wordCount() {
        return fileLines.size();
    }

    public List<String> wordsContainingZ() {
        List<String> newList = new ArrayList<String>();
        for (String fileLine : fileLines) {
            if (fileLine.contains("z")) {
                newList.add(fileLine);
            }
        }
        return newList;
    }

    public List<String> wordsEndingInL() {
        List<String> newList = new ArrayList<String>();
        for (String fileLine : fileLines) {
            if (fileLine.endsWith("l")) {
                newList.add(fileLine);
            }
        }
        return newList;
    }

    public List<String> palindromes() {
        
        List<String> newList = new ArrayList<String>();
        
        for (String fileLine : fileLines) {
            StringBuilder sb = new StringBuilder(fileLine);
            sb.reverse();
            String reversedWord = sb.toString();
            if (fileLine.equals(reversedWord)) {
                newList.add(fileLine);
            }
        }
        return newList;
    }

    public List<String> wordsWhichContainAllVowels() {
        List<String> newList = new ArrayList<String>();
        String vowels = "aeiouyäö";
        int vowelCount;
        
        for (String fileLine : fileLines) {
            vowelCount = 0;
            
            for(int i=0; i<vowels.length(); i++){
                for(int k=0; k<fileLine.length(); k++){
                    if(vowels.charAt(i) == fileLine.charAt(k)){
                        vowelCount++;
                        break;
                    }
                }
            }
            
            
            if(vowelCount == 8){
                newList.add(fileLine);
            }
            
            
            
        }
        System.out.println(newList);
        return newList;
    }

}
