package Task_0;

public class Question_4 {
	public static void main(String[] args) {
		int i;float sum=0;
		
		for(i=0;i<args.length;i++) {
			sum+=Integer.parseInt(args[i]);
		}
		System.out.println("Sum of Array is : "+sum);
		System.out.println("Average os Array is : "+sum/args.length);
		
	}
}
