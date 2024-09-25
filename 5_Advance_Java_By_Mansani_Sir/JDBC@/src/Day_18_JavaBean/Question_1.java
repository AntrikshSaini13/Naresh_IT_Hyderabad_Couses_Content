package Day_18_JavaBean;

public class Question_1 {
	private int age;
	
	// instance method
	public void setAge(int age) {
		if (age>60)
			this.age=60;
		else if (age<=18)
			this.age=18;
		else
			this.age=age;
	}

	public int getAge() {
		return age;
	}
}


