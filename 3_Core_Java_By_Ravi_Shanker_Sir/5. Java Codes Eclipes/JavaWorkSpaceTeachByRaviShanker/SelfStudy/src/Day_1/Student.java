package Day_1;

//BLC
class Student{
	// Instance Variable by access specfier as private now scope inside the class only
	private int stdId;
	private String stdName;
	
	// Non-Parameterized Constructor 
	Student(){
		super();
	}

	// Parameterized Constructor 
	Student(int stdId, String stdName){
		this.stdId = stdId;
		this.stdName = stdName;
	}
	
	// Setter method stdId
	public void setStudentId(int stdId){
		if(stdId<=0) {
			 System.err.println("Invalid Input");
		}
		else {
			this.stdId = stdId;
		}
		
	}
	
	// Getter method for stdId
	public int getStudentId() {
		return stdId;
	}

	// Setter method stdname
	public void setStudentName(String stdName){
		if(stdName.isEmpty()|| stdName.length()>=10) {
			System.err.println("Invalid Input");
		}
		else {
			this.stdName = stdName;
		}
	}

	// Getter method for stdName
	public String getStudentName() {
		return stdName;
	}

	// toString Method for getting the details of the class
	@Override
	public String toString() {
		return "Student [studentId=" + stdId + ", studentName=" + stdName + "]";
	}
}

