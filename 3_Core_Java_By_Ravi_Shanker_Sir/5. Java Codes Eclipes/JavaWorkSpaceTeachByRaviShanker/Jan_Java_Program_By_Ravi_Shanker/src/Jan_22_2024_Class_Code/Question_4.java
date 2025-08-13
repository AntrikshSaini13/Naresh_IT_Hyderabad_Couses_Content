package Jan_22_2024_Class_Code;

//here we are apply the super keyword for remove the method shadow 

class Super_1 
{
  public void show()
  {
	  System.out.println("Super class show method");
  }
}

class Sub_1 extends Super_1
{
  public void show()
  {
    super.show();
    System.out.println("Sub class show method");
    this.subClassMethod(); // without 'this' keyword that method easily access no need of this keyword is here
  }
  
  public void subClassMethod()
  {
	  System.out.println("Another method of sub class");
  }

}


public class Question_4 {

	public static void main(String[] args) 
	{
		Sub_1 s = new Sub_1();
		s.show();
	}

}