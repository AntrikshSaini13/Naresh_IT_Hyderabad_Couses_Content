package Feb_09_2024_ClassCode;

class Coustomer{
}


public class Question_1 {
	public static void main(String[] args) {
		Coustomer c = new Coustomer();
		System.out.println(c);//Feb_09_2024_ClassCode.Coustomer@372f7a8d because of toString method internally contain getclass(),getName() and hashCode()
		}
}


//Output:Feb_09_2024_ClassCode.Coustomer@372f7a8d
