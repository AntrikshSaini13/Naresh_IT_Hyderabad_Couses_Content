package Package1;

public class Aman{
	
	private String name;
	private int age;
	private int id;
	private String collage;
	private String location;

	public void setData(String name1, int age1, int id1, String collage1, String location1){
		name  = name1;
		age = age1;
		id = id1;
		collage = collage1;
		location = location1;
	}
	public void displayData(){
		System.out.println("My name is : "+name);
		System.out.println("My age is : "+age);
		System.out.println("My id is : "+id);
		System.out.println("My collage name is : "+collage);
		System.out.println("My collage location is : "+location);
  	}
}