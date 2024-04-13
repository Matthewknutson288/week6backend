package week6;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> cards;

    public Deck() {
        this.cards = new ArrayList<Card>();

        // Populate the deck with 52 cards
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] names = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        for (String suit : suits) {
            for (int i = 0; i < names.length; i++) {
                this.cards.add(new Card(names[i] + " of " + suit, i + 2));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(this.cards);
    }

    public Card draw() {
        return this.cards.remove(this.cards.size() - 1);
    }
}