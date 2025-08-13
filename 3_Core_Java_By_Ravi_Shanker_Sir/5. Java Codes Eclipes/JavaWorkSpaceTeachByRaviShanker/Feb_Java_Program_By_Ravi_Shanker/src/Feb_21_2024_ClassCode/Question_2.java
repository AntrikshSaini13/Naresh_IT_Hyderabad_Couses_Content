package Feb_21_2024_ClassCode;

// Consumer predefine class internally "accept()" method is contain its take input but return nothing

import java.util.function.*;

public class Question_2 {
	public static void main(String[] args) {
		Consumer <Integer> num = number-> System.out.println("Integer Number "+number);
		Consumer <String> name = name1-> System.out.println("String Nname "+name1);
		Consumer <Double> num2 = number2-> System.out.println("Integer Number "+number2);
		Consumer <StudentRecord> stdDetails = details -> System.out.println(details); ;
		
		num.accept(12);
		name.accept("Aman");
		num2.accept(12.0);
		stdDetails.accept(new StudentRecord("Aman",101));
	}
}

record StudentRecord(String name, int rollNum) {
	
}
