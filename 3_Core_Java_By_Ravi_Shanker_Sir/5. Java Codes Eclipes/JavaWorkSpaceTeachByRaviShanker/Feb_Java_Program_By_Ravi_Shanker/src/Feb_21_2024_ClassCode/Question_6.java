package Feb_21_2024_ClassCode;

import java.util.Scanner;
import java.util.function.*;

public class Question_6 {
	public static void main(String[] args) {
		Supplier <Player> sup = ()->{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of Payer");
		String name = sc.next();
		
		System.out.println("Enter the Player Id");
		int id = sc.nextInt();
		
		return new Player(name,id);
		};
		System.out.println(sup.get());
	}
}

record Player(String pName, int pId) {
	
}