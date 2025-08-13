package MultiDimensionalArray;

public class LengthMutidimensionalArray {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
//		array deceleration
		int [][] twoDArray;
		
//		Initialize the array
		twoDArray =  new int[2][2];
		
//		insert the data in array
		twoDArray[0][0] = 108;
		twoDArray[0][1] = 109;
		twoDArray[1][0] = 107;
		twoDArray[1][1] = 106;		
	
//		Find the length of Rows one by one
		for(int i = 0; i<twoDArray.length; i++) {
			System.out.println("Length of row "+i+" : "+twoDArray[i].length);
		}	
		System.out.println("\n");
		
//		get the data form the array
		for(int i = 0; i<twoDArray.length;i++) {
			for(int j = 0; j<twoDArray.length;j++)
			{
				System.out.print(twoDArray[i][j]+"  ");				
			}
			System.out.println("\n");
		}			
	}
}
