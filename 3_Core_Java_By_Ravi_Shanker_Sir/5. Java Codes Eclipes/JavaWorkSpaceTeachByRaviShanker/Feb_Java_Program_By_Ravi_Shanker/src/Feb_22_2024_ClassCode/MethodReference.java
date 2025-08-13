package Feb_22_2024_ClassCode;


@FunctionalInterface
interface Worker1 
{
  void work(double salary);
}


class Employee1
{
  public void work(double salary)
  {
	  System.out.println("Employee Salary is :"+salary);
  }
}

public class MethodReference 
{
	public static void main(String[] args)
	{
	  //By using Lambda
	  Worker w1 = sal -> System.out.println("Worker salary is :"+sal);
	  w1.work(40000);
	  
	  //By using Method Reference
	  Worker w2 = new Employee1()::work;
	  w2.work(50000);
	}

}
