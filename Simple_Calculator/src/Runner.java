
public class Runner {
	
	public static void main(String[] args)
	{
		System.out.println("Welcome to your simple calculator!");
		Calculator test = new Calculator();
		test.add(8, 4);	
		test.sub(8, 4);
		test.mul(8, 4);
		test.div(8, 4);
		test.adddouble(5.0, 6.0);
		test.subdouble(5.0, 6.0);
		test.muldouble(5.0, 6.0);
		test.divdouble(5.0, 6.0);
		test.exponent(3.0, 3);
		test.negexponent(2.0, 2);
		test.sumrange(5, 9);
		test.sumrangeincrement(4, 10, 2);
		double[] array = {2,4,6,8,10,12};
		test.averagearray(array);
		int[] arr = {2,4,6,8,10,12};
		test.max(arr);
		test.min(arr);
		test.abs(-5);
		test.factorial(5);
		test.ncr(6, 4);
		test.npr(6, 4);
	}
}
