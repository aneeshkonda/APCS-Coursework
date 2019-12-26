
public class Square extends Shape
{
	double side;
	
	Square(double side)
	{
		this.side = side;
	}
	
	public double area()
	{
		double area = (this.side*this.side);
		return area;
	}
	
	public double perimeter()
	{
		double perimeter = (this.side*4);
		return perimeter;
	}
	
}
