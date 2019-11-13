
import java.util.ArrayList;

public class Changer {
    
    private ArrayList<Change> changes;

    public Changer() {
        this.changes = new ArrayList<Change>();
    }
    
    public void addChange(Change change){
        this.changes.add(change);
    }
    
    public String change(String characterString){
        String newString = "";
        for (Change change : changes) {
            newString = change.change(characterString);
            characterString = newString;
        }
        return newString;
    }
    
}
