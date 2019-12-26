
public class MergeSortlab {

	public static void printArray (int[] array)
	{
		//to make printing easier
		for(int i: array)
		{
			System.out.println(i + " ");
		}
		System.out.println();
	}
	
	public static void MergeSort(int[] array, int left, int right)
	{
		
		int mid = (right + left)/ 2;
		
		if(right - left > 0)
		{
			//left half
			System.out.println("MergeSort(arr," + left+ "," + right + ");");
			MergeSort(array,left,mid);
			
			//right half
			System.out.println("MergeSort(arr," + left+ "," + right + ");");
			MergeSort(array,mid+1,right);
			
			//Merge everything together
			System.out.println("Merge(arr," + left+ "," + mid + "," + right + ");");
			Merge(array,left,mid,right);
			printArray(array);
		}
			
	}
	
	public static void Merge(int[] arr, int left, int mid, int high)
	{
		//create 2 arrays
		int[] arr1 = new int[mid - left + 1];
		int[] arr2 = new int[high - mid];
		
		//populate arrays
		int index = 0;
		for(int i = left; i <= mid; i++)
		{
			arr1[index] = arr[i];
			index++;
		}
		index = 0;
		for(int i = mid + 1; i <= high; i++)
		{
			arr2[index] = arr[i];
			index++;
		}
		//sort between arrays
		int j = 0;
		int x = 0;
		
		for(int i = left; i <= high; i++)
		{
			if(j >= arr1.length)
			{
				arr[i] = arr2[x];
				x++;
			}
			else if(x >= arr2.length)
			{
				arr[i] = arr1[j];
				j++;
			}
			else if(arr1[j] < arr2[x])
			{
				arr[i] = arr1[j];
				j++;
			}
			else 
			{
				arr[i] = arr2[x];
				x++;
			}
		}
	}
	
	
	
	
	
	
	
	
}
