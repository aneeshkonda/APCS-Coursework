import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ArrayRunner
{
	public static String[] splitter (String word) //task 1
	{
		int blank = 0;
		int count = 0;
		int thelength = 0;
		for (int i = 0; i < word.length(); i++)
		{
			if(word.charAt(i) == ' ' || word.charAt(i) == '\n')
			{
				thelength++;
			}
		}
		String[] split = new String[thelength + 1];
		for (int i = 0; i < word.length(); i++)
		{
			if(word.charAt(i) == ' ' || word.charAt(i) == '\n')
			{
				String new_word = word.substring(blank, i);
				blank = i;
				split[count] = new_word;
				count++;
			}
			else
			{
				String new_word = word.substring(blank, word.length());
				split[count] = new_word;
			}
		}
		return split;
	}

	public static String[][] two_dimensional (String[] array) 
	{
		String[][] A = new String[3][3];
		int count = 0;
		for (int row = 0; row < A.length; row++)
		{
			for (int col = 0; col < A[0].length; col++)
			{
				A[row][col] = array[count];
				count++;
			}	
		}
		return A;
	}

	public static void main(String[] args) throws IOException
	{
		//		String[] split = splitter("CS is hard "); 				//printing task 1 to check if it works
		//				for (int i = 0; i < split.length; i++)
		//				{
		//						System.out.print(split[i]);
		//				}	

		//		int[][] matrix = new int[7][9];									//task 2
		//		for (int row = 0; row < matrix.length; row++)
		//		{
		//			for (int col = 0; col < matrix[0].length; col++)
		//			{
		//				if (row == 0)
		//				{
		//					matrix[row][col] = col;
		//				}
		//				else if (col == 0)
		//				{
		//					matrix[row][col] = row;
		//				}
		//				else
		//				{
		//					matrix[row][col] = row * col;
		//				}
		//			}	
		//		}
		//		for (int row = 0; row < matrix.length; row++)				//printing task 2 to check if it works
		//		{
		//			for (int col = 0; col < matrix[0].length; col++)
		//			{
		//				System.out.print(matrix[row][col] + "\t");
		//			}	
		//			System.out.println();
		//		}	


		FileReader fr = new FileReader("Student_Info.txt");
		char[] file = new char[100];

		// reads the file: Student_Info.txt and stores it into a character array
		fr.read(file);

		// Creates a String from the character array
		String out = new String(file);
		// prints stuff from file
		System.out.println(out);
		String [] split = splitter(out);
		for (int i = 0; i < split.length; i++)
		{
			System.out.println(split[i]);
		}
		String[][] A = two_dimensional(split);
		for (int row = 0; row < A.length; row++)
		{
			for (int col = 0; col < A[0].length; col++)
			{
				System.out.print(A[row][col] + "\t");
			}	
			System.out.println();
		}	

	}

}
