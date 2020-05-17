
import java.util.ArrayList;
import java.util.Collections;


/**
 *
 * @author michael
 */
public class Hand implements Comparable<Hand> {
    
    private ArrayList<Card> cards = new ArrayList<>();
    
    public void add(Card card) {
        cards.add(card);
    }
    
    public void print() {
        for (Card card : cards) {
            System.out.println(card);
        }
    }
    
    public void sort() {
        Collections.sort(cards);
        print();
    }

    public ArrayList<Card> getCards() {
        return cards;
    }
    
    public void sortBySuit() {
        Collections.sort(cards, new BySuitInValueOrder());
        print();
    }
    
    @Override
    public int compareTo(Hand hand) {
        int handCount = 0;
        int otherHandCount = 0;
        for (Card card: cards) {
            handCount += card.getValue();
        }
        
        for (Card card: hand.getCards()) {
            otherHandCount += card.getValue();
        }
        
        return handCount - otherHandCount;
    }
}
