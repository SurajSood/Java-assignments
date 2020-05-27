
public class Card 
{
	public final static int Spades = 0;   // Codes for the 4 suits
	public final static int Hearts = 1;
	public final static int Diamonds = 2;
	public final static int Clubs = 3;
	   
	public final static int Ace = 1;      // Codes for the non-numeric cards.
	public final static int Jack = 11;    //   Cards 2 through 10 have their 
	public final static int Queen = 12;   //   numerical values for their codes.
	public final static int King = 13;
	
	int value = 0;
	private char suit, rank;
	
	public Card (char r, char s) //constructor to create a card, setting the suit and rank
	{
		suit = s;
		rank = r;
		Card C1 = new Card('3', 'S');
		C1.displayCard();
		
	}
	public int getValue() //return the point value of the card
	{
		return value;
	}
	public void displayCard() //display the card
	{
		
	}
}
