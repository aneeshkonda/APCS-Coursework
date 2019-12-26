
public class Student {

	private String name;
	private int age;
	private String flavor;

	Student(String name, int age, String flavor)
	{
		this.name = name;
		this.age = age;
		this.flavor = flavor;
	}

	public static void main(String args[])
	{
		Student BOB = new Student("Bob", 14, "Rocky Road");
	}
}
