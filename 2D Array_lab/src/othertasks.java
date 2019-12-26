public class othertasks {

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
		}
		String new_word = word.substring(blank, split.length);
		split[count] = new_word;
		return split;
	}

	public static void main(String[] args) 
	{
		String[] split = splitter("CS is hard ");
		for (int i = 0; i < split.length; i++)
		{
			System.out.print(split[i]);
		}	

		//		int[][] matrix = new int[7][9];
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
		//		for (int row = 0; row < matrix.length; row++)
		//		{
		//			for (int col = 0; col < matrix[0].length; col++)
		//			{
		//				System.out.print(matrix[row][col] + "\t");
		//			}	
		//			System.out.println();
		//		}
		//		


	}





}
