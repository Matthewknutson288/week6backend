package week6;

public class App {
    public static void main(String[] args) {
        // Create a new deck and shuffle it
        Deck deck = new Deck();
        deck.shuffle();

        // Create two players
        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");

        // Deal the cards to the players
        for (int i = 0; i < 26; i++) {
            player1.draw(deck);
            player2.draw(deck);
        }

        // Play until one player runs out of cards
        while (!player1.getHand().isEmpty() && !player2.getHand().isEmpty()) {
            Card player1Card = player1.flip();
            Card player2Card = player2.flip();

            if (player1Card.getValue() > player2Card.getValue()) {
                player1.incrementScore();
                System.out.println("Player 1 wins the round");
            } else if (player1Card.getValue() < player2Card.getValue()) {
                player2.incrementScore();
                System.out.println("Player 2 wins the round");
            } else {
                System.out.println("It's a draw");
            }
        }

        // Announce the winner
        if (player1.getScore() > player2.getScore()) {
            System.out.println("Player 1 wins the game");
        } else if (player1.getScore() < player2.getScore()) {
            System.out.println("Player 2 wins the game");
        } else {
            System.out.println("The game is a draw");
        }
    }
}