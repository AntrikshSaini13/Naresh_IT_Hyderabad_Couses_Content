package Array;

public class ReturnArrayToMethod2 {
	public static void main(String[] args) {
		
//		here call to getArray method and get array
		int [] arr = getArray();
		
		for(int array : arr) {
			System.out.print(array+"  ");
		}
	}
	
	public static int[] getArray() {
//		here return the array this is the style of return array in java
		return new int[] {25,36,14};
	}
}
