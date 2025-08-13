package Jan_22_2024_Class_Code;

// without super keyword we are call to super call method but here is method shadow 
// here sub class show method called itself recursion started stackoverflow error came here

class Super 
{
  public void show()
  {
	  System.out.println("Super class show method");
  }
}

class Sub extends Super
{
  public void show()
  {
    show();
    System.out.println("Sub class show method");
    subClassMethod();
  }
  
  public void subClassMethod()
  {
	  System.out.println("Another method of sub class");
  }

}


public class Question_3 {

	public static void main(String[] args) 
	{
		Sub s = new Sub();
		s.show();
	}

}