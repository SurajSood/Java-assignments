
public class Hand 
{
	private Card[] storage;
	private int cardCount;
	
	public Hand() //constructor of the object that holds the players cards
	{
		Hand player1 = new Hand();
		Hand player2 = new Hand();
		player1.draw(myDeck.deal());
	}
	public void displayHand() //display the hand
	{
		for (int i = 0; i < cardCount; i++)
			storage[i].displayCard();
	}
	public void take(Card c) //takes a card that is dealt
	{
		if (c == null)
	         throw new NullPointerException("Can't add a null card to a hand.");
	      Hand.take(c);
	}
	public int value() //returns the value of the hand
	{
		int handValue1 = //dealtcard1+dealtcard2
		int handValue2 = //dealthcard1value+dealtcard2value
		return handValue1, handValue2;
	}
}
