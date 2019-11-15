
import java.util.ArrayList;

public class Suitcase {
    
    private ArrayList<Thing> things;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        things = new ArrayList<Thing>();
        this.maxWeight = maxWeight;
    }
    
    public void addThing(Thing thing){
        if(hasSpaceFor(thing)){
          this.things.add(thing);  
        }
        
    }
    
    public boolean hasSpaceFor(Thing thing){
        if(thing.getWeight() + totalWeight() > maxWeight){
            return false;
        }
        return true;
    }
    
    public int totalWeight(){
        int totalWeight = 0;
        for (Thing thing : this.things) {
            totalWeight += thing.getWeight();
        }
        return totalWeight;
    }
    
    public void printThings(){
        for (Thing thing : things) {
            System.out.println(thing.toString());
        }
    }
    
    public Thing heaviestThing(){
        if(things.size() == 0){
            return null;
        }
        Thing heaviestThing = things.get(0);
        for (Thing thing : things) {
            if(thing.getWeight() > heaviestThing.getWeight()){
                heaviestThing = thing;
            }
        }
        return heaviestThing;
    }

    @Override
    public String toString() {
        if(things.size() == 0){
            return "empty (" + totalWeight() + "kg)";
        }
        if(things.size() == 1){
            return things.size() + " thing (" + totalWeight() + "kg)";
        }
        return things.size() + " things (" + totalWeight() + " kg)";
    }
    
    
    
    
    
    
    
}
