// In this course, I will often refer to this as the Runner class
public class Name_Does_Not_Matter {			// The name of this file is not that important.
	
	// Unless it is a class file, you need to have a main in order to run.
	public static void main(String[] args)
	{
		// Let's make a simple game in which two players roll the die to see who wins more often.
		
		// We need to first create two Players.
		// Let's place them into a Player array. We don't necessarily need it, but you need to know how to create Object Arrays.
		
		// Player[] is an Object Array (or in this case, a Player Array) that contains Objects of type Player.
		Player[] game = new Player[2];		// This creates a Player array with spots for two 2 Players.
		
		Player P1 = new Player();			// The Player() constructor is called from the Player Class.
		game[0] = P1;						// This sets the first player into the 0th position.
		
		// I will refer to this player (below) as P2.
		game[1] = new Player("Real_Player", 17);	// This creates a new Player and places it into the 1st position.
		
		
		// The game is simple in nature, but we have to make sure we can follow the code.
		// The game pitches two players rolling a six sided die to see who gets a higher number more times.
		
		
		// Let's play TEN games between P1 and P2.
		// But let's first play one game to determine who goes first.
		boolean first = P1.PLAY_against(game[1]);		// the method called play_against is a private method
		
		// Now we can play the game 10 times in total (first time was to decide who goes first)
		for ( int i = 1; i < 10; i++ )
		{
			if (first)		// This is equivalent to: if (first == true) 
			{
				// the result of playing this game gets stored into first.
				first = P1.PLAY_against(game[1]);	// We can reuse variables to accomplish a task.
			}
			else			// ONLY satisfied when first = false and it did not pass the first if statement. 	
			{
				first = game[1].PLAY_against(game[0]);
			}
		} 
		
		// Compares who won more die rolls
		if ( P1.get_counter() > game[1].get_counter() )
		{
			System.out.println(P1.name + " won the game.");
		}
		else	// P2 wins
		{
			System.out.println(game[1].name + " won the game.");
		}
		
		
	
	}

}
