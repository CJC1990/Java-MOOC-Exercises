package game;

import gameoflife.GameOfLifeBoard;
import static java.lang.Math.random;
import java.util.Random;

public class PersonalBoard extends GameOfLifeBoard {

    public PersonalBoard(int width, int height) {
        super(width, height);
    }

    @Override
    public void initiateRandomCells(double d) {
        Random random = new Random();
        for (int i = 0; i < getWidth(); i++) {
            for (int j = 0; j < getHeight(); j++) {
                if (random.nextDouble() < d) {
                    turnToLiving(i, j);
                }
            }
        }
    }
    
    private boolean isInBoard(int i, int i1){
        return (i>=0 && i<= getWidth()-1) && (i1 >= 0 && i1 <= getHeight()-1);
    }

    @Override
    public boolean isAlive(int i, int i1) {
        if (isInBoard(i, i1)) {
            return getBoard()[i][i1];
        }
        return false;
    }

    @Override
    public void turnToLiving(int i, int i1) {
        if (isInBoard(i, i1)) {
            getBoard()[i][i1] = true;
        }
    }

    @Override
    public void turnToDead(int i, int i1) {
        if (isInBoard(i, i1)) {
            getBoard()[i][i1] = false;
        }

    }

    @Override
    public void manageCell(int i, int i1, int i2) {
        if(i2 < 2 || i2 > 3){
            turnToDead(i, i1);
        }
        if( !isAlive(i, i1) && i2 == 3){
            turnToLiving(i, i1);
        }

    }

    
    //THERE IS A MUCH LESS VERBOSE WAY TO CHECK ALL NEIGHBORS
    //It was definitly a learning moment.
    @Override
    public int getNumberOfLivingNeighbours(int i, int i1) {
        int alive = 0;
        //UpperLeftCorner
        if (i == 0 && i1 == 0) {
            if (checkRight(i, i1)) {
                alive++;
            }
            if (checkLowerRight(i, i1)) {
                alive++;
            }
            if (checkLower(i, i1)) {
                alive++;
            }
        } //UpperRightCorner
        else if (i == getWidth() && i1 == 0) {
            if (checkLeft(i, i1)) {
                alive++;
            }
            if (checkLowerLeft(i, i1)) {
                alive++;
            }
            if (checkLower(i, i1)) {
                alive++;
            }
        } //LowerLeftCorner
        else if (i == 0 && i1 == getHeight()) {
            if (checkUpper(i, i1)) {
                alive++;
            }
            if (checkRight(i, i1)) {
                alive++;
            }
            if (checkUpperRight(i, i1)) {
                alive++;
            }
        } //LowerRightCorner
        else if (i == getWidth() && i1 == getHeight()) {
            if (checkUpper(i, i1)) {
                alive++;
            }
            if (checkLeft(i, i1)) {
                alive++;
            }
            if (checkUpperLeft(i, i1)) {
                alive++;
            }
        } //LeftEdge
        else if (i == 0 && (i1 < getHeight() && i1 > 0)) {
            if (checkUpper(i, i1)) {
                alive++;
            }
            if (checkUpperRight(i, i1)) {
                alive++;
            }
            if (checkRight(i, i1)) {
                alive++;
            }
            if (checkLowerRight(i, i1)) {
                alive++;
            }
            if (checkLower(i, i1)) {
                alive++;
            }
        } //RightEdge
        else if (i == getWidth() && (i1 < getHeight() && i1 > 0)) {
            if (checkUpper(i, i1)) {
                alive++;
            }
            if (checkUpperLeft(i, i1)) {
                alive++;
            }
            if (checkLeft(i, i1)) {
                alive++;
            }
            if (checkLowerLeft(i, i1)) {
                alive++;
            }
            if (checkLower(i, i1)) {
                alive++;
            }
        } //UpperEdge
        else if ((i < getWidth() && i > 0) && i1 == 0) {
            if (checkLower(i, i1)) {
                alive++;
            }
            if (checkLowerLeft(i, i1)) {
                alive++;
            }
            if (checkLeft(i, i1)) {
                alive++;
            }
            if (checkLowerRight(i, i1)) {
                alive++;
            }
            if (checkRight(i, i1)) {
                alive++;
            }
        } //LowerEdge
        else if ((i < getWidth() && i > 0) && i1 == getHeight()) {
            if (checkUpper(i, i1)) {
                alive++;
            }
            if (checkLeft(i, i1)) {
                alive++;
            }
            if (checkUpperLeft(i, i1)) {
                alive++;
            }
            if (checkUpperRight(i, i1)) {
                alive++;
            }
            if (checkRight(i, i1)) {
                alive++;
            }
        } //Center
        else {
            if (checkUpperLeft(i, i1)) {
                alive++;
            }
            if (checkUpper(i, i1)) {
                alive++;
            }
            if (checkUpperRight(i, i1)) {
                alive++;
            }
            if (checkLeft(i, i1)) {
                alive++;
            }
            if (checkRight(i, i1)) {
                alive++;
            }
            if (checkLowerLeft(i, i1)) {
                alive++;
            }
            if (checkLower(i, i1)) {
                alive++;
            }
            if (checkLowerRight(i, i1)) {
                alive++;
            }
        }
        return alive;
    }

    private boolean checkUpperLeft(int i, int il) {
        return isAlive(i - 1, il - 1);
    }

    private boolean checkUpper(int i, int il) {
        return isAlive(i, il - 1);
    }

    private boolean checkUpperRight(int i, int il) {
        return isAlive(i + 1, il - 1);
    }

    private boolean checkLeft(int i, int il) {
        return isAlive(i - 1, il);
    }

    private boolean checkRight(int i, int il) {
        return isAlive(i + 1, il);
    }

    private boolean checkLowerLeft(int i, int il) {
        return isAlive(i - 1, il + 1);
    }

    private boolean checkLower(int i, int il) {
        return isAlive(i, il + 1);
    }

    private boolean checkLowerRight(int i, int il) {
        return isAlive(i + 1, il + 1);
    }

}
