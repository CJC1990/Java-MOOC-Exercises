
import java.util.ArrayList;

public class Container {
    
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;

    public Container(int maxWeight) {
        this.maxWeight = maxWeight;
        suitcases = new ArrayList<Suitcase>();
    }
    
    public void addSuitcase(Suitcase suitcase){
        if(hasSpaceFor(suitcase)){
            suitcases.add(suitcase);
        }
    }
    
    public boolean hasSpaceFor(Suitcase suitcase){
        if(totalWeight() + suitcase.totalWeight() > maxWeight){
            return false;
        }
        return true;
    }
    
    public int totalWeight(){
        int totalWeight = 0;
        for (Suitcase suitcase : suitcases) {
            totalWeight += suitcase.totalWeight();
        }
        return totalWeight;
    }
    
    public void printThings(){
        for (Suitcase suitcase : suitcases) {
            suitcase.printThings();
        }
    }

    @Override
    public String toString() {
        return suitcases.size() + " suitcases (" + totalWeight() + " kg)"; 
    }
    
    
    
    
    
}
