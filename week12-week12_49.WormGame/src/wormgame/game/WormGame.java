package wormgame.game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.Timer;
import wormgame.Direction;
import wormgame.domain.Apple;
import wormgame.domain.Piece;
import wormgame.domain.Worm;
import wormgame.gui.Updatable;

public class WormGame extends Timer implements ActionListener {

    private int width;
    private int height;
    private boolean continues;
    private Updatable updatable;
    private Worm worm;
    private Apple apple;
    private Random random;

    public WormGame(int width, int height) {
        super(1000, null);

        this.width = width;
        this.height = height;
        this.continues = true;

        addActionListener(this);
        setInitialDelay(2000);

        random = new Random();
        worm = new Worm(width / 2, height / 2, Direction.DOWN);
        spawnApple();

    }

    public Worm getWorm() {
        return worm;
    }

    public void setWorm(Worm worm) {
        this.worm = worm;
    }

    public Apple getApple() {
        return apple;
    }

    public void setApple(Apple apple) {
        this.apple = apple;
    }

    public boolean continues() {
        return continues;
    }

    public void setUpdatable(Updatable updatable) {
        this.updatable = updatable;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    private void spawnApple() {
        
        int x = random.nextInt(width);
        System.out.println(x);
        int y = random.nextInt(height);
        System.out.println(y);

        apple = new Apple(x, y);
        Boolean isClear = false;
        while (!isClear) {
            isClear = true;
            for (Piece piece : worm.getPieces()) {
                if (apple.runsInto(piece)) {
                    apple = new Apple(random.nextInt(width), random.nextInt(height));
                    isClear = false;
                }
            }
        }

        setApple(apple);

    }
    
    private boolean runsIntoWall(){
        int wormHeadX = worm.getPieces().get(worm.getPieces().size()-1).getX();
        int wormHeadY = worm.getPieces().get(worm.getPieces().size()-1).getY();
        
        return wormHeadX == 0 || wormHeadY == 0 || wormHeadX == width || wormHeadY == height;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (!continues) {
            return;
        }
        worm.move();
        if (worm.runsIntoItself() || runsIntoWall()) {
            continues = false;
        }
        if (worm.runsInto(apple)) {
            worm.grow();
            spawnApple();
        }
        

        updatable.update();

        setDelay(1000 / worm.getLength());

    }
}
