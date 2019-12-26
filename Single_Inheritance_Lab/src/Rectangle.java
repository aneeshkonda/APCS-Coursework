
public class Rectangle {
	private String name;
	private double length;
	private double width;
	private double area;
	private double perimeter;
	
	
	public Rectangle()
	{
		this.name = "Rectangle";
	}
	
	public Rectangle(String name)
	{
		this.name = name;
		System.out.println("Entering Rectangle's Overloaded Constructor( name = " + this.name + " ).");
		System.out.println("Exiting Rectangle's Overloaded Constructor( name = " + this.name + " ).");
	}
	
	public Rectangle(String name, double length, double width)
	{
		this(name);
		this.length = length;
		this.width = width;
		System.out.println("Entering Rectangle's Overloaded Constructor( name = " + this.name + ", L = " + this.length + ", width = " + width + " ).");
		this.area = area(this.length, this.width);
		this.perimeter = perimeter(this.length, this.width);
		secret();
		System.out.println("Exiting Rectangle's Overloaded Constructor( name = " + this.name + ", L = " + this.length + ", width = " + width + " ).");
	}

	public Rectangle(double length, double width)
	{
		this("Rectangle", length, width);
		System.out.println("Entering Rectangle's Overloaded Constructor( L = " + this.length + ", W = " + width + " ).");
		System.out.println("Exiting Rectangle's Overloaded Constructor( L = " + this.length + ", W = " + width + " ).");
	}
	
	public double area(double length, double width)
	{
		System.out.println("Entering Rectangle's area method.");
		this.area = (length * width);
		System.out.println("Exiting Rectangle's area method with an area of " + this.area);
		return this.area;
	}
	
	public double perimeter(double length, double width)
	{
		System.out.println("Entering Rectangle's perimeter method.");
		this.perimeter = ((2*length) + (2*width));
		System.out.println("Exiting Rectangle's perimeter method with a perimeter of " + this.perimeter);
		return this.perimeter;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public void secret()
	{
		System.out.println("I know Rectangle’s secret.");
	}
	
	
}
