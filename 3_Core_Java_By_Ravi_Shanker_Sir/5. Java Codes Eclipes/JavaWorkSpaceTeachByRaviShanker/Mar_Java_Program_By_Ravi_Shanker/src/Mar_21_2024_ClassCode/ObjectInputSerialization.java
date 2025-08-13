package Mar_21_2024_ClassCode;

import java.io.*;

public class ObjectInputSerialization {
	public static void main(String[] args) throws IOException, ClassNotFoundException{
//		Input Stream read the data to file
		var fileInput = new FileInputStream("E:\\13-FileHandlingConcept\\EmployeeData.txt");
		var ObjectInput = new ObjectInputStream(fileInput);
		try(fileInput; ObjectInput) {
			Employee  getObjData = null;
			while((getObjData = (Employee) ObjectInput.readObject()) != null) {
				System.out.println(getObjData);
			}
		} 
		catch (Exception e) {
			System.err.println("File ended :"+e);
		}
	}
}
