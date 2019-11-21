
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Round {
   
    List<Jumper> jumpers;
    int roundNumber;

    public Round() {
        roundNumber = 1;
        jumpers = new ArrayList<Jumper>();
    }
    
    
    public void addJumper(String name){
        jumpers.add(new Jumper(name));
    }
    
    public void nextRound(){
        
        for (Jumper jumper : jumpers) {
            jumper.jump();
            jumper.createScores();
            jumper.addPoints();
        }
        
        roundNumber++;
    }
    
    
}
