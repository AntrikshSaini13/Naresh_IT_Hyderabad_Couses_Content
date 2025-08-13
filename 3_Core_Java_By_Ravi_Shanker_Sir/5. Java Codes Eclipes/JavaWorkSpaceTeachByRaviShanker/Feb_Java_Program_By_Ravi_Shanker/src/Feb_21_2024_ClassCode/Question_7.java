package Feb_21_2024_ClassCode;

//Assignment :
//------------
//By using Predicate verify whether a year is leap year or not?

import java.util.function.*;

import java.util.*;

public class Question_7 {
	public static void main(String[] args) {
		Predicate <Integer> pre1 = year -> (year%100==0&&year%400==0)||(year%100!=0&&year%4==0);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Year for check Leap year or Not");
		int year1 = sc.nextInt();
		
		if(pre1.test(year1)) {
			System.out.println("Leap Year");
		}
		else {
			System.out.println("Not a Leap Year");
		}
		sc.close();
	}
}
