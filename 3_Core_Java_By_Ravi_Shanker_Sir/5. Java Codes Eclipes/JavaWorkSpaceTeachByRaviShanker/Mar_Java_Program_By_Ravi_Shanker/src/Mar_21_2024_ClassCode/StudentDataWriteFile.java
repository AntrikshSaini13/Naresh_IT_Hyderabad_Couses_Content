package Mar_21_2024_ClassCode;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class StudentDataWriteFile {
	public static void main(String[] args) throws IOException {
		Student students = new Student();
//		Output Stream here
		var foutput = new FileOutputStream("E:\\13-FileHandlingConcept\\Students.txt");
		var objOutput = new ObjectOutputStream(foutput);
		Scanner sc = new Scanner(System.in);
		System.out.print("How many Object you wants : ");
		int obj = sc.nextInt();
		try(foutput; objOutput; sc){
			for(int i = 1; i <= obj; i++) {
				Student std = students.getStudent();
//				write the Object into files
				objOutput.writeObject(std);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
