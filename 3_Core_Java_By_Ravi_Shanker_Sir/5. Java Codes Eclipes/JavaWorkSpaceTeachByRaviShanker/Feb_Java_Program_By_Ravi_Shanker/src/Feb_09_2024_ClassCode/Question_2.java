package Feb_09_2024_ClassCode;

class Student1{
	@ Override
	public String toString() { // here toString method also override
		return "Student class object in string representation";
	}
}

public class Question_2{
	public static void main(String[] args) {
		Student1 s1 = new Student1();
		System.out.println(s1);
	}
}

//Output : Student class object in string representation
