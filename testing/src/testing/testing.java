package testing;

public class testing {


	public static void main(String args[])
	{
		int [] arr = {3, 2, 1, 4};
		int [] arr1 = {5, 2, 3, 6};


	}

	public static int[] swap(int[] arr, int i, int j)
	{	
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		return arr;
	}

	public static int[] fastsort(int[] arr, int[] arr1)
	{			
		int [] arr2 = new int[arr.length + arr1.length];
		for (int i = 0; i < arr.length; i++)
		{
				if (arr[i] < arr1[i])
				{
					arr2[i] = arr[i];
				}
		}
		return arr;
	}

	
	
	
	
	
	
	public static int[] selectionsort(int[] arr)
	{	
		int swapcount = 0;
		int ifcount = 0;
		int n = arr.length;
		int min;
		for (int i = 0; i < n-1; i++)
		{
			min = i;
			for (int j = i; j < n; j++)
			{
				if (arr[j] < arr[min])
				{
					min = j;
					ifcount++;
				}
			}
			swap(arr, i, min);
			swapcount++;

			for (int i1 = 0; i1 < arr.length; i1++)
			{
				System.out.print(arr[i1] + "\t");
			}
			System.out.println();

		}
		System.out.println("The number of swaps was " + swapcount);
		System.out.println("The number of if calls was " + ifcount);
		return arr;
	}

	public static int[] insertionsort(int[] arr)
	{	
		int swapcount = 0;
		int ifcount = 0;
		int n = arr.length;
		for (int i = 1; i < n; i++)
		{
			int stored = i;
			for (int j = i-1; j >= 0; j--)
			{
				if (arr[stored] < arr[j])
				{
					while (arr[stored] < arr[j])
					{
						swap(arr, stored, j); 
					}
					swapcount++;
					ifcount++;
				} 
				for (int i1 = 0; i1 < arr.length; i1++)
				{
					System.out.print(arr[i1] + "\t");
				}
				System.out.println();
				stored--;
			}
		}

		System.out.println("The number of swaps was " + swapcount);
		System.out.println("The number of if calls was " + ifcount);
		return arr;
	}
}
