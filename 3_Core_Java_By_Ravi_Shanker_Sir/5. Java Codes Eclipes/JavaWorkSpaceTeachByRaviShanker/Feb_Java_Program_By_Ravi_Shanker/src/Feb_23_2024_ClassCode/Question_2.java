package Feb_23_2024_ClassCode;

//Method Reference by using instance Method :
@ FunctionalInterface
interface Trainer{
	public abstract void getTraining(String name, int exp);
}

class InstanceMethod{
	public void getTraining(String name, int exp) {
		System.out.println("Trainer Name is :"+name+" Experience is "+exp);
	}
}

public class Question_2 {
	public static void main(String[] args) {
//		by using Lambda Expression
//		                 Override the abstract method here
		Trainer t1 = (name, exp)->System.out.println("Trainer Name is :"+name+" Experience is "+exp);
		t1.getTraining("Antriksh", 5);
		
//		by using Method reference
		Trainer t2 = new InstanceMethod()::getTraining;
		t2.getTraining("Aman", 5);
		
		}
}
