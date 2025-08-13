package Day_4_WrapperClass;

public class Question_7 {
	public static void main(String[] args) {
		
//		Using primitive data type
		float hindi = 56F;
		float english = 52.2F;
		float science = 85F;
		float math = 90F;
		float socialScience = 50F;
		
		float sum = hindi + english + math + science + socialScience;
		
		System.out.println("Total marks of five subject is : "+sum);
		
		System.out.println("Average of marks : "+sum/5);
	}
}
