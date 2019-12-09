
package dungeon;

public abstract class Movable {
    
    private int x;
    private int y;
    private int maxLength;
    private int maxHeight;

    public Movable(int x, int y, int maxLength, int maxHeight) {
        this.x = x;
        this.y = y;
        this.maxLength = maxLength ;
        this.maxHeight = maxHeight ;
    }
    
    public boolean move(int moveX, int moveY){
        if( x+moveX > -1 && x+moveX < maxLength && y+moveY > -1 && y+moveY < maxHeight ){
            x += moveX;
            y += moveY;
            return true;
        }
        return false;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return x + " " + y;
    }
    
    
    
}
