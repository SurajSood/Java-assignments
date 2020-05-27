import java.util.Random;
import java.util.Scanner;

public class Main 
{
	Hand player1 = new Hand();
	CardDeck myDeck = new CardDeck();
	Card temp = myDeck.deal();
	player1.draw(temp);
	
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int war = keyboard.nextInt();
		
		System.out.println("Main menu");
		System.out.println();
		System.out.println("1) Get a new card deck");
		System.out.println("2) Show all cards in the deck");
		System.out.println("3) Shuffle");
		System.out.println("4) Play WAR!");
		System.out.println("5) Exit");
		System.out.println();
		
		CardDeck g = new CardDeck();
		
		
		while(war != 5)
		{
			if (war == 1)
			{
				g.CardDeck();
			}
			else if (war == 2)
			{
				g.displayDeck();
			}
			else if (war == 3)
			{
				g.shuffle();
			}
			else if (war == 4)
			{
				System.out.println("Get ready to play...two-card WAR!!!");
				System.out.println();
				g.shuffle();
				System.out.println("There are 52 cards in the deck.");
				System.out.println();
				System.out.println("...dealing...");
				System.out.println("One for you...")
				g.Card deal(player1); //deal top card to player2, subtract from cardCount
				System.out.println("Whatever card you just got."); //let them know their card (rank and suit)
				//deal next top card to player1, subtract from cardCount
				System.out.println("One for me...");
				System.out.println("Whatever card I just got."); //let know my card (rank and suit)
				//deal next top card to player 2, subtract from cardCount
				System.out.println("Two for you...");
				System.out.println("Whatever card.");
				//deal next top card to player1
				System.out.println("Two for me...");
				System.out.println("Whatever card.");
				//print and calculate each player's points
				System.out.println("You have x points");
				System.out.println("I have y points");
				//print outcome; if player1 points > player2 points...print "Ha - I win!"
				//else if player 2 pts. > p1 pts....print "Wahh...You Win!"
				//else if p2 pts. == p1 pts.: "Tie game - I challenge you again."
				//Outside of this if-else, ask to play again; if Y, reiterate loop, if not main menu
			}
			System.out.println("");
			System.out.println("Play again?");
			System.out.println("");
			System.out.println("1) Yes 2) No");
			//if 1, war == 4; if 2, main menu
			war = keyboard.nextInt();
			}
			System.out.println("Thank you for using the War Program. See you next time!");
		}
		
	}	
}