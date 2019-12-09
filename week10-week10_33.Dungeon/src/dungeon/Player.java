
package dungeon;

public class Player extends Movable {
    
    private int lightLeft;

    public Player(int lightLeft, int maxLength, int maxHeight) {
        super(0, 0, maxLength, maxHeight);
        this.lightLeft = lightLeft;
    }
    
    public void finishTurn(){
        lightLeft--;
    }

    public int getLightLeft() {
        return lightLeft;
    }
    

    @Override
    public String toString() {
        return "@ " + super.toString();
    }
    
    
    
    
    
    
    
    
}
