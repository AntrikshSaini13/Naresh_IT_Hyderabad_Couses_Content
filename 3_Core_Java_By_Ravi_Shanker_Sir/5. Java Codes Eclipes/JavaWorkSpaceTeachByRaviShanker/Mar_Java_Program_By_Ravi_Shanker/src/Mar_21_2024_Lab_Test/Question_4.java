package Mar_21_2024_Lab_Test;

enum CoffeeType{
	  Espresso, Americano, Latte, Cappuccino; 
}

class CoffeeOrder {
	CoffeeType coffeType;
	int sugerLevel;
	 
	public CoffeeOrder(CoffeeType coffeType, int sugerLevel) {
		super();
		this.coffeType = coffeType;
		this.sugerLevel = sugerLevel;
	}

	@Override
	public String toString() {
		return "CoffeeOrder [coffeType=" + coffeType + ", sugerLevel=" + sugerLevel + "]";
	}	 
}

class CoffeeShop {
	
	CoffeeType  coffeType;
	
	int sugerLevel;	
	
	public CoffeeShop(CoffeeType coffeType, int sugerLevel) {
		super();
		this.coffeType = coffeType;
		this.sugerLevel = sugerLevel;
	}
	
	@Override
	public String toString() {
		return "CoffeeShop [coffeType=" + coffeType + ", sugerLevel=" + sugerLevel + "]";
	}

	public  CoffeeOrder  takeOrder(CoffeeType  coffeType, int sugerLevel) {
		return new CoffeeOrder(coffeType, sugerLevel);		
	}
	public  void  prepareCoffee(CoffeeOrder co) {
		System.out.println("Your Coffee "+co.coffeType+" with suger level: "+co.sugerLevel);		
	}
	
	
}

public class Question_4{
	public static void main(String[] args) {
		CoffeeShop c1 = new CoffeeShop(CoffeeType.Cappuccino,4);
		System.out.println(c1.takeOrder(CoffeeType.Cappuccino,4));
	}
}