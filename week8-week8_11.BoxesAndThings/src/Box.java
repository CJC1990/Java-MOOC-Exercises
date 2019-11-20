
import java.util.ArrayList;

public class Box implements ToBeStored {
    
    private ArrayList<ToBeStored> storedItems;
    private double maxWeight;

    public Box(double maxWeight) {
        storedItems = new ArrayList<ToBeStored>();
        this.maxWeight = maxWeight;
    }
    
    public void add(ToBeStored item){
        if(currentWeight() + item.weight() <= maxWeight){
            storedItems.add(item);
        }
    }
    
    public double currentWeight(){
        double weight = 0;
        for (ToBeStored storedItem : storedItems) {
            weight += storedItem.weight();
        }
        return weight;
    }

    @Override
    public double weight() {
        return currentWeight();
    }
    
    @Override
    public String toString() {
        return "Box: " + storedItems.size() + " things, total weight " + currentWeight() + " kg";
    }
 
}
