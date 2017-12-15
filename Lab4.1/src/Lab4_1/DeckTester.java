package Lab4_1;

/**
 * Lab 4.1
 * @author Jaron Huang
 * 12/14/17
 */

public class DeckTester 
{
	public static void main(String[] args)
	{
		String[] rank = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
		String[] suit = {"Diamond", "Clubs", "Hearts", "Spades"};
		int[] pointValue = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
		
		Deck newDeck = new Deck(rank, suit, pointValue);
		
		newDeck.shuffle();
		
		for (int i = 0; i < newDeck.size(); i++)
		{
			System.out.println(newDeck.deal());
		}
	}
}
