
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Jumper implements Comparable<Jumper> {

    private String name;
    private int points;
    private List<Integer> distances;
    private List<Integer> judgeScores;

    public Jumper(String name) {
        this.name = name;
        this.points = 0;
        judgeScores = new ArrayList<Integer>();
        distances = new ArrayList<Integer>();
    }

    public String getName() {
        return name;
    }

    public void addPoints() {
        int judgePoints = 0;
        for (int i = 1; i < 4; i++) {
            judgePoints += judgeScores.get(i);
        }
        this.points += getLastJumpDistance() + judgePoints;
    }

    public void jump() {
        distances.add((int) (Math.random() * (120 - 60) + 60));
    }

    public int getLastJumpDistance() {
        return distances.get(distances.size() - 1);
    }
    
    public int getRoundJumpDistance(int round){
        return distances.get(round);
    }
    
    public List<Integer> getDistances(){
        return distances;
    }

    public int getPoints() {
        return points;
    }

    public void createScores() {
        judgeScores.clear();
        for (int i = 0; i < 5; i++) {
            judgeScores.add((int) (Math.random() * (20 - 10) + 10));
        }
        Collections.sort(judgeScores);
    }
    
    public List<Integer> getJudgeScores(){
        return judgeScores;
    }

    @Override
    public String toString() {
        return name + " (" + points + " points)";
    }

    @Override
    public int compareTo(Jumper o) {
        return points - o.points;
    }

}
