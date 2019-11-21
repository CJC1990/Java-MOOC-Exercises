
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hand implements Comparable<Hand> {
    
    private List<Card> hand;

    public Hand() {
        hand = new ArrayList<Card>();
    }
    
    public void add(Card card){
        hand.add(card);
    }
    
    public void print(){
        for (Card card : hand) {
            System.out.println(card);
        }
    }
    
    public void sort(){
        Collections.sort(hand);
    }
    
    public int handValue(){
        int value = 0;
        for (Card card : hand) {
            value += card.getValue();
        }
        return value;
    }
    
//    public int totalValue(){
//        int suitValue = 0;
//        for (Card card : hand) {
//        suitValue += card.getSuit();
//        }
//        return suitValue + handValue();
//    }

    @Override
    public int compareTo(Hand o) {
        return handValue() - o.handValue();
    }
    
    public void sortAgainstSuit(){
        Collections.sort(hand, new SortAgainstSuitAndValue());
    }
    
    
}
