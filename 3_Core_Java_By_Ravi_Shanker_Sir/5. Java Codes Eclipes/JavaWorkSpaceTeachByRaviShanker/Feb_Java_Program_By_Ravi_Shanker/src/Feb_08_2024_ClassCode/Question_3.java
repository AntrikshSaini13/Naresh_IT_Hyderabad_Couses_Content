package Feb_08_2024_ClassCode;

//toString()

class Student{
	int id;
	String Name;
}

public class Question_3 {
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println(s1);
		System.out.println("-------------------------------------");
		System.out.println(s1.getClass().getName());
		System.out.println("-------------------------------------");
		System.out.println(s1.getClass().getName().hashCode());
		System.out.println("--------------------------------------");
		System.out.println(s1.getClass().hashCode());
//		System.out.println(getName().hashCode()); //here is come erroe
		System.out.println("--------------------------------------");
		System.out.println(s1.hashCode());
		System.out.println("--------------------------------------");
	}
}
