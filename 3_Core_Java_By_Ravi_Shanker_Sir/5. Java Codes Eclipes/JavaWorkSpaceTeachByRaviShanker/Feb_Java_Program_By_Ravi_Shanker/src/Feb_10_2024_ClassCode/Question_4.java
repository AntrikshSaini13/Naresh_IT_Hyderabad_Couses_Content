package Feb_10_2024_ClassCode;

//here we are using the equals() method

class Employe{
	public Integer empId;
	private String empName;
	public Employe(Integer empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	public Integer getEmpId() {
		return empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	@Override
	public String toString() {
		return "Employ [empId=" + empId + ", empName=" + empName + "]";
	}
}
class Students{
	private Integer stdId;
	private String stdName;
	public Students(Integer stdId, String stdName) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
	}
	public Integer getStdId() {
		return stdId;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdId(Integer stdId) {
		this.stdId = stdId;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	@Override
	public String toString() {
		return "Students [stdId=" + stdId + ", stdName=" + stdName + "]";
	}	
//	
//	public boolean equals(Object obj) {
////		Down Casting of Parameter object reference
//		Students std = (Students)obj;
//		int id1 = std.stdId;
//		String name1 = std.stdName;
//		
////		Use here Current Reference
//		int id2 = this.stdId;
//		String name2 = this.stdName;
//		return false;	
//		if (id1==id2 && name1.equals(name2)) {
//			return true;
//		}
//		else {
//			return false;
//		}
}
class Teacher{
	private Integer teacherId;
	private String tacherName;
	public Teacher(Integer teacherId, String tacherName) {
		super();
		this.teacherId = teacherId;
		this.tacherName = tacherName;
	}
	public Integer getTeacherId() {
		return teacherId;
	}
	public String getTacherName() {
		return tacherName;
	}
	public void setTeacherId(Integer teacherId) {
		this.teacherId = teacherId;
	}
	public void setTacherName(String tacherName) {
		this.tacherName = tacherName;
	}
	@Override
	public String toString() {
		return "Teacher [teacherId=" + teacherId + ", tacherName=" + tacherName + "]";
	}
	
}

class CompareData{
	private Students student;
	private Employe employe;
	private Teacher teacher;
	
	public CompareData(Students student, Employe employe, Teacher teacher) {
		super();
		this.student = student;
		this.employe = employe;
		this.teacher = teacher;
	}

	@Override
	public boolean equals(Object obj) {
//		Down Casting Apply here
		Students std = (Students)obj;
		int id1 = std.getStdId();
		String name1 = std.getStdName();
		
//		Current Reference
		int id2 = student.getStdId();	
		String name2 = student.getStdName();
		if(id1 == id2 && name1 == name2) {
			return true;
		}
		else {
			return false;
		}
	}
}

public class Question_4 {
	public static void main(String[] args) {
		Employe emp1 = new Employe(101,"Antriksh");
		System.out.println(emp1);
		
		Teacher tec1 = new Teacher(101,"Aman");
		System.out.println(tec1);
		
		Students std1 = new Students(101,"Antriksh");
		System.out.println(std1);
		
		Students std2 = new Students(101,"Antriksh");
		System.out.println(std1);
		
		CompareData cd = new CompareData(std1, emp1, tec1);
		System.out.println(cd.equals(std2));
		

		
	}	
}
