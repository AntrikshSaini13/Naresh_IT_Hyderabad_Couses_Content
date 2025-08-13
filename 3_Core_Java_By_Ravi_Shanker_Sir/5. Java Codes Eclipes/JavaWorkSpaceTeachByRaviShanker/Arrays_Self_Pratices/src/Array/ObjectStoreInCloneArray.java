package Array;

class StudentOfCollage{
	int id;
	String name;
	String course;
	public StudentOfCollage(int id, String name, String course) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", course=" + course + "]";
	}	
}

public class ObjectStoreInCloneArray {
	public static void main(String[] args) {
		
		System.out.println("Here is Student Of Collage object get\n");
		StudentOfCollage [] students = {
				new StudentOfCollage(1,"Aman","B.tech"),
				new StudentOfCollage(2,"Antriksh","B.tech"),
				new StudentOfCollage(3,"Aswal","B.tech"),
				new StudentOfCollage(4,"Ankita","B.tech")
				};
		for(StudentOfCollage std : students) {
			System.out.println(std);
		}
		
//		here we are creating the clone of StudentOfCollage Object
		System.out.println("\nHere used to 'clone()' method for create the clone of StudentOfCollage object\n");
		StudentOfCollage [] cloneOfStudents = (StudentOfCollage[]) students.clone();
		for(StudentOfCollage std : cloneOfStudents) {
			System.out.println(std);
		}
		
//		here compare the hashCode of both object
		
		System.out.println("\n\nhashCode of students : "+students);
		System.out.println("hashCode of cloneOfStudents : "+cloneOfStudents);
		
		System.out.println("\nCompare the Data Behalf of clone and normal reference\n");
		
		System.out.println(students[0] == cloneOfStudents[0]);
		System.out.println(students[1] == cloneOfStudents[1]);
		
	}
}
