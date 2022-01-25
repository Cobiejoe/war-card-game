package war;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Collections;
import java.util.LinkedList;

public class Deck {

	private final List<Card> deck = new ArrayList<Card>();
	
	public Deck() {
		createDeck();
	}
		
	public void createDeck() {
		for (int i = 0; i < 4; i++) {
			for (int j = 2; j < 15; j++) {
				deck.add(new Card(i, j));
			}
		}
	}	
	
	public int getCardCount() {
		return this.deck.size();
	}
	
	public void shuffle() {
		Collections.shuffle(deck, new Random());
	}
	
	public Card draw() {
		return this.deck.remove(this.deck.size() - 1);
	}
	
	public int getDeckSize() {
		return deck.size();
	}
	
	public String describe() {
		return this.deck.toString();
	}
}
	
