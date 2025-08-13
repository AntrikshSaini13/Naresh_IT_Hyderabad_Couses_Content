package Feb_08_2024_LabCodeTest;

class Player{
	public void attack() {
		System.out.println("generic attack strategy");
	}
	
	public void attack( int demage) {
		System.out.println("generic attack strategy : "+demage);
	}
}

class  Warrior extends  Player{
	public void attack() {
		System.out.println("Warrior class to implement a distinct attack strategy suitable for a warrior character");
	}
	
	public void attack( int demage) {
		System.out.println(" gun : "+demage);
	}
}

public class Question_1 {
	public static void main(String[] args) {
		Player p1;
		p1 = new Warrior();
		p1.attack();
		p1.attack(2);

	}
}
//Scenario: Fantasy RPG - Player and Warrior Classes(5 points)
//
//
//
//Super Class - Player:
//
//
//
//Create a class named Player with the following features:
//
//A method attack() that prints a generic attack strategy.
//
//An overloaded method attack(int damage) to handle variations in attack damage.
//
//
//
//Subclass - Warrior:
//
//
//
//Create a subclass named Warrior that extends the Player class.
//
//Override the base class's attack() method in the Warrior class to implement a distinct attack strategy suitable for a warrior character.
//
//Add an additional overloaded method in the Warrior class to handle variations in attack parameters, such as damage and weapon type.
//
//
//
//ELC - RPGSimulator:
//
//
//
//Develop an ELC named RPGSimulator that showcases the use of the Player and Warrior classes.
//
//Instantiate objects of each class and invoke various methods to demonstrate the distinct attack strategies 
//and the flexibility in handling variations in attack parameter