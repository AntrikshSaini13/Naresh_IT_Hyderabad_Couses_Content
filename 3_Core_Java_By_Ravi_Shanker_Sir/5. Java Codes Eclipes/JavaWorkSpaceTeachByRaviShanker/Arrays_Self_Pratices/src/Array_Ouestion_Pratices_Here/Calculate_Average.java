package Array_Ouestion_Pratices_Here;

import java.util.Scanner;

class Sum{
	public int sum(int [] array) {
		int sum = 0;
		for (int a : array) {
			sum+=a;
		}
		return sum;
		
	}
}
class Average{
	private int average;
	private int [] array ;

	public void setArray(int[] array) {
		this.array = array;
	}
	
	public int average() {
		
		average = new Sum().sum(array)/array.length;
		return average;
	}

	
}

public class Calculate_Average {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] array = null;
		
		System.out.println("Enter the size of array : ");
		int sizeOfArray = sc.nextInt();
		array = new int[sizeOfArray];
		
		try(sc) {
			System.out.println("Enter the data");
			for(int i=0; i<array.length;i++) {
				array[i] = sc.nextInt();
			}
			
			Average avg = new Average();
			avg.setArray(array);
			
			System.out.println("Average Of Array : "+avg.average());
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Index size Is InCorrec First Fixed");
		}
		
		}
}
