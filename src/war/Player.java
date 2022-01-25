package war;

import java.util.List;

public class Player {

	private List<Card> hand;
	private int score;
	private String name;
	
	public Player(int score, String name, List<Card> hand) {
		this.score = 0;
		this.name = name;
		this.hand = hand;
	}
	
	public String describe() {
		StringBuilder info = new StringBuilder();
		info.append(name + ": ");
		for (Card card : hand) {
			info.append(card.describe() + ", ");
		}
		return info.toString();
	}
	
	public Card flip() {
		return this.hand.remove(hand.size() - 1);
	}
	
	public Card draw(Deck deck) {
		Card card = deck.draw();
		hand.add(card);
		return card;
	}
	
	public void incrementScore() {
		score += 1;
	}

	public List<Card> getHand() {
		return hand;
	}

	public int getScore() {
		return score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
