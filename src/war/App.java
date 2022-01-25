package war;

import java.util.ArrayList;
import java.util.List;

public class App {
	public static void main(String[] args) {
		
		// Instantiate Deck and players
		Deck deck = new Deck();
		deck.shuffle();
		List<Card> hand1 =new ArrayList<Card>();
		Player player1 = new Player(0, "Player 1", hand1);
		List<Card> hand2 = new ArrayList<Card>();
		Player player2 = new Player(0, "Player 2", hand2);
		
		// Deal out the cards
		for (int i = 0; i < 52; i++) {
			if (i % 2 == 0) {
				player1.draw(deck);
			} else if (i % 2 != 0) {
				player2.draw(deck);
			}
		}
		
		// Game time
		for (int i = 0; i < 26; i++) {
			Card player1Card = player1.flip();
			Card player2Card = player2.flip();
			System.out.println("Player 1 played: " + player1Card.describe() + " - " 
								+ "Player 2 played: " + player2Card.describe());
			if (player1Card.getRank() > player2Card.getRank()) {
				player1.incrementScore();
				System.out.println("Player 1 wins this round");
			} else if (player1Card.getRank() < player2Card.getRank()) {
				player2.incrementScore();
				System.out.println("Player 2 wins this round");
			} else {
				player1.incrementScore();
				player2.incrementScore();
				System.out.println("It's a tie!");
			}
			System.out.println("------------------------------------------------------------");
		}
		if (player1.getScore() > player2.getScore()) {
			System.out.println("Player 1 wins the game!!" + "(" + player1.getScore() + "/" + player2.getScore() + ")");
		} else if (player2.getScore() > player1.getScore()) {
			System.out.println("Player 2 wins the game!!" + "(" + player2.getScore() + "/" + player1.getScore() + ")");
		} else {
			System.out.println("Game ended in a tie!" + "(" + player1.getScore() + "/" + player2.getScore() + ")");
		}
	}
}
