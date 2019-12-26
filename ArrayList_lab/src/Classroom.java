import java.io.FileReader;
import java.util.ArrayList;

import java.io.IOException;

public class Classroom {

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
		String[][] A = new String[10][3];
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

	public static ArrayList<Student> Biased_Sorting(ArrayList<Student> students)
	{
		ArrayList<Student> biasedlist = new ArrayList<Student>();
		int count = 0;
		for (int i = 0; i < students.size(); i++)
		{
			if (students.get(i).flavor.equals(" Vanilla"))
			{
				Student bias = students.get(i);
				biasedlist.add(count, bias);
				count++;
			}
		}
		for (int i = 0; i < students.size(); i++)
		{
			if (students.get(i).flavor.equals(" Strawberry"))
			{
				Student bias = students.get(i);
				biasedlist.add(count, bias);
				count++;
			}
		}
		for (int i = 0; i < students.size(); i++)
		{
			if (students.get(i).flavor.equals(" Chocolate"))
			{
				Student bias = students.get(i);
				biasedlist.add(count, bias);
				count++;
			}
		}
		return biasedlist;
	}

	public static ArrayList<Student> Extra_Biased_Sorting(ArrayList<Student> students)
	{
		int index = 0;
		String low = students.get(0).name;
		for (int i = 0; i < students.size(); i++) 
		{ 
			if (students.get(i).flavor.equals(" Vanilla"))
			{
				if (students.get(i).name.length() < low.length()) 
				{
					low = students.get(i).name;
				}
			}
		}
		for (int i = 0; i < students.size(); i++) 
		{
			if (students.get(i).name == low)
			{
				index = i;
			}
		}
		students.add(0, students.get(index));
		students.remove(index + 1);
		return students;
	}

	public static void main(String[] args) throws IOException
	{
		FileReader fr = new FileReader("Student_Info_Arraylist");
		char[] file = new char[1000];

		// reads the file: Student_Info.txt and stores it into a character array
		fr.read(file);

		// Creates a String from the character array
		String out = new String(file);
		// prints stuff from file
		System.out.println(out);

		//One Dimensional array
		String[] split = splitter(out);
		for (int i = 0; i < split.length; i++)
		{
			System.out.println(split[i]);
		}
		System.out.println();

		//2d array
		String[][] A = two_dimensional(split);
		for (int row = 0; row < A.length; row++)
		{
			for (int col = 0; col < A[0].length; col++)
			{
				System.out.print(A[row][col] + "\t");
			}	
			System.out.println();
		}	
		ArrayList<Student> info = new ArrayList<Student>();
		for (int i = 0; i < A.length; i++)
		{
			info.add(new Student(A[i][0], A[i][1], A[i][2]));
		}

		System.out.println();
		System.out.println("Task 3\n");

		ArrayList<Student> biasedlist = Biased_Sorting(info);

		for (Student content : biasedlist)
		{
			System.out.print(content.name);	
			System.out.print(content.age);		
			System.out.print(content.flavor);	
			System.out.println();
		}

		System.out.println();
		System.out.println("Task 4\n");

		ArrayList<Student> extrabiasedlist = Extra_Biased_Sorting(biasedlist);

		for (Student content : extrabiasedlist)
		{
			System.out.print(content.name);	
			System.out.print(content.age);		
			System.out.print(content.flavor);	
			System.out.println();
		}


	}

}
