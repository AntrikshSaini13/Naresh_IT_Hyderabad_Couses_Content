package Feb_22_2024_ClassCode;

// BiConsumer its Take in input two parameter and return noting
 
import java.util.function.*;
//import java.util.*;

public class Question_3 {
	 public static void main(String[] args) {
		BiConsumer<Integer, String> upDateVar = (num,string)->{
			num = num*2;
			string = string.toUpperCase();
			System.out.println("Update VAlue :"+num+","+string);
		};
		int num = 5;
		String string= "AMan";
		
		upDateVar.accept(num, string);		
	}
}
