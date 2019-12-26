import java.util.Scanner;

public class Calculator {

	public Calculator() {
		
	}
	
	public void add(int x, int y) {
		System.out.println(x + y);
	}
	
	public void sub(int x, int y) {
		System.out.println(x - y);
	}
	
	public void mul(int x, int y) {
		System.out.println(x * y);
	}
	
	public void div(int x, int y) {
		if (y == 0) {
			System.out.println("UNDEFINED!");
		}
		else {
			System.out.println(x/y);
		}
	}
	
	public void adddouble(double x, double y) {
		System.out.println(x + y);
	}
	
	public void subdouble(double x, double y) {
		System.out.println(x - y);
	}
	
	public void muldouble(double x, double y) {
		System.out.println(x * y);
	}
	
	public void divdouble(double x, double y) {
		if (y == 0) {
			System.out.println("UNDEFINED!");
		}
		else {
			System.out.println(x/y);
		}
	}
	
	public void exponent(double x, int y) {
		double orig = x;
		for (int i = y; i>1; i--) {
			x = (orig*x);
		}
		System.out.println(x);
	}
	
	public void negexponent(double x, int y) {
		double orig = x;
		for (int i = y; i>1; i--) {
			x = (orig*x);
		}
		System.out.println(1/x);
	}
	
	public void sumrange(int x, int y) {
		int total = 0;
		for (int i = y; i>=x; i--) {
			total += i;
		}
		System.out.println(total);
	}

	public void sumrangeincrement(int x, int y, int z) {
		int total = x;
		while (x!=y) {
			x += z;
			total += x;
		}
		System.out.println(total);
	}

	public void averagearray(double[] arr) {
		double total = 0;
		for (int i = 0; i < arr.length; i++)
		{
			total += arr[i];
		}
		System.out.println(total/arr.length);
	}
	
	public void max(int[] arr)
	{
		int maximum = 0;
		for (int i = 0; i < arr.length; i++)
		{
			if(maximum < arr[i])
				maximum = arr[i];
			
		}
		System.out.println(maximum);
	}
	
	public void min(int[] arr)
	{
		int minimum = Integer.MAX_VALUE; //999999
		for (int i = 0; i < arr.length; i++)
		{
			if(minimum > arr[i])
				minimum = arr[i];
			
		}
		System.out.println(minimum);
	}
	
	public void abs(int x)
	{
		if (x < 0)
		{
			x = -x;
			System.out.println(x);
		}
		else 
		{
			System.out.println(x);
		}
	}
	
	public void factorial(int x)
	{
		int total = 1;
		for(int i = 2; i <= x; i++)
		{
			total *= i;
		}
		System.out.println(total);
	}
	
	public int other_factorial(int x)
	{
		int total = 1;
		for(int i = 2; i <= x; i++)
		{
			total *= i;
		}
		return total;
	}
	
	public void ncr(int x, int y)
	{
		int xfactorial = other_factorial(x);
		int yfactorial = other_factorial(y);
		int xminusyfactorial = other_factorial(x-y);
		System.out.println(xfactorial/(yfactorial * (xminusyfactorial)));
	}
	
	public void npr(int x, int y)
	{
		int xfactorial = other_factorial(x);
		int xminusyfactorial = other_factorial(x-y);
		System.out.println(xfactorial/xminusyfactorial);
	}

}
