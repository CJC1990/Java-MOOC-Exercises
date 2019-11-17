
import java.util.HashMap;

public class PromissoryNote {
    
    private HashMap<String, Double> loans;

    public PromissoryNote() {
        loans = new HashMap<String, Double>();
    }
    
    public void setLoan(String toWhome, double value){
        loans.put(toWhome, value);
    }
    
    public double howMuchIsTheDebt(String name){
        if(this.loans.containsKey(name)){
            return this.loans.get(name);
        }
        return 0;
    }
    
    
    
}
