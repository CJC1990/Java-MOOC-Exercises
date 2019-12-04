
package containers;

import java.util.ArrayList;
import java.util.List;

public class ContainerHistory {
    
    private List<Double> history;

    public ContainerHistory() {
        history = new ArrayList<Double>();
    }
    
    public void add(double situation){
        history.add(situation);
    }
    
    public void reset(){
        history.clear();
    }
    
    public double maxValue(){
        double maxValue = 0;
        for (Double value : history) {
            if(value > maxValue){
                maxValue = value;
            }
        }
        return maxValue;
    }
    
    public double minValue(){
        if(history.isEmpty()){
            return 0;
        }
        double minValue = history.get(0) ;
        for (Double value : history) {
            if(value < minValue){
                minValue = value;
            }
        }
        return minValue;
    }
    
    public double average(){
        if(history.isEmpty()){
            return 0;
        }
        double sum = 0;
        for (Double value : history) {
            sum += value;
        }
        return sum / history.size();
    }
    
    public double greatestFluctuation(){
        if(history.size() < 2){
            return 0;
        }
        double greatestFluc = 0;
        for(int i=1; i<history.size(); i++){
            double diff = Math.abs(history.get(i) - history.get(i-1));
            if (diff > greatestFluc){
                greatestFluc = diff;
            }
        }
        return greatestFluc;
    }
    
    public double variance(){
        if(history.size() < 2){
            return 0;
        }
        double variance = 0;
        for (Double value : history) {
            variance += Math.pow(value - average(), 2) ;
        }
        return variance / (history.size() - 1);
    }

    @Override
    public String toString() {
        return history.toString();
    }
    
    
    
    
    
}
