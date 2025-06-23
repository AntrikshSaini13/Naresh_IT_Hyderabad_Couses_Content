package Feb_20_2024_Class_Code;

class Accept<T>{
	
//	Type Parameter
	private T var; 
	
//	Constructor
	public Accept(T x)  // Student x -> new Student(1,"A");
	{
		var = x;
	}
	
	public T getVar()
	{
		return this.var;
	}
}

public class Question_1 {
	public static void main(String[] args)
	{
	  Accept<Integer> intType = new Accept<>(15);
	  System.out.println(intType.getVar());
	  
	  Accept<Float> floatType = new Accept<>(3.4f);
	  System.out.println(floatType.getVar());
	  
	  Accept<Character> charType = new Accept<>('A');
	  System.out.println(charType.getVar());
	  
	  Accept<Student> stdType = new Accept<>(new Student(1, "A"));
	  System.out.println(stdType.getVar());
	  
	}

}

record Student(int id, String name)
{
	
}