package Lab4_1;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Lab 4.1
 * @author Jaron Huang
 * 12/14/17
 */
public class Deck
{
	private ArrayList<Card> unDealt = new ArrayList<Card>();
	private ArrayList<Card> Dealt = new ArrayList<Card>();
	
	public Deck(String[] rank, String[] suit, int[] pointValue) 
	{
		for (int i = 0; i < rank.length; i++)
		{
			for (int j = 0; j < suit.length; j++)
			{
				Card card = new Card(rank[i], suit[j], pointValue[i]);
				unDealt.add(card);
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
		return unDealt.size();
	}
	
	public Card deal()
	{
		if(unDealt.size() > 0)
		{
			Card dealtCard = unDealt.get(0);
			Dealt.add(dealtCard);
			unDealt.remove(0);
			return dealtCard;
		}
		
		return null;
	}
	
	public void shuffle()
	{
		int select = 0;
		unDealt.addAll(Dealt);
		Dealt.clear();
		
		for (int i = 51; i > 0; i--)
		{
			select = (int)(Math.random() * i);
			Collections.swap(unDealt, i, select);
		}
	}
}
