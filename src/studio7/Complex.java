package studio7;

public class Complex {

	private double Re;
	private double Im;
	
	public Complex(double initRe, double initIm)
	{
		Re = initRe;
		Im = initIm;
	}
	
	public double getRealPart()
	{
		return this.Re;
	}
	
	public double getImaginaryPart()
	{
		return this.Im;
	}
	
	public Complex addComplex(Complex complex2)
	{
		double newRe = this.Re + complex2.Re;
		double newIm = this.Im + complex2.Im;
		return new Complex(newRe, newIm);
	}
	
	public Complex multiplyComplex(Complex complex2)
	{
		double newRe = this.Re * complex2.Re - this.Im * complex2.Im;
		double newIm = this.Re * complex2.Im + this.Im * complex2.Re;
		return new Complex(newRe, newIm);
	}
	
	public String toString()
	{
		return this.Re + " + " + this.Im + "i";
	}
	
	public static void main(String[] args)
	{
		Complex num1 = new Complex(1,2);
		Complex num2 = new Complex(4,8);
		
		System.out.println(num1);
		
		System.out.println(num1.addComplex(num2));
		System.out.println(num1.multiplyComplex(num2));
	}
	
}
