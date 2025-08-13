package Feb_22_2024_ClassCode;

// BiFunctional Interface takes two arguments and and return result

import java.util.function.*;

public class Question_4 {
	public static void main(String[] args) {
		BiFunction<String, String, String> biFun = (name1, name2)->name1+name2;
		
		String result = biFun.apply("Aman", "Saini");
		
		System.out.println(result+"\n-----------------------------------------");
		
		BiFunction<String, String, Integer> biFun1 = (name1,name2)->(name1+name2).length();
		
		Integer result1 = biFun1.apply("Aman", "Saini");
		
		System.out.println(result1+"\n-----------------------------------------");
	}
}
