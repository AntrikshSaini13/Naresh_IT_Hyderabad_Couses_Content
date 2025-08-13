package Jan_06_2024_Has_A_Relation;

//private int studentId;
//private String studentName;
//private double studentFee;
//private String studentBranch

//private String collageName;
//private String collageLocation; 

public class StudentMain {
	public static void main(String[] args) {
		Student Stud1 = new Student(180112,"Antriksh",33500,"ECE");
		Student Stud2 = new Student(180113,"Kaustubh",33500,"Cs");
		Student Stud3 = new Student(180114,"Ali Saad",33500,"ECE");
		StudentCollage Col1 = new StudentCollage("GBPIT","Pauri",Stud1);
		StudentCollage Col2 = new StudentCollage("GBPIT","Pauri",Stud2);
		StudentCollage Col3 = new StudentCollage("GBPIT","Pauri",Stud3);
		System.out.println(Col1);
		System.out.println(Col2);
		System.out.println(Col3);
	}
}
