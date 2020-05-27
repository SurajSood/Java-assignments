public class CardDeck 
{
	private Card[] deck;
	private int cardCount;
	private int topCard;
	private int cardsUsed;
	
	public CardDeck() //constructor which creates a deck of 52 cards
	{
			cardCount = 52;
			deck = new Card[52];
			deck[0] = new Card('A', 'H');
			deck[1] = new Card('2', 'H');
			deck[2] = new Card('3', 'H');
			deck[3] = new Card('4', 'H');
			deck[4] = new Card('5', 'H');
			deck[5] = new Card('6', 'H');
			deck[6] = new Card('7', 'H');
			deck[7] = new Card('8', 'H');
			deck[8] = new Card('9', 'H');
			deck[9] = new Card('T', 'H');
			deck[10] = new Card('J', 'H');
			deck[11] = new Card('Q', 'H');
			deck[12] = new Card('K', 'H');
			deck[13] = new Card('A', 'D');
			deck[14] = new Card('2', 'D');
			deck[15] = new Card('3', 'D');
			deck[16] = new Card('4', 'D');
			deck[17] = new Card('5', 'D');
			deck[18] = new Card('6', 'D');
			deck[19] = new Card('7', 'D');
			deck[20] = new Card('8', 'D');
			deck[21] = new Card('9', 'D');
			deck[22] = new Card('T', 'D');
			deck[23] = new Card('J', 'D');
			deck[24] = new Card('Q', 'D');
			deck[25] = new Card('K', 'D');
			deck[26] = new Card('A', 'S');
			deck[27] = new Card('2', 'S');
			deck[28] = new Card('3', 'S');
			deck[29] = new Card('4', 'S');
			deck[30] = new Card('5', 'S');
			deck[31] = new Card('6', 'S');
			deck[32] = new Card('7', 'S');
			deck[33] = new Card('8', 'S');
			deck[34] = new Card('9', 'S');
			deck[35] = new Card('T', 'S');
			deck[36] = new Card('J', 'S');
			deck[37] = new Card('Q', 'S');
			deck[38] = new Card('K', 'S');
			deck[39] = new Card('A', 'C');
			deck[40] = new Card('2', 'C');
			deck[41] = new Card('3', 'C');
			deck[42] = new Card('4', 'C');
			deck[43] = new Card('5', 'C');
			deck[44] = new Card('6', 'C');
			deck[45] = new Card('7', 'C');
			deck[46] = new Card('8', 'C');
			deck[47] = new Card('9', 'C');
			deck[48] = new Card('T', 'C');
			deck[49] = new Card('J', 'C');
			deck[50] = new Card('Q', 'C');
			deck[51] = new Card('K', 'C');
	}
	public void displayCardAt(int position) //display the card at particular location (array index)
	{
		if (position >= deck.length - topCard || position < topCard) 
            throw new IndexOutOfBoundsException("Values are out of bounds"); 
		else 
            deck[topCard + position].displayCard();
	}
	public void displayDeck() //display the entire deck
	{
		CardDeck myDeck = new CardDeck();
		myDeck.displayDeck();
	}
	public Card deal(int topCard) //deal the top card from the deck
	{
		if (cardsUsed == deck.length)
            throw new IllegalStateException("No cards are left in the deck.");
        cardsUsed++;
        return deck[cardsUsed - 1];
	}	
	public int cardsLeft() //how many cards are left in the deck
	{
		return deck.length - cardsUsed;
	}
	public void shuffle() //shuffle the cards in the deck
	{
		for ( int i = deck.length-1; i > 0; i-- ) {
            int rand = (int)(Math.random()*(i+1));
            Card temp = deck[i];
            deck[i] = deck[rand];
            deck[rand] = temp;
        }
        cardsUsed = 0;
	}
}
