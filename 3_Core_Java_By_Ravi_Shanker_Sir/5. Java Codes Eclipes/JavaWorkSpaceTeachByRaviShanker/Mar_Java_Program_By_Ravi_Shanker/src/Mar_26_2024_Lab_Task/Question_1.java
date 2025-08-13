package Mar_26_2024_Lab_Task;

import java.util.Scanner;

enum CoffeeType{
	NOTHING, COLD_COFFEE, BLACK_COFFEE, MILK_COFFEE, TEA
}
enum CoffeeSize{
	ZERO, SMALL, MEADIUM, LARGE
}

//BLC
class Coffee{
	private CoffeeType type;
    private CoffeeSize size;
    
	public Coffee(CoffeeType type, CoffeeSize size) {
		super();
		this.type = type;
		this.size = size;
	}	
	
	@Override
	public String toString() {
		return "Coffee [type=" + type + ", size=" + size + "]";
	}
	
	public Coffee makeCofffe(CoffeeType type, CoffeeSize size) {
		this.type = type;
		this.size = size;
		return new Coffee(type, size);
	}
	 
}
//ELC
public class Question_1 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		Coffee c = new Coffee(CoffeeType.COLD_COFFEE,CoffeeSize.LARGE);
//		System.out.println(c);
		
		CoffeeType [] array1 = CoffeeType.values();
		CoffeeSize [] array2 = CoffeeSize.values();
		
		System.out.println("Coffee Menu is here");
		System.out.println("1. COLD_COFFEE");
		System.out.println("2. BLACK_COFFEE");
		System.out.println("3. MILK_COFFEE");
		System.out.println("4. TEA");
		System.out.print("Which want to you Coffee : Enter the number(1, 2, 3, 4) : ");
		int coffeeNum = sc.nextInt();
		
		if(0<coffeeNum) {
			System.out.println("1. Large");
			System.out.println("2. Medium");
			System.out.println("3. Small");
			System.out.print("Enter the size of Coffee for(1, 2, 3) : ");
			
			int coffeeSizeNum = sc.nextInt();
			
			if(0<coffeeSizeNum) {	
				switch(array1[coffeeNum]){
					case COLD_COFFEE : if(CoffeeType.COLD_COFFEE == array1[coffeeNum]) {
											System.out.println("\nYour Coffe is Ready: "+c.makeCofffe(array1[coffeeNum],array2[coffeeSizeNum]));
									   }
									   else {
										   	System.out.println("Wrong input");
									   };
					break;
					case BLACK_COFFEE : System.out.println("\nYour Coffe is Ready: "+c.makeCofffe(array1[coffeeNum],array2[coffeeSizeNum]));
					break;
					case MILK_COFFEE : System.out.println("\nYour Coffe is Ready: "+c.makeCofffe(array1[coffeeNum],array2[coffeeSizeNum]));;
					break;
					case TEA : System.out.println("\nYour Coffe is Ready: "+c.makeCofffe(array1[coffeeNum],array2[coffeeSizeNum]));;
					break;
					default : System.out.println("Wrong Input");
				}
			}
			else {
				System.out.println("Enter the valid size of Coffee");
			}
		}
		else {
			System.out.println("No any Coffee here on this Number");
		}
//		System.out.println(c.getOrderDetails());
	}

	
}


