
public class Square extends Rectangle {
	private double side;
	
	public Square()
	{
		super("Square");
	}
	
	public Square(double side)
	{
		super("Square", side, side);
		System.out.println("Entering Square's Overloaded Constructor (side = " + side + ").");
		System.out.println("Exiting Square's Overloaded Constructor (side = " + side + ").");
	}
	
	public void secret()
	{
		System.out.println("I know Square’s secret.");
	}
	
}
