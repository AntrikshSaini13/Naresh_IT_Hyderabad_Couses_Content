package Day_5_CmdLineArgunment;


//Q2) Write a program to perform addition using command line Argument.

public class Question_2 {
	public static void main(String[] args) {
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		System.out.println("Sum of two number is : "+(num1+num2));
	}
}