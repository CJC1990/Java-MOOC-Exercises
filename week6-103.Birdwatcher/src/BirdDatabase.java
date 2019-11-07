
import java.util.ArrayList;

public class BirdDatabase {

    // ---CLASS VARIABLES---
    private ArrayList<Bird> birdList;

    // ---CONSTRUCTOR---
    public BirdDatabase() {
        this.birdList = new ArrayList<Bird>();
    }

    // ---METHODS---
    public void add(String name, String latinName) {
        birdList.add(new Bird(name, latinName));
    }

    public void printStatistics() {
        for (Bird bird : birdList) {
            System.out.println(bird);
        }
    }

    public void observed(String name) {
        for (Bird bird : birdList) {
            if (bird.getName().equals(name)) {
                bird.sighted();
            } else {
                System.out.print("Is not a bird!");
            }
        }
    }
    
    

    public void show(String input) {
        for (Bird bird : birdList) {
            if (bird.getName().equals(input)) {
                System.out.println(bird);
            }
        }
    }
}
