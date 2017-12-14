import java.util.ArrayList;

/**
 * Lab 4.1
 * @author Jaron Huang
 * 12/14/17
 */
public class Deck
{
	ArrayList<Card> unDealt;
	ArrayList<Card> Dealt;
	
	public Deck(String[] rank, String[] suit, int[] pointValue) 
	{
		for (int i = 0; i < rank.length; i++)
		{
			for (int j = 0; j < suit.length; j++)
			{
				for (int k = 0; k < pointValue.length; k++)
				{
					unDealt.add("[rank, suit, pointValue]");
				}
			}
		}
	}
	
	public boolean isEmpty()
	{
		if (unDealt.size() == 0)
		{
			return true;
		}
		return false;
	}
	
	public int size()
	{
		
	}
	
	

}
