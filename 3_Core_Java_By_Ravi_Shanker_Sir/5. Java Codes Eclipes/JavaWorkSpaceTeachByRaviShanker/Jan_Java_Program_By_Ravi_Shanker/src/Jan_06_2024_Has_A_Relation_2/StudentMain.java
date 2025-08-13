package Jan_06_2024_Has_A_Relation_2;

public class StudentMain {
	public static void main(String[] args) {
		StudentCollage collage = new StudentCollage("GBPIT","PAURI");
		Student student1 =new Student(112, "Kaustubh", "IT", 15025, collage);
		
		System.out.println(student1);
		
		System.out.println(student1.getStudentName());
	}
}
