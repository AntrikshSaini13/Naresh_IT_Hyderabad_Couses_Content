package Feb_12_2024_ClassCode;

abstract class Father1{
	public abstract void father();
}

class Doughter extends Father1{
	@Override
	public void father() {
		System.out.println("Doughter");
	}
}

public class Question_4 {
	public static void main(String[] args) {
		Father1 f1;  // up-Casting
		f1 = new Doughter();
		f1.father();
	}
}


//Output : Doughter