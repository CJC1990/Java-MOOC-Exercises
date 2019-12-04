
package farmsimulator;

public class MilkingRobot {
    
    private BulkTank bulkTank;

    public MilkingRobot() {
    }
    
    public BulkTank getBulkTank(){
        return bulkTank;
    }
    
    public void setBulkTank(BulkTank tank){
        this.bulkTank = tank;
    }
    
    public void milk(Milkable milkable){
        if(bulkTank == null){
            throw new IllegalStateException("No Bulk Tank has been added!");
        }else{
            bulkTank.addToTank(milkable.milk());
        }
    }
    
    
    
    
    
    
    
}
