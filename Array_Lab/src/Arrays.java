import java.util.Scanner;

public class Arrays
{



	static int[] Example_1()
	{
		System.out.println("Example 1:");
		int[] arr = new int[5];
				
		// Fill the array with multiples of 3 within the given size. --> 3,6,9,12,15 
		for (int i = 0; i < arr.length; i++)
		{
			arr[i] = (i+1) * 3;
			if (arr[i] < 15)
			{
				System.out.print(arr[i] + ",");
			}
			else 
			{
				System.out.println(arr[i]);
			}
		}
		
		return arr;
	}
	
	static void Example_2()
	{
		System.out.println("Example 2:");
		int[] array = {2,4,6,8,10,12};
		
		int[] array2 = new int[array.length];
		
		// Populate values for array2 with the square of each element.
		for(int i = 0; i < array.length; i++)
		{
			array2[i] = array[i] * array[i];
			if (array2[i] < 144)
			{
				System.out.print(array2[i] + ",");
			}
			else 
			{
				System.out.println(array2[i]);
			}
		}
		
		
	}
	
	static int[] Example_3(int[] temp, int max)
	{
		System.out.println("Example 3:");
		// We need to make a new array that can hold more values.
		// null is a temporary pointer (a.k.a. I have an empty array). CHANGE IT!
		temp = new int[ max/3 ];
		
		
		// Write code that will populate a new array of the correct size that can contains multiples up to max.
		for (int i = 0; i < temp.length; i++)
		{
			temp[i] = (i+1) * 3;
			if(i != temp.length-1) {
				System.out.print(temp[i]+", ");
			}
			else {
				System.out.println(temp[i]);
			}
		}
		return temp;
	}
	
	static void Example_4()
	{
		System.out.println("Example 4:");
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number greater than 2:");
		int n = input.nextInt();
		// Generate the n terms of Fibonacci's Sequence.
		int[] array = new int[n];
		array[0] = 0;
		array[1] = 1;
		System.out.println(array[0]);
		System.out.println(array[1]);
		for(int i = 2; i < n; i++) {
			array[i] = array[i-1] + array[i-2];
			System.out.println(array[i]);
		}
	}
	
	static int min(int[] arr)
	{
		int minimum = Integer.MAX_VALUE; //999999
		for (int i = 0; i < arr.length; i++)
		{
			if(minimum > arr[i])
				minimum = arr[i];
			
		}
		return minimum;
	}

	static int max(int[] arr)
	{
		int maximum = 0;
		for (int i = 0; i < arr.length; i++)
		{
			if(maximum < arr[i])
				maximum = arr[i];
			
		}
		return maximum;
	}
	
	static int count_dupes(int[] arr, int num)
	{
		int count = 0;
		for (int i = 0; i < arr.length; i++)
		{
			if(num == arr[i])
				count++;
			
		}
		return count;
	}
	
	static void Your_Own_Code()
	{
		// Write new methods min, max, and count_dupes.
		
		// 1. min passes in an array and returns the minimum of the array.
		
		// 2. max passes in an array and returns the maximum of the array.
		
		/* 3. count_dupes passes in an array and a specific number.
		 * 	  Then it counts all the duplicates of that specific number within the array and returns that value.
		 */
		
		
		//  After writing your code, to test, uncomment this section as needed.
		
		 	int[] rand_array = new int[10];
		 	for (int i = 0; i < rand_array.length; i++)
		 	{
		 		rand_array[i] = (int)(3*Math.random());
		 		System.out.print(rand_array[i] + " ");
		 	}
		 	System.out.println();
		 	
		 	System.out.println("The minimum in this array is: " + min(rand_array));
		 	System.out.println("The maximum in this array is: " + max(rand_array));
		 	System.out.println("This array has " + count_dupes(rand_array, 1) + " number of 1's in the array.");
		 
	}

	public static void main(String[] args) 
	{		
		int[] numbers = Example_1();
		Example_2();	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter any number bigger than 15");
		
		int highest = input.nextInt(); 
		
		int[] new_array = null;
		
		new_array = Example_3(numbers, highest);
	    //To test whether your array is correct, you should print out all the values in the array.
		
		
		
		Example_4();
		
		Your_Own_Code();
	}
	
}
