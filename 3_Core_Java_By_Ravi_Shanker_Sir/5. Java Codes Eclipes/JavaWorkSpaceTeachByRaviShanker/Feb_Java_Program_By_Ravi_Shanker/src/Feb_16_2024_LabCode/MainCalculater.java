package Feb_16_2024_LabCode;

import java.util.Scanner;

public class MainCalculater {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		AdvancedArithmetic c1;
		
		System.out.print("Enter the number : ");
		int num= sc.nextInt();
		
		c1 = new MyCalculator(num);
		System.out.println(c1);	
		sc.close();
	}
}
