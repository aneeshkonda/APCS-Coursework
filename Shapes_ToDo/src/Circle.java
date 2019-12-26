
public class Circle extends Shape
{
	double radius;
	
	Circle(double radius)
	{
		this.radius = radius;
	}

	public double area()
	{
		double area = (Math.PI*(this.radius*this.radius));
		return area;
	}
	
	public double perimeter()
	{
		double perimeter = (2*this.radius*Math.PI);
		return perimeter;
	}
	
}
