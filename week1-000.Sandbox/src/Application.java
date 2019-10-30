
import java.util.ArrayList;

// This is not an exercise but a "sandbox" where you can freely test
// whatever you want
public class Application {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("First");
        
        removeFirst(arrayList);
        removeFirst(arrayList);

    }
    
    public static void removeFirst(ArrayList<String> list){
        list.remove(0);
    }
}
