
package farmsimulator;

public class BulkTank {
    
    private double capacity;
    private double volume;

    public BulkTank(double capacity) {
        this.capacity = capacity;
        volume = 0;
    }

    public BulkTank() {
        this(2000);
    }

    public double getCapacity() {
        return capacity;
    }
    
    public double getVolume() {
        return volume;
    }
    
    public double howMuchFreeSpace(){
        return capacity - volume;
    }
    
    public void addToTank(double amount) {
        if(howMuchFreeSpace() < amount){
            volume = capacity;
        }else{
            volume += amount;
        } 
    }
    
    public double getFromTank(double amount){
        if(amount > volume){
            double returnedAmount = volume;
            volume = 0;
            return returnedAmount;
        }else{
            volume -= amount;
            return amount;
        }
    }

    @Override
    public String toString() {
        return Math.ceil(volume) + "/" + Math.ceil(capacity);
    }
    
    
    
    
    
    
    
}
