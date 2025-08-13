package Feb_21_2024_ClassCode;

// here is functional interface this is a take input ae well as return data

import java.util.function.*;
import java.util.*;
public class Question_3 {
	public static void main(String[] args) {
		
		// square of the number
		
		Function<Integer,Integer> fun1 = num-> num*num;
		
		Function<Product,Integer> fun2 = pro -> (Product.number+Product.number) ;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number ");
		int num = sc.nextInt();
		
		System.out.println(fun1.apply(num));
		
		System.out.println(fun2.apply(new Product(102,"Aman")));
	
		sc.close();
	}
}

record Product(int pNum, String pName) {
	static int number;
	static String name;
	public Product{
		number = pNum;
		name = pName;
	}
}
