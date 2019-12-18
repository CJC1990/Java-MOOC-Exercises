
package reader.criteria;

public class AtLeastOne implements Criterion {
    
    private Criterion[] allCriterions;

    public AtLeastOne(Criterion... criterion) {
        allCriterions = criterion;
    }
    
    @Override
    public boolean complies(String line) {
        for (Criterion criterion : allCriterions) {
            if(criterion.complies(line)){
                return true;
            }
        }
        return false;
    }
    
}
