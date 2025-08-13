package MultiDimensionalArray;

class StudentOfCollage{
	int id;
	String name;
	String course;
	
//	constructor
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

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCourse() {
		return course;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	
}

public class ObjectStoreInClone2DArray {
	public static void main(String[] args) {
		
//		here create the Array of Object
		StudentOfCollage [][] students = {
				{
					new StudentOfCollage(101, "Aman", "B.Tech"),
					new StudentOfCollage(102, "Antriksh", "B.Tech"),
					new StudentOfCollage(103, "Aswal", "B.Tech")
				},
				{
					new StudentOfCollage(101, "Aman", "B.Tech"),
					new StudentOfCollage(102, "Antriksh", "B.Tech"),
					new StudentOfCollage(103, "Aswal", "B.Tech")
				},
				{
					new StudentOfCollage(101, "Aman", "B.Tech"),
					new StudentOfCollage(102, "Antriksh", "B.Tech"),
					new StudentOfCollage(103, "Aswal", "B.Tech")
				},
		};
		
		for(int i=0; i<students.length;i++) {
			for(int j=0; j<students.length;j++) {
				System.out.println(students[i][j]);
			}
		}
		
//		here we are Creating the clone of the StudentOfCollage Class
		
		StudentOfCollage [][] cloneStudents = (StudentOfCollage [][]) students.clone();
		
		for(int i=0; i<cloneStudents.length;i++) {
			for(int j=0; j<cloneStudents.length;j++) {
				System.out.println(cloneStudents[i][j]);
			}
		}
		
		System.out.println("\nHere we are Compare the CloneStudent and Student\n");
		
		System.out.println("Compare the hashCode of students reference : "+students.hashCode());
		System.out.println("Compare the hashCode cloneStudents reference : "+cloneStudents.hashCode());
		
		System.out.println("\nCompare the Data Of clone and normal\n");
		
		System.out.println(students[0][0]==cloneStudents[0][0]);
		
		System.out.println(students[0][0].getName());
		System.out.println(cloneStudents[0][0].getName());
	}
}
