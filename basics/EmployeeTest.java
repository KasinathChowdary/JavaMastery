class Employee
{
	int id;
	String name;
	double salary;
	Employee(int id, String name, double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	void update(double salary)
	{
		this.salary=salary;
	}
	void display()
	{
		System.out.println("Id="+id+" Name="+name+" salary="+salary);
	}
}
public class EmployeeTest
{
	public static void main(String [] a)
	{
		Employee e1=new Employee(33, "Kasinath", 500000);
		e1.display();
		e1.update(1000000);
		e1.display();
	}
}