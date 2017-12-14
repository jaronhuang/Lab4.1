/**
 * Lab 4.1
 * @author Jaron Huang
 * 12/14/17
 */
public class Card 
{
	private String rank;
	private String suit;
	private int pointValue;
	
	public Card(String rank, String suit, int pointValue) 
	{
		this.rank = rank;
		this.suit = suit;
		this.pointValue = pointValue;
	}
	
	public boolean equals(Card otherCard)
	{
		if (rank.equals(otherCard.getRank()))
		{
			if (suit.equals(otherCard.getSuit()))
			{
				if (pointValue == otherCard.getPointValue())
				{
					return true;
				}
			}
		}
		return false;
	}
	
	public String getRank()
	{
		return rank;
	}
	
	public String getSuit()
	{
		return suit;
	}
	
	public int getPointValue()
	{
		return pointValue;
	}
	
	public String toString()
	{
		return "[" + rank + ", " + suit + ", " + pointValue + "]";
	}
}
