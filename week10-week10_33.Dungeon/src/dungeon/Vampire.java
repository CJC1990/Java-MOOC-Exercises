
package dungeon;

public class Vampire extends Movable {

    public Vampire(int x, int y, int maxLength, int maxHeight) {
      super(x, y, maxLength, maxHeight);
    }
    
    @Override
    public String toString() {
        return "v " + super.toString();
    }
    
}
