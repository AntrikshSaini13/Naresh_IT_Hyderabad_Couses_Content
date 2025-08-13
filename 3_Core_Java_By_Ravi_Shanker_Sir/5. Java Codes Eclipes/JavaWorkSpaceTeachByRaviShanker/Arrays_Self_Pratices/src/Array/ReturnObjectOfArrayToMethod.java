package Array;

class Std{
	private int id;
	private String name;	
	public Std() {
		super();
	}
	public Std(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Std [id=" + id + ", name=" + name + "]";
	}
	
	public Std [] get() {
		return new Std[] {				
					new Std(101,"Aman"),
					new Std(102,"Antriksh"),
					new Std(103,"Aswal"),
					new Std(104,"Satyam"),
					};		
	}
}

public class ReturnObjectOfArrayToMethod {
	public static void main(String[] args) {
//		Std s1 = new Std();
		
		Std [] students = new Std().get();
		
		for(Std std : students) {
			System.out.println(std);
		}
	}
}
