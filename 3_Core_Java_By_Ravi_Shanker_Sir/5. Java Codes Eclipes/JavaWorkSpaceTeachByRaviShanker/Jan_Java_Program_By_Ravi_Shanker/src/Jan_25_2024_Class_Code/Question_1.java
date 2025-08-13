package Jan_25_2024_Class_Code;

//Composition

class Person{
	private String personName;
	private int personAge;
	private double personHeight;
	private double personWeight;
	private String personColor;
	private Heart heart; // HAS-A-Relations
	
	public Person(String personName, int personAge, double personHeight, double personWeight, String personColor) {
		super();
		this.personName = personName;
		this.personAge = personAge;
		this.personHeight = personHeight;
		this.personWeight = personWeight;
		this.personColor = personColor;
		
		this.heart = new Heart(12, 120, 52);   //her we creates the object of contained
	}

	@Override
	public String toString() {
		return "Person [personName=" + personName + ", personAge=" + personAge + ", personHeight=" + personHeight
				+ ", personWeight=" + personWeight + ", personColor=" + personColor + ", heart=" + heart + "]";
	}

	public String getPersonName() {
		return personName;
	}

	public int getPersonAge() {
		return personAge;
	}

	public double getPersonHeight() {
		return personHeight;
	}

	public double getPersonWeight() {
		return personWeight;
	}

	public String getPersonColor() {
		return personColor;
	}

	public Heart getHeart() {
		return heart;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public void setPersonAge(int personAge) {
		this.personAge = personAge;
	}

	public void setPersonHeight(double personHeight) {
		this.personHeight = personHeight;
	}

	public void setPersonWeight(double personWeight) {
		this.personWeight = personWeight;
	}

	public void setPersonColor(String personColor) {
		this.personColor = personColor;
	}

	public void setHeart(Heart heart) {
		this.heart = heart;
	}
		
}

class Heart{
	private int heartbeat;
	private int bloodpressure;
	private int heartsize;
	
	public Heart(int heartbeat, int bloodpressure, int heartsize) {
		super();
		this.heartbeat = heartbeat;
		this.bloodpressure = bloodpressure;
		this.heartsize = heartsize;
	}
	@Override
	public String toString() {
		return "Heart [heartbeat=" + heartbeat + ", bloodpressure=" + bloodpressure + ", heartsize=" + heartsize + "]";
	}
}

public class Question_1 {
	public static void main(String[] args) {
		
		Heart h1 = new Heart(12, 120, 50);
		System.out.println(h1);
		
		Person p1 = new Person("Antriksh", 24, 5.8, 68, "Fair");
		System.out.println(p1);
		
		Person p2 = new Person("Ali Saad", 24, 5.8, 68, "Fair");
		System.out.println(p1);
		
		Person p3 = new Person("Kaustubh Ranjan", 24, 5.8, 68, "Fair");
		System.out.println(p1);
		
		Person p4 = new Person("Kunal", 24, 5.8, 68, "Fair");
		System.out.println(p1);
		
		Person p5 = new Person("Smith", 24, 5.8, 68, "Fair");
		System.out.println(p1);
	}
}
//Assignment :
//------------
//Person and Heart
//Laptop and Motherboard