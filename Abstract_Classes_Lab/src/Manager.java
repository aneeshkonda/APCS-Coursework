import java.util.ArrayList;

public class Manager extends Worker {
	private ArrayList <Employee> subordinates;

	Manager(String Name)
	{
		Job_Title = Name;
		setSalary(150000);
	}

	void add(Employee e)
	{
		subordinates.add(e);
	}

	public Employee Remove()
	{
		return subordinates.remove(0);
	}

	public Manager Promote(Employee e)
	{
		worker_count--;
		Manager promoted = new Manager(e.Name);
		return promoted;
	}

	public void payWorker(Worker authorizer, Worker employee) 
	{

	}


	public void pay()
	{
		int count = 0;
		for(Employee employee: subordinates)
		{
			count++;
			payWorker(this, employee);
		}
		payWorker(this,this);
	}

	public int getSalary() 
	{
		return Salary;
	}

	public void setSalary(int pay) 
	{

	}

}
