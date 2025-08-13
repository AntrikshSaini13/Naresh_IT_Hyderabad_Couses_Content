package Apr_05_2024_Class_Code;


class Student
{
	int id;
	String name;
	
	@Override
	public String toString() 
	{
		return "Id is :" + id + "\nName is :" + name ;
	}
	
}
public class Question_3 
{
	public static void main(String[] args) 
	{
		Student s1 = new Student();
		s1.id = 111;
		s1.name = "Ravi";
        
		System.out.println(s1);
		
		System.out.println("After Shallow Copy");
		
		Student s2 = s1; //shallow copy
		s2.id = 222;
		s2.name = "Shankar";
		
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}

}


