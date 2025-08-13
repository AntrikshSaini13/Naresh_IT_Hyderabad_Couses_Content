package MultiDimensionalArray;

public class Pass2DArrayInArrgunment {
	public static void main(String[] args) {
		int [][] array = {{1,2,3},{4,5,6},{7,8,9}};
		
		int sum = sum(array);
		
		System.out.println("Sum of 2-D Array is : "+sum);
	}
	
	public static int  sum(int[][] array) {
		int sum = 0;
		System.out.println("2-D Array : ");
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array.length;j++) {
				System.out.print(array[i][j]+" ");;
			}
			System.out.println("\n");
		}
		
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array.length;j++) {
				sum+=array[i][j];
			}
		}
		return sum;
		
	}
}
