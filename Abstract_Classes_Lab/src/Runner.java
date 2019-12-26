
import java.util.ArrayList;

public class Runner {

	public static void main(String[] Args)
	{
		Manager manager1 = new Manager("wu");
		Manager manager2 = new Manager("bob");

		ArrayList<Employee> employees1 = new ArrayList<Employee>();
		ArrayList<Employee> employees2 = new ArrayList<Employee>();

		for(int i = 0; i < 10; i++)
		{
			Employee employee1 = new Employee("A","Employee");
			Employee employee2 = new Employee("F","Employee");
			employees1.add(employee1);
			employees2.add(employee2);
		}
		for(int i = 0 ; i < employees1.size(); i++)
		{
			manager1.add(employees1.get(i));
			manager2.add(employees2.get(i));
		}

		System.out.println("There are: " + manager1.worker_count + " employees working");

		manager1.pay();
		manager2.pay();

		manager1.worker_count--;
		for(Employee employee2: employees2)
		{
			manager1.add(employee2);
		}

		manager1.pay();
		System.out.println("The total_bank_acc is now: " + manager1.company_bank_total);
		System.out.println("There are now: " + manager1.worker_count + " workers");


		Manager promoted1 = manager1.Promote(manager1.Remove());
		Manager promoted2 = manager1.Promote(manager1.Remove());

		int numOfEmployees = (Manager.worker_count - 3)/3;
		for(int i = 0; i < numOfEmployees; i ++)
		{
			promoted1.add(manager1.Remove());
			promoted2.add(manager1.Remove());
		}

		manager1.pay();
		promoted1.pay();
		promoted2.pay();
		System.out.print("The company_bank_total is now: " + manager1.company_bank_total);
	}



}
