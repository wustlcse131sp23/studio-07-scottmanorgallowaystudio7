package studio7;

public class Fraction {
	
	private double numerator;
	private double denominator;
	
	public Fraction(double initNumerator, double initDenominator)
	{
		numerator = initNumerator;
		denominator = initDenominator;
	}
	
	public double getNumerator()
	{
		return this.numerator;
	}
	
	public double getDenominator()
	{
		return this.denominator;
	}
	
	public Fraction reciprocal()
	{
		double newnumerator = this.denominator;
		double newdenominator = this.numerator;
		Fraction reciprocal = new Fraction(newnumerator, newdenominator);
		return reciprocal;
	}
	
	public Fraction multiply(Fraction frac2)
	{
		double newnumerator = this.numerator * frac2.numerator;
		double newdenominator = this.denominator * frac2.denominator;
		Fraction multiplied = new Fraction(newnumerator, newdenominator);
		return multiplied;
	}
	
	public Fraction addition(Fraction frac2)
	{
		double newnumerator = this.numerator * frac2.denominator + this.denominator*frac2.numerator;
		double newdenominator = this.denominator * frac2.denominator;
		Fraction added = new Fraction(newnumerator, newdenominator);
		return added;
	}
	
	public Fraction simplify()
	{
		double HCF = highestCommonFactor(this.numerator, this.denominator);
		Fraction simplified = new Fraction(this.numerator/HCF, this.denominator/HCF);
		return simplified;
	}
	
	public double highestCommonFactor(double p, double q)
	{
		if (p%q==0)
			return q;
		else
			return highestCommonFactor(q,p%q);
	}
	
	public String toString()
	{
		return this.numerator + "/" + this.denominator;
	}
	
	public static void main(String[] args)
	{
		Fraction input = new Fraction(3,9);
		Fraction input2 = new Fraction(5,21);
		System.out.println(input.reciprocal());
		System.out.println(input.multiply(input2));
		System.out.println(input.addition(input2));
		
		System.out.println(input.simplify());
		
	}

}
