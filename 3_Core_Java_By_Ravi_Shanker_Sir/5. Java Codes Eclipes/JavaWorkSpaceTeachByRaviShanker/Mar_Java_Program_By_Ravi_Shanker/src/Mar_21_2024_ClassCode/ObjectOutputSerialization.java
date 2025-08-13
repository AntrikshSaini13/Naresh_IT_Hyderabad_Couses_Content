package Mar_21_2024_ClassCode;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.*;
public class ObjectOutputSerialization {
	public static void main(String[] args) throws IOException {
		
//		Output Stream for write the data
		var fileOutput  = new FileOutputStream("E:\\13-FileHandlingConcept\\EmployeeData.txt");
		var ObjectOutput  = new ObjectOutputStream(fileOutput);
		Scanner sc = new Scanner(System.in);
		System.out.print("How many Employee you wants : ");
		int numEmp = sc.nextInt();
		try(fileOutput; ObjectOutput; sc){
			
			for(int i = 1; i <= numEmp; i++) {
				Employee object = Employee.getEmployee();
//				here writeObject() method write the data to file 
				ObjectOutput.writeObject(object);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
