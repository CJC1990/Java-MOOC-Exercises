package tools;

import java.util.HashSet;
import java.util.Set;

public class PersonalDuplicateRemover implements DuplicateRemover {
    
    private Set<String> uniqueWords;
    private int duplicates;

    public PersonalDuplicateRemover() {
        uniqueWords =  new HashSet<String>();
        duplicates = 0;
    }

    @Override
    public void add(String characterString) {
        if(!uniqueWords.add(characterString)){
            duplicates++;
        }
    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        return duplicates;
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
        return uniqueWords;
    }

    @Override
    public void empty() {
        uniqueWords.clear();
        duplicates = 0;    
    }
    
}
