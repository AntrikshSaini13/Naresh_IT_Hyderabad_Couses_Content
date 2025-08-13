package Jan_6;

public class StudentMain
{
	
	public static void main(String [] args) {
//		here I am Creating the object of Student 
		Student antriksh = new Student(180112,"Antriksh","JAVA",24);

//		here I am Creating the object of College
		StudentCollege c1=new StudentCollege("NIT","HYD", antriksh);
		 
		System.out.println(c1);
		
		StudentCollege c2=new StudentCollege("BITS","HYD", antriksh);
		
		System.out.println(c2);
	}
}