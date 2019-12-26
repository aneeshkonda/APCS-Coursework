
public class Employee extends Worker {

	Employee(String Name, String Title)
	{
		Job_Title = Title;
		this.Name = Name;
		Salary = 80000;
	}

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int pay) {
		Salary = pay;
	}

	public void payWorker(Worker authorizer, Worker employee) {
		if (authorizer.Job_Title.equals("Manager"))
		{
			company_bank_total -= employee.Salary;

		}
	}
}
