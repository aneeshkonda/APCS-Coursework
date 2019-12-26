
public class Algorithims {

	public static void main(String args[])
	{
		int [] arr = {4, -2, -6, 5, -2, 7, -2, -6, 6, -3};
		int [] arr1 = {3, -2, -4, 3, 5, 10, 3, -4, 2, 5};
		int [] arr2 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
		int [] arr3 = {-1, 10, -2, 9, -3, 8, -4, 7, -5, 6};


		//arr = bubblesort(arr);
		//arr = selectionsort(arr);
		arr = insertionsort(arr);

		//arr1 = bubblesort(arr1);
		//arr1 = selectionsort(arr1);
		//arr1 = insertionsort(arr1);

		//arr2 = bubblesort(arr2);
		//arr2 = selectionsort(arr2);
		//arr2 = insertionsort(arr2);

		//arr3 = bubblesort(arr3);
		//arr3 = selectionsort(arr3);
		//arr3 = insertionsort(arr3);


	}

	public static int[] swap(int[] arr, int i, int j)
	{	
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		return arr;
	}

	public static int[] bubblesort(int[] arr)
	{	
		int swapcount = 0;
		int ifcount = 0;
		int n = arr.length;
		for (int i = 0; i < n - 1; i++)
		{
			for (int j = 0; j < n - i - 1; j++)
			{
				if (arr[j] > arr[j+1])
				{
					swap(arr, j, j+1);
					swapcount++;
				}
				ifcount++;
			}
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

		}
		for (int i1 = 0; i1 < arr.length; i1++)
		{
			System.out.print(arr[i1] + "\t");
		}
		System.out.println();
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
				while (arr[stored] < arr[j])
				{
					swap(arr, stored, j); 
				}
				swapcount++;
				ifcount++;
				stored--;
			}
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
}



