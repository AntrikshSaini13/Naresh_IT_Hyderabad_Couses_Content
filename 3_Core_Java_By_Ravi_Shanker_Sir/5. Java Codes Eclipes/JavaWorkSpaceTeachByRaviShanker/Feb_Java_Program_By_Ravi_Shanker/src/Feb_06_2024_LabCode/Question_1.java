package Feb_06_2024_LabCode;

//Super Class here wew are return object

class Animal{
	public String species;
	public String sound;

	public Animal(String species, String sound) {
		super();
		this.species = species;
		this.sound = sound;
	}

	public String getSpecies() {
		return species;
	}
	
	public void makeSound() {
		System.out.println("generic animal sound");
	}

	@Override
	public String toString() {
		return "Animal [species=" + species + "]";
	}

	public Animal reproduce() {
		System.out.println("Generic reproduction method for all animals.");
		return new Animal("Unknown","Unknown");
	}
}

//Subclass Mammal of Animal
class Mammal extends Animal{
	
//	instance variable
	public boolean hasFur;
	
	
//	Constructor
	public Mammal(String species, String sound, boolean hasFur) {
		super(species,sound);
		this.hasFur = hasFur;
	}
	
	@Override
	public void makeSound() {
		System.out.println("generic animal sound : "+sound);
	}

	@Override
	public Mammal reproduce() {
		System.out.println("Mammals give birth to live young.");
		return new Mammal("Lion Baby","Rora",false);
	}
	
	public void nurseYoung() {
		System.out.println("mammals nursing their young");
	}

	@Override
	public String toString() {
		return "Mammal [hasFur= " + hasFur + ", species= " + species + ", sound= " + sound + "]";
	}	
}

//Subclass Birds of Animal
class Bird extends Animal{
	
//	Instance Variable
	public boolean canfly;
	
//	Constructor
	public Bird(String species, String sound, boolean canfly) {
		super(species, sound);
		this.canfly = canfly;
	}
	
	@Override
	public void makeSound() {
		System.out.println("generic animal sound : "+sound);
	}

	@Override
	public Bird reproduce() {
		System.out.println("Mammals give birth to live young.");
		return new Bird("Bird Baby","Columbidae",false);
	}

	@Override
	public String toString() {
		return "Bird [canfly=" + canfly + ", species=" + species + ", sound=" + sound + "]";
	}
	
	public void buildNest() {
		System.out.println("birds building nests for their egg");
	}
	
}

public class Question_1{
	public static void main(String[] args) {
		Animal a1 ;
		
//		a1= new Animal("");
//		System.out.println(a1);
//		System.out.println(a1.reproduce());

//		Object of Mammal
		System.out.println("\n Mammal");
		a1 = new Mammal("Lion", "Rora",true);
		System.out.println(a1);
		new Mammal("Lion", "Rora",true).nurseYoung();
		System.out.println(a1.reproduce());
		
		System.out.println("\n\n Bird");
//		Object of Bird
		a1 = new Bird("Pigeon", "Columbidae", true);
		System.out.println(a1);
		new Bird("Pigeon", "Columbidae", true).buildNest();		
		System.out.println(a1.reproduce());
	}
}
