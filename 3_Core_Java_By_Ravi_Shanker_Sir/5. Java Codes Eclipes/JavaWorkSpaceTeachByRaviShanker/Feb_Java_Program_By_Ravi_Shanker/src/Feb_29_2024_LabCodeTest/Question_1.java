package Feb_29_2024_LabCodeTest;

import java.util.function.*;

record User(String uName, String uPassward) {
	
	@Override 
	public boolean equals(Object obj){
		String name1 = this.uName;
		String passward1 = this.uPassward;
		
		User u = (User)obj;
		String name2 = u.uName;
		String passward2 = u.uPassward;
		if (name1 == name2 && passward1 == passward2) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
public class Question_1 { 
		public static void main(String[] args) {
			BiPredicate <User,User> biPre = (a,b) -> a.equals(b);
			
			System.out.println("Compare the User Name and Passward : "+biPre.test(new User("Antriksh","123"),new User("Antriksh","123")));
		}
}
