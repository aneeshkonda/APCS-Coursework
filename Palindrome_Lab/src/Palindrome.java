import java.util.Scanner;

public class Palindrome {
	
	public static boolean checkPalindrome(char[] arr)
	{
		char[] temp = new char[arr.length];
		int length = arr.length-1;
		for (int i = 0; i < arr.length; i++)
		{
			temp[length] = arr[i];
			length-=1;
		}
		int count = 0;
		for (int i = 0; i < arr.length; i++)
		{
			if (temp[i] == arr[i])
			{
				count++;
				if(count == arr.length - 1)
				{
					return true;
				}
			}
			else
			{
				return false;
			}
		}
		return true;
	}
	
	public static void main(String args[])
	{
		char[] racecar = {'r', 'a', 'c', 'e', 'c', 'a', 'r'};
		char[] ace = {'a', 'c', 'e'};
		checkPalindrome(racecar);
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your word:");
		String word = scan.next();
		char[] racearray = word.toCharArray();
		if (checkPalindrome(racearray) == false)
		{
			for (int i = 0; i > -1; i++)
			{
				System.out.println("That is not a palindrome word. Try again.\n");
				System.out.print("Enter your word:");
				word = scan.next();
				racearray = word.toCharArray();
				if (checkPalindrome(racearray) == true)
				{
					break;
				}
			}
		}
		System.out.println("That is a palindrome word.");
		char[] doublearray = new char[racearray.length * 2];
		for (int i = 0; i < racearray.length; i++)
		{
			doublearray[i] = racearray[i];
		}
		int length = racearray.length-1;
		for (int i = racearray.length ; i < doublearray.length; i++)
		{
			doublearray[i] = racearray[length];
			length -= 1;
		}
		String double_word = new String(doublearray);
		if(checkPalindrome(doublearray) == true)
		{
			System.out.println("Your new word," + double_word + ", is also a palindrome.");
			System.out.println("Congrats, this lab is done correctly.");
		}
	}

}
