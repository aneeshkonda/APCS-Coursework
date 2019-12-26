
public class Student {

	String name;
	String age;
	String flavor;

	Student(String name, String age, String flavor)
	{
		this.name = name;
		this.age = age;
		this.flavor = flavor;
	}

	public static void main(String args[])
	{
		Student BOB = new Student("Bob", "14", "Rocky Road");
	}
}
