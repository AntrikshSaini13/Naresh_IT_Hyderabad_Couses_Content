package Jan_6;

public class StudentCollege {
	
//	declare instance variable is here privately
	private String collegeName;
	private String collegeLocation;
	
//	Here apply HAS-A Relations
	private Student student;

//	Here I am Writing parameter constructor by using Sourse and Field set
	public StudentCollege(String collegeName, String collegeLocation, Student student) {
		super();
		this.collegeName = collegeName;
		this.collegeLocation = collegeLocation;
		this.student = student;
//	      
}

//  Here Is Generate the otString Method Becozof return the data by reference
	@Override
	public String toString() {
		return "College [collegeName=" + collegeName + ", collegeLocation=" + collegeLocation + ", student=" + student
				+ "]";
	} 
}
