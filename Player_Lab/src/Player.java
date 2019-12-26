
public class Player		//Names we might use to refer to Player: Player, Player.java, class file, Player class
{
	// Class variables should ALWAYS be declared at the top
	String name;	// A String is simply just a word
	int age;		// age is automatically set to 0 because it is an integer
	double roll;	// double (in coding) is the equivalent of saying a decimal number (in math)
	private int counter;	// This is a private variable that cannot be accessed outside this class file.
							// counter is number of times the Player wins the die roll
	// Normal Constructor
	Player()	// Constructor MUST have the same name as the class file!
	{			// There is no public, private, static, int, double... Nothing. That is how we write constructors
		name = "BOT";
		counter = 0;	// Redundant 
	}
	
	// Overloaded Constructor that takes 3 arguments
	Player(String name, int age, double rolled)		// We might also say that this constructor passes in 3 arguments
	{	// You cannot write name = name since it would be the equivalent of setting the same name to itself. It would be redundant.
		this.name = name;	// this.name refers to the Player's variable called name (which is of type: String)
		this.age = age;		// age refers to the 2nd argument taken in from the Constructor.
		roll = rolled;		// roll does not need to use "this." because there is no confusion which variable to refer to.
	}
	
	// Overloaded Constructor that takes 2 arguments
	Player(String name, int age)
	{
		this.name = name;
		this.age = age;
		roll();				// This calls the method roll() so that the variable roll has a value.
	}
	
	// This method needs simulates a die roll.
	public void roll()	// this method name does not conflict with the variable name called roll.
	{
		// Math.random() return any decimal number greater than or equal to 0.0 and less than 1.0  
		roll = (int)(6*Math.random()) + 1; 	// Variable is already defined at the beginning of the class, before the constructors.
		// Let us consider what the range of what possible numbers this can be. 
	}
	
	public int get_counter()	// In this class, I have often referred to this as the "getter" since it GETS the counter.
	{							// Online, you may hear of this method referred to as an "accessor" since it ACCESSES the counter variable.
		return counter;			// This variable is private, therefore, it can be accessed ONLY inside this class file.
	}							
	
	// Private means that it can ONLY be accessed within the class file, and NOT from any instances of the Player class (more on this later).
	private boolean play_against(Player P2)		// This means that the player in this class can play against another Player that is passed in as an argument
	{	//  boolean returns true or false
		if ( this.roll > P2.roll )		// this Player wins when the roll is greater than the other P2's roll
		{
			this.counter++;
			return true;				// We are equating winning with returning true
		}
		else 							// think about when this Player might lose
		{
			P2.counter++;				// Since P2 is inside the Player class file, the private variable is accessible.
			return false;				// losing = returning false
		}
	}
	
	// Look closely at the method names
	boolean PLAY_against(Player P2)		// even when public is NOT written in front of the method, the compiler knows that that the method is public
	{
		return play_against(P2);		// The method play_against is called and returns true or false depending on who wins.
	}
}
