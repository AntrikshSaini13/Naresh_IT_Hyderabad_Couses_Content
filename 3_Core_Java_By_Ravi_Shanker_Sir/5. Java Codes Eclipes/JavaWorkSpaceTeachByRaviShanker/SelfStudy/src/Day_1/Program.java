package Day_1;

public class Program {
	public static void main(String [] arg){
		Student st = new Student();
		st.setStudentId(1);
		st.setStudentName("Aman");
		System.out.println(st.getStudentId());
		System.out.println(st.getStudentName());
		System.out.println(st);
	}
}
