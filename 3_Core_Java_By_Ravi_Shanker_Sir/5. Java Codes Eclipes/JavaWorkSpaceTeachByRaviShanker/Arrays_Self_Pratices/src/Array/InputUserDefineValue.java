package Array;

import java.util.Scanner;

public class InputUserDefineValue {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of Array : ");
		int size = sc.nextInt();
		
		int numbers[] = new int[size];
		
		//store the value is here
		for(int i=0; i<size; i++) {
		numbers[i] = sc.nextInt();
		}
		//print the numbers in array
		for(int i=0; i<numbers.length; i++) {
		System.out.print(numbers[i]+" ");
		}
		sc.close();
	}
}

