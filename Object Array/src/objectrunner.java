
public class objectrunner
{
	// All methods you will return void
	static void find_Shortest(Students[] arr)
	{
		int minimum = Integer.MAX_VALUE; //999999
		for (int i = 0; i < arr.length; i++)
		{
			if(minimum > arr[i].getheight())
				minimum = arr[i].getheight();
			
		}
		Students ID = new Students();
		System.out.println("Student " + ID.getID() + " is " + minimum + " inches and is the shortest.");

		
		// Tell me which student (by ID) is the shortest
		// ex: Student 14 is 60 inches and is the shortest.
	}
	
	static void find_Tallest(Students[] arr)
	{
		int maximum = 0;
		for (int i = 0; i < arr.length; i++)
		{
			if(maximum < arr[i].getheight())
				maximum = arr[i].getheight();
			
		}
		Students ID = new Students();
		System.out.println("Student " + ID.getID() + " is " + maximum + " inches and is the tallest.");

		
		// Tell me which student (by ID) is the shortest
		// ex: Student 14 is 60 inches and is the shortest.
	}
	
	static void swap_location(Students [] arr, int first_position, int second_position)
	{
		Students temp = arr[first_position];
		arr[first_position] = arr[second_position];
		arr[second_position] = temp;
	}
	
	static Students [] place_in_front(Students [] arr)
	{
		Students [] newarray = new Students[arr.length + 1];
		for (int i = 0; i < arr.length; i++)
		{
			newarray[i] = arr[i];
		}
		for (int i = arr.length; i >= 1; i--)
		{
			swap_location(newarray, i, i-1);
		}
		Students other_height = new Students();
		newarray[0] = other_height;
		return newarray;
	}
	
	public static void main(String[] args)
	{
		// Create an array of 10 Students
		Students [] arr = new Students[10];
		for (int i = 0; i < arr.length; i++)
		{
			arr[i] = new Students();
			System.out.println(arr[i].getheight());
		}
		find_Shortest(arr);
		find_Tallest(arr);
		place_in_front(arr);
		
		
		
		// Call Methods for the array and test to make sure it works
		//find_Shortest(    )
		
		
		
		
	}
}
