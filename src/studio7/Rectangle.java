package studio7;

public class Rectangle {
	
	private double length;
	private double width;
	
	public Rectangle(double initLength, double initWidth)
	{
		length = initLength;
		width = initWidth;
	}
	
	public double getLength()
	{
		return this.length;
	}
	
	public double getWidth()
	{
		return this.length;
	}
	
	public double calculatePerimeter() 
	{
		return this.length*2 + this.width*2;
	}
	
	public double calculateArea()
	{
		return this.length * this.width;
	}
	public boolean smallerThan(Rectangle comparison)
	{
		if (this.calculateArea() > comparison.calculateArea())
			return false;
		else
			return true;
	}
	
	public boolean isSquare()
	{
		if (this.length == this.width)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args)
	{
		Rectangle rec1 = new Rectangle(5,8);
		Rectangle rec2 = new Rectangle(4,4);
		
		System.out.println(rec1.smallerThan(rec2));
		System.out.println(rec2.isSquare());
		System.out.println(rec1.calculateArea());
		System.out.println(rec1.calculatePerimeter());
		
	}

}
