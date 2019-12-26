
public class Students
{
	private int ID;		// 2 digit
	private int height; 	// in inches
	private int minimum = 999999999;
	
	Students()
	{
		// Recall that Math.random() returns 0 to 1 inclusive
		this.height = 60 + (int)(12*Math.random()); 	// Students between 60 and 71 inches tall
	
		this.ID = (int)(Math.pow(10, 2)*Math.random());	// ID Number random from 0 to 100

	}
	
	public void set_height (int height) {
		this.height = height;
	}
	
	public void set_ID (int ID) {
		this.ID = ID;
	}
	
	public int getheight() {
		return this.height;
	}
	
	public int getID() {
		return this.ID;
	}
	
	public int getminimum() {
		return this.minimum;
	}
	
	public int min(int[] arr)
	{
		int minimum = Integer.MAX_VALUE; //999999
		for (int i = 0; i < arr.length; i++)
		{
			if(minimum > arr[i])
				minimum = arr[i];
			
		}
		return minimum;
	}
}
