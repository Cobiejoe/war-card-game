package war;

public class Card {
	
	// fields
	private int rank;
    private int suit; 
    
    // Constructor
    public Card(int suit, int rank){
        this.rank = rank;
        this.suit = suit;
    }
    
    // Getters & Setters
    public int getCard(){
        return rank; 
    }
    public void setCard(int rank){
        this.rank = rank;
    }
    public int getRank() {
    	return rank;
    }
    public void setRank(int rank) {
    	this.rank = rank;
    }
    public int getSuit() {
    	return suit;
    }
    public int setSuit(int suit) {
    	return suit;
    }
    
   
    // method to get card description to print in console
    public String describe(){
        StringBuilder displayCard = new StringBuilder();
        
        switch(rank){
            case 11:
                displayCard.append("Jack");
                break;
            case 12:
                displayCard.append("Queen");
                break;
            case 13:
                displayCard.append("King");
                break;
            case 14:
                displayCard.append("Ace");
                break;    
            default:
                displayCard.append(rank); 
                break;
        }
        
        displayCard.append(" of "); 
        
        switch(suit){
            case 0:
                displayCard.append("Spades");
                break;
            case 1:
                displayCard.append("Hearts");
                break;
            case 2:
                displayCard.append("Clubs");
                break;
            case 3:
                displayCard.append("Diamonds");
                break;
            default: 
                break;
        }
        
        
        return displayCard.toString();
    }
}
	
