
public class Triangle extends Shape
{
	double base;
	double height;
	double side1;
	double side2;
	
	Triangle(double base, double height, double side1, double side2)
	{
		this.base = base;
		this.height = height;
		this.side1 = side1;
		this.side2 = side2;
	}
	
	public double area()
	{
		double area = (0.5*this.base*this.height);
		return area;
	}
	
	public double perimeter()
	{
		double perimeter = (this.side1+this.side2+this.base);
		return perimeter;
	}
	
}
