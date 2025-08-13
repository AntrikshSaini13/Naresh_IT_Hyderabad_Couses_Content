package MultiDimensionalArray;

public class StoreData2DArray {
	public static void main(String[] args) {
		
//		 2-D array Declaration and initialize and Store the data
		int [][]arrays = {{25, 25, 25}, {26,26,26}, {17,17,17}};
		
//		2-D array memory Location
		System.out.println("2-D array memory Location");
		for(int i = 0; i<arrays.length;i++) {
			for(int j =0; j<arrays.length;j++) {
				System.out.print(i+""+j+"  ");
			}
			System.out.println("\n");
		}
		
//		Here get the data from the array
		System.out.println("Get the data from the array");
		for(int i = 0; i<arrays.length;i++) {
			for(int j =0; j<arrays.length;j++) {
				System.out.print(arrays[i][j]+"  ");
			}
			System.out.println("\n");
		}
		
	}
}
