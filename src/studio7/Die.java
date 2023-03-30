package studio7;

public class Die {
	
	private int sides;
	
	public Die(int initSides)
	{
		sides = initSides;
	}
	
	public int getSides()
	{
		return this.sides;
	}
	
	public int dieThrow()
	{
		return (int)(Math.random()*(this.sides) + 1);
	}

	public static void main(String[] args)
	{
		Die die1 = new Die(6);
		System.out.println(die1.dieThrow());
	}
}
