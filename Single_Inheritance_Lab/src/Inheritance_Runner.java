/*
 * This lab will be used for mutliple inheritance
 * A --> B --> C
 * C inherits from B and B inherits from A
 * 
 * This lab requires the students to have learned about:
 * 		Classes
 * 		Overloaded Constructors
 * 		Runner
 * 		Methods
 * 		up/down casting				applying this to Classes
 * 		this()						learning or have learned
 * 		super()						learning or have learned
 * 		
 */
public class Inheritance_Runner
{
	public static void main(String[] args)
	{
		System.out.println("Rectangle box = new Rectangle(2.5, 2);");
		Rectangle box = new Rectangle(2.5, 2);
		
		System.out.println();
		
		System.out.println("Square square_box = new Square(1.5);");
		Square square_box = new Square(1.5);

		System.out.println();
		
		System.out.println("Rectangle rect_box = new Square(4);");
		//Because Rectangle is the super class of a Square, rect_sq automatically upcasts.  
		Rectangle rect_box = new Square(4);		// similar to how double x = 4 would automatically upcast 4 to 4.0
		
		System.out.println();

		System.out.println("Rectangle rect_box2 = (Rectangle) (new Square(4));");
		// This is a redundant typecast
		Rectangle rect_box2 = (Rectangle) (new Square(4));

	}

}
