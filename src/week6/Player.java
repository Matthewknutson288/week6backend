package week6;

import java.util.ArrayList;

public class Player {
    private ArrayList<Card> hand;
    private int score;
    private String name;

    public Player(String name) {
        this.hand = new ArrayList<Card>();
        this.score = 0;
        this.name = name;
    }

    public void describe() {
        System.out.println(name + " has " + score + " points");
        for (Card card : hand) {
            card.describe();
        }
    }

    public Card flip() {
        return this.hand.remove(0);
    }

    public void draw(Deck deck) {
        this.hand.add(deck.draw());
    }

    public void incrementScore() {
        this.score++;
    }
    
    public int getScore() {
        return this.score;
    }

    public ArrayList<Card> getHand() {
        return this.hand;
    }
}