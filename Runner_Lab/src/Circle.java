
public class Circle {
	private double radius; 
	private double circumference = Math.PI * (radius * 2);
	private double area = Math.PI * (radius * radius);
	
	public Circle() {
		
	}
	
	public Circle(double radius) {
		System.out.println("The radius was changed to: " + radius);
		this.radius = radius;
	}
	
	public void print() {
		System.out.println("This Circle has a radius of " + getRadius() + ".");
		System.out.println("The area of the circle is: " + getArea());
		System.out.println("The circumference of the circle is: " + getCircumference() );
	}
	
	public void set_radius(double radius) {
		this.radius = radius;
		System.out.println("The radius was changed to: " + radius);
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public double getArea() {
		return Math.PI * (getRadius() * getRadius());
	}
	
	public double getCircumference() {
		return Math.PI * (getRadius() * 2);
	}
}
