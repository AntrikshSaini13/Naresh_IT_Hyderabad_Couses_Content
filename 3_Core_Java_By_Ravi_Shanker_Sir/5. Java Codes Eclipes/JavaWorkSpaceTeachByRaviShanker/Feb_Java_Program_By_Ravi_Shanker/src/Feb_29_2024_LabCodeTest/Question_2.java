package Feb_29_2024_LabCodeTest;

import java.util.*;
import java.util.function.*;

public class Question_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Consumer <Integer> con = num -> {
			System.out.print(" The Natursl Number is \n");
			for(int i = 0; i < num; i++) {
				System.out.print(" "+i);
			}			
		};
		
		
		System.out.print(" How many Number you wants to print ?");
		int num1 = sc.nextInt();
		
		con.accept(num1);
		
		sc.close();
	}
}


//Write a java program to print N natural number using Consumer funtional interface.  
//Example : input number = 7
//Output : 1 2 3 4 5 6 7