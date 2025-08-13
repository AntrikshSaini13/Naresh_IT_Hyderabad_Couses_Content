package Feb_10_2024_ClassCode;

//Record Class Example

public record Person1(String name1,int num) {
	static String name;
	public Person1{//Component Constructor
	name = name1;
	}
	public static void main(String[] args) {
	Person1 p=new Person1("Antriksh",12);
	System.out.println(p);
	}
	}