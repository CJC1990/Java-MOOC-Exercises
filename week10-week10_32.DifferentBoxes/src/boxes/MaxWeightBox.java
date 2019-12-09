
package boxes;

import java.util.ArrayList;
import java.util.List;

public class MaxWeightBox extends Box {

    private int maxWeight;
    private List<Thing> thingsInBox;
    
    public MaxWeightBox(int maxWeight) {
        this.maxWeight = maxWeight;
        thingsInBox = new ArrayList<Thing>();
    }
    
    
    private int calcWeight(){
        int currentWeight = 0;
        for (Thing thing : thingsInBox) {
            currentWeight += thing.getWeight();
        }
        return currentWeight;
    }
    
    
    @Override
    public void add(Thing thing) {
        if( !(thing.getWeight() + calcWeight() > maxWeight) ){
            thingsInBox.add(thing);
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return thingsInBox.contains(thing);
    }
    
}
