
package movable;

import java.util.ArrayList;
import java.util.List;

public class Group implements Movable {
    
    private List<Movable> movables;

    public Group() {
        movables = new ArrayList<Movable>();
    }
    
    public void addToGroup(Movable movable){
        movables.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable moveable : movables) {
            moveable.move(dx, dy);
        }
    }

    @Override
    public String toString() {
        String result = "";
        for (Movable moveable : movables) {
            result += moveable + "\n";
        }
        return result;
    }
    
    
    
}
