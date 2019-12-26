
public class Rectangle {
	//global variables
	private double length; 
	private double width;
	private double perimeter = 2*length + 2*width;
	private double area = length * width;
	
	//This is the constructor
	public Rectangle() {
		
	}
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	public void print() {
		System.out.println("This Rectangle has a length of " + getLength() + " and a width of " + getWidth() + ".");
		System.out.println("The area of the rectangle is: " + getArea());
		System.out.println("The perimeter of the rectangle is: " + getPerimeter() );
	}
	
	public void setLength(double length) {
		this.length = length;
		System.out.println("The length was changed to: " + length);
	}
	
	public void setWidth(double width) {
		this.width = width;
		System.out.println("The width was changed to: " + width);
	}
	
	public double getLength() {
		return this.length;
	}
	
	public double getPerimeter() {
		return (2*getLength()) + (2*getWidth());
	}
	
	public double getArea() {
		return getLength() * getWidth();
	}

	public double getWidth() {
		return this.width;
	}
}
