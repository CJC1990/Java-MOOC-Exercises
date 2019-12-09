package dungeon;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Dungeon {

    //Player will always be at Index 0.
    private List<Movable> mobs;

    private int length;
    private int height;
    private boolean vampireMoves;
    private Random random;

    private Player player;
    private Scanner reader;

    private List<Movable> toBeRemoved;
    private List<StringBuilder> sbList;

    public Dungeon(int length, int height, int vampires, int moves, boolean vampireMoves) {
        //board size
        this.length = length;
        this.height = height;

        //player
        player = new Player(moves, length, height);

        //creating and adding vampires
        mobs = new ArrayList<Movable>();

        random = new Random();

        for (int i = 0; i < vampires; i++) {
            mobs.add(new Vampire(random.nextInt(length-1) + 1, random.nextInt(height-1) + 1, length, height));
        }

        //Do vampires move?
        this.vampireMoves = vampireMoves;

        //Scanner
        reader = new Scanner(System.in);

        toBeRemoved = new ArrayList<Movable>();
        sbList = new ArrayList<StringBuilder>();

    }

    public void run() {
        while ( player.getLightLeft() > 0 && mobs.size() > 0) {
            printRound();
            calcMoves();
        }
        if(player.getLightLeft() > 0){
            System.out.println("YOU WIN");
        }else{
            System.out.println("YOU LOSE");
        }
    }

    public void printRound() {
        System.out.println(player.getLightLeft());
        System.out.println("");
        System.out.println(player);
        for (Movable mob : mobs) {
            System.out.println(mob);
        }
        System.out.println("");
        printBoard();
        System.out.println("");
    }

    public void printBoard() {
        sbList.clear();
        String across = "";
        for(int j=0; j<length; j++){
            across += ".";
        }
        for(int i=0; i<height; i++){
            sbList.add(new StringBuilder(across));
        }
        
        sbList.get(player.getY()).replace(player.getX(), player.getX()+1, "@");
        
        for (Movable mob : mobs) {
            sbList.get(mob.getY()).replace(mob.getX(), mob.getX()+1, "v");
        }
        
        for (StringBuilder sb : sbList) {
            System.out.println(sb.toString());  
        }
       
    }

    public void calcMoves() {
        //get the players input, make it all lowercase
        String playerInput = reader.nextLine();
        playerInput = playerInput.toLowerCase();
        int moveX;
        int moveY;

        //turn every valid char into a turn;
        for (int i = 0; i < playerInput.length(); i++) {

            switch (playerInput.charAt(i)) {
                case 'w':
                    moveX = 0;
                    moveY = -1;
                    break;
                case 'a':
                    moveX = -1;
                    moveY = 0;
                    break;
                case 's':
                    moveX = 0;
                    moveY = 1;
                    break;
                case 'd':
                    moveX = 1;
                    moveY = 0;
                    break;
                default:
                    moveX = Integer.MAX_VALUE;
                    moveY = Integer.MAX_VALUE;
                    break;
            }
            player.move(moveX, moveY);
            checkPlayerVampireSameSpot();
            mobMoves();
        }
        player.finishTurn();
    }

    public void checkPlayerVampireSameSpot() {
        toBeRemoved.clear();
        for (Movable mob : mobs) {
            if (player.getX() == mob.getX() && player.getY() == mob.getY()) {
                toBeRemoved.add(mob);
            }
        }
        mobs.removeAll(toBeRemoved);
    }

    public boolean canVampireMove(int moveX, int moveY) {
        for (Movable mob : mobs) {
            for (Movable oMob : mobs) {
                if (mob.getX() + moveX == oMob.getX() && mob.getY() + moveY == oMob.getY()) {
                    return false;
                }
            }
        }
        return true;
    }

    public void mobMoves() {
        if (vampireMoves) {
            for (int i = 0; i < mobs.size(); i++) {
                int randomMobMove = random.nextInt(4);
                if (randomMobMove == 0 && canVampireMove(0, -1)) {
                    mobs.get(i).move(0, -1);
                }
                if (randomMobMove == 1 && canVampireMove(-1, 0)) {
                    mobs.get(i).move(-1, 0);
                }
                if (randomMobMove == 2 && canVampireMove(0, 1)) {
                    mobs.get(i).move(0, 1);
                }
                if (randomMobMove == 3 && canVampireMove(1, 0)) {
                    mobs.get(i).move(1, 0);
                }
                checkPlayerVampireSameSpot();
            }
        }
    }

}
