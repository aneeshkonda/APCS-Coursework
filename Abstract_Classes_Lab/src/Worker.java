
public abstract class Worker {
	public String Name;
	public String Job_Title;
	public int Salary;
	public static int worker_count = 0;
	public static double company_bank_total = 10000000;
	
	Worker ()
	{
		worker_count++;
	}

	abstract public int getSalary();
	abstract public void setSalary(int pay);
	abstract public void payWorker(Worker authorizer, Worker employee);
	
}
