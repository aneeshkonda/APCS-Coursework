package binary_search;

public class binary {

	static int binsearch(int[] array, int num) 
	{
		return otherbinsearch(array, num, 0, array.length - 1);
	}

	static int otherbinsearch(int[] array, int num, int low, int high) {

		for (int i = low; i <= high; i++)
		{
			System.out.print(array[i] + " ");
		}
		System.out.println();

		int mid = (low + high) / 2;

		if (num == array[mid]) 
		{
			return mid;
		} 
		if (low > high) 
		{
			return -1;
		} 
		if (num > array[mid])
		{
			//System.out.print(mid + "\t");
			low = mid + 1;
			return otherbinsearch(array, num, low, high);
		}
		if (num < array[mid]) 
		{
			//System.out.print(mid + "\t");
			high = mid - 1;
			return otherbinsearch(array, num, low, high);
		}
		return -1;


	}

	public static void main(String[] args) {
		int[] array = { 1, 4, 7, 9, 10, 14, 16, 18, 20, 21, 24, 26, 29, 30, 31, 37 };

		binsearch(array, 7);
		System.out.println();
		
		binsearch(array, 16);
		System.out.println();

		binsearch(array, 30);
		System.out.println();

		binsearch(array, 31);
		System.out.println();

		binsearch(array, 0);
		System.out.println();

		binsearch(array, 19);
		System.out.println();




	}

}
