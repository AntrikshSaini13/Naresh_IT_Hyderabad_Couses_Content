package Mar_21_2024_ClassCode;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class StudentDataReadFile {
	public static void main(String[] args) throws IOException,ClassNotFoundException {
//		Input Stream here Read the data to file
		var fInput = new FileInputStream("E:\\13-FileHandlingConcept\\Students.txt");
		var objInput = new ObjectInputStream(fInput);
		try(fInput; objInput){
			Student getStudentData;
//			read the data to the file
			while((getStudentData =(Student) objInput.readObject()) != null) {
				System.out.println(getStudentData);
			}
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}
