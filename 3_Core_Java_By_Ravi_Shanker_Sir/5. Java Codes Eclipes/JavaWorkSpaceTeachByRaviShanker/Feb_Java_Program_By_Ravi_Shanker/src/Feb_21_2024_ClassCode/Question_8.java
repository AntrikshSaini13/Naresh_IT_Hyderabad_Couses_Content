package Feb_21_2024_ClassCode;

//Assignment :
//-----------
//Program by using Function<T,R> functional interface to verify whether the name starts 
//with R or not?

import java.util.function.*;
import java.util.*;

public class Question_8 {
	public static void main(String[] args) {
		Function <String,Boolean> fun1 = str->str.startsWith("R");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the name");
		String name = sc.next();
		
		if(fun1.apply(name)) {
			System.out.println("The name Start with");
		}
		else {
			System.out.println("The name isn't Start with R" );
		}
		sc.close();
	}
}
