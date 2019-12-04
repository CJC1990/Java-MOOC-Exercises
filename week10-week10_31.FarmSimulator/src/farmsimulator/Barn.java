
package farmsimulator;

import java.util.Collection;

public class Barn {
    
    private MilkingRobot milkingRobot;
    private BulkTank bulkTank;
    
    public Barn(BulkTank tank){
        this.bulkTank = tank;
        
    }
    
    public BulkTank getBulkTank(){
        return bulkTank;
    }
    
    public void installMilkingRobot(MilkingRobot milkingRobot){
        this.milkingRobot = milkingRobot;
        milkingRobot.setBulkTank(bulkTank);
    }
    
    public void takeCareOf(Cow cow){
        if(milkingRobot == null){
            throw new IllegalStateException("No milking robot installed!");
        }else{
            milkingRobot.milk(cow);
        }
    }
    
    public void takeCareOf(Collection<Cow> cows){
        if(milkingRobot == null){
            throw new IllegalStateException("No milking robot installed!");
        }else{
            for (Cow cow : cows) {
                milkingRobot.milk(cow);
            }
        }
    }

    @Override
    public String toString() {
        return bulkTank.toString();
    }
    
    
    
    
    
    
}
