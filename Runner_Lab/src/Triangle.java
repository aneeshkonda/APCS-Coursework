
import java.util.Scanner;

public class Triangle {
	private double base; 
	private double height;
	private double area = base * height * .5;
	private double a; 
	private double c;
	
	public Triangle() {
		
	}
	
	public Triangle(double base, double height) {
		Scanner read = new Scanner(System.in);
		System.out.println("I need more information. Please give me two other side lengths: a and c.");
		System.out.print("a = ");
		a = read.nextDouble();
		System.out.println("Side length 'a' changed to: " + a);
		System.out.print("c = ");
		c = read.nextDouble();
		System.out.println("Side length 'c' changed to: " + c);
		this.base = base;
		this.height = height;
	}
	
	public void print() {
			System.out.println("This Triangle has a base of " + getBase() + " and a height of " + getHeight() + ".");
			System.out.println("The area of the triangle is: " + getArea());
			System.out.println("The perimeter of the triangle is: " + getPerimeter());
	}
	
	public void setBase(double base) {
		this.base = base;
		System.out.println("The base was changed to: " + base);
		Scanner read = new Scanner(System.in);
		System.out.println("I need more information. Please give me two other side lengths: a and c.");
		System.out.print("a = ");
		a = read.nextDouble();
		System.out.println("Side length a changed to: " + a);
		System.out.print("c = ");
		c = read.nextDouble();
		System.out.println("Side length c changed to: " + c);
		this.base = base;
		this.height = height;
	}
	
	public void setHeight(double height) {
		this.height = height;
		System.out.println("The height was changed to: " + height);
	}
	
	public double getBase() {
		return this.base;
	}
	
	public double getHeight() {
		return this.height;
	}
	
	public double getArea() {
		return getBase() * getHeight() * .5;
	}
	
	public double getPerimeter() {
		return a + getBase() + c;
	}
	
	
	
}
