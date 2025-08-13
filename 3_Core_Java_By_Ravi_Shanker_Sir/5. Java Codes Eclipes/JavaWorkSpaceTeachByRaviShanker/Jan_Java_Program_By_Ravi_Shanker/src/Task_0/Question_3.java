package Task_0;

//Q3) Write a program to find out the area of circle by taking the value
//from Command line arguments

public class Question_3 {
	public static void main(String[] args) {
		int radius = Integer.parseInt(args[0]);
		final float py= 3.14F;
		float area = 2*py*radius;
		System.out.println("The area of circle is "+area);
	}
}


//Apply for Command Line Argunment 
//javacspacefilename.java
//javaspacefilename