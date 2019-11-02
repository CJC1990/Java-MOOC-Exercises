
import java.util.ArrayList;

public class Team {

    private String name;
    private int maxSize;
    private ArrayList<Player> players;

    public Team(String name) {
        this.name = name;
        this.players = new ArrayList<Player>();
        this.maxSize = 16;
    }

    public String getName() {
        return name;
    }

    public void addPlayer(Player player) {
        if(!teamFull()){
            this.players.add(player);
        }  
    }

    public void printPlayers() {
        for (Player player : players) {
            System.out.println(player);
        }
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }
    
    public boolean teamFull(){
        if(this.players.size() >= this.maxSize){
            return true;
        }
        return false;
    }
    
    public int size(){
        return this.players.size();
    }
    
    public int goals(){
        int totalGoals = 0;
        for (Player player : players) {
            totalGoals += player.goals();
        }
        return totalGoals;
    }
    
    
    
    

}
