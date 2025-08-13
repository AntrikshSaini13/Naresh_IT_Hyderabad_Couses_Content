package Array;

public class CloneOfArray {
	public static void main(String[] args) {
		int [] intArray = {12,23,45};
		
		System.out.println("Array of inArray");
		for(int array : intArray) {
			System.out.print(array+" ");
		}
		System.out.println("\n");
		int[] cloneArray = intArray.clone();
		
		System.out.println("Array of cloneArray");
		for(int array : cloneArray) {
			System.out.print(array+" ");
		}
		
		System.out.println("\n\nHash Code of intArray : "+intArray.hashCode());
		System.out.println("Hash Code of cloneArray: "+cloneArray.hashCode());
	}
	
}
