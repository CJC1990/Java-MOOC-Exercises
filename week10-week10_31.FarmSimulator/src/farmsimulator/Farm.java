
package farmsimulator;

import java.util.ArrayList;
import java.util.List;

public class Farm implements Alive {
    
    private String owner;
    private Barn barn;
    private List<Cow> cows; 

    public Farm(String owner, Barn barn) {
        this.owner = owner;
        this.barn = barn;
        cows = new ArrayList<Cow>();
    }
    
    public void installMilkingRobot(MilkingRobot robot){
        barn.installMilkingRobot(robot);
    }
    
    public void manageCows(){
        barn.takeCareOf(cows);
    }
    
    public void addCow(Cow cow){
        cows.add(cow);
    }
    
    public String getOwner(){
        return owner;
    }

    @Override
    public void liveHour() {
        for (Cow cow : cows) {
            cow.liveHour();
        }
    }
    
    private String makeStringOfCows(){
        if(cows.isEmpty()){
            return "No cows.";
        }else{
            String toBeReturned = "Animals: \n";
            for (Cow cow : cows) {
                toBeReturned += "        " + cow.toString() + "\n";
            }
            return toBeReturned;
        }
    }

    @Override
    public String toString() {
        return "Farm owner: " + owner + 
                "\nBarn bulk tank: " + barn.getBulkTank().toString() + "\n" +
                makeStringOfCows();
    }
    
    
    
}
