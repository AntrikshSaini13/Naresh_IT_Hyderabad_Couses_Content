package Jan_06_2024_Has_A_Relation;

public class StudentCollage {
	private String collageName;
	private String collageLocation;

	private Student student; // Has_A_Relations

	@Override
	public String toString() {
		return "StudentCollage [collageName=" + collageName + ", collageLocation=" + collageLocation + ", student="
				+ student + "]";
	}

	public StudentCollage(String collageName, String collageLocation, Student student) {
		super();
		this.collageName = collageName;
		this.collageLocation = collageLocation;
		this.student = student;
	} 
	
}
 