package Array_Ouestion_Pratices_Here;

import java.util.Scanner;

// Write the program to calculate the sum of number Store in an Array of size is 10.
// Take the value form the user.
class SumOfArray{
	private int [] array ;
	
	public void setArray(int[] array) {
		this.array = array;
	}

	public int sumOfArray() {
		int sum = 0;
		for(int a : array) {
			sum+=a;
		}
		return sum;
	}
}
public class SumOfNumber_In_Array {	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		Array Declaration her 
		int [] array = null;
		
//		Initialize The size of Array
		System.out.println("Enter the Size of Array : ");
		int sizeOfArray = sc.nextInt();
		array = new int[sizeOfArray];
		
//		here insert the data of array
		try{
			System.out.println("Enter the data of array : ");
			for(int i = 0; i <= array.length; i++) {
				array[i] = sc.nextInt();
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array size Out of Boundery");
		}
		finally{
			sc.close();
		}
		
//		here is create the object of Sum class
		SumOfArray sum = new SumOfArray();
		
		sum.setArray(array);
		
		System.out.println("Sum of Array is : "+sum.sumOfArray());
	}
}
