package Array;

import java.util.Scanner;

public class ReturnArrayToMethod {
	public static void main(String[] args) {
		
//		here get the array to the method
		int [] arr = getArray();
		
		for(int a : arr) {
			System.out.println("My Array : ["+a+"]");
		}
	}
	
//	this method return the int type of array
	public static int[] getArray() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of Array : ");
		int sizeArray = sc.nextInt();
		
		int [] myArray = null;
		
		myArray = new int[sizeArray];
		
		for(int i=0;i<myArray.length;i++) {
			System.out.println("Enter the array Elemnets ");
			myArray[i] =sc.nextInt();
		}
		
		return myArray ;		
	}
}
