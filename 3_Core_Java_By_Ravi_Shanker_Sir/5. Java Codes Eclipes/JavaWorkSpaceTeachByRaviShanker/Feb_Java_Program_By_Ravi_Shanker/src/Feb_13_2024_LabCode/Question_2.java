package Feb_13_2024_LabCode;

abstract class Book{
	String title;
	public abstract void setTitle (String title);
	
	public String getTitle() {
		return null;
	}
}

class MyBook extends Book{
	
	@Override
	public void setTitle (String title) {
		super.title = title;
	}
	
	@Override
	public String getTitle() {
		return title;
	}
}

public class Question_2 {
	public static void main(String[] args) {
	Book b1 = new MyBook();
	b1.setTitle("A tale of two cities");
	System.out.println("The title of my book is : "+b1.getTitle());
}
}