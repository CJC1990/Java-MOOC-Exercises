
import java.util.Comparator;

public class SortAgainstSuitAndValue implements Comparator<Card> {

    @Override
    public int compare(Card o1, Card o2) {
        return ( (o1.suitAndValueRanking())   -   (o2.suitAndValueRanking())  );
    }
    
    
    
}
