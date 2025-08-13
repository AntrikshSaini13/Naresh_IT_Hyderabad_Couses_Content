package Jan_31_2024_Lab_Question;



import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

class ReadWrite{
	private String name;
	private int id;
	private int salary;
	
	public ReadWrite() {
		super();
	}
	
	@Override
	public String toString() {
		return "ReadWrite [name=" + name + ", id=" + id + ", salary=" + salary + "]";
	}
	
	@SuppressWarnings("deprecation")
	public void readFile() throws IOException{
		var file = new File("E:\\13-FileHandlingConcept\\Own.txt");
		if(file.exists()) {
			var fInput = new FileInputStream("E:\\13-FileHandlingConcept\\Own.txt");
			var dInput = new DataInputStream(fInput);
		
			try(fInput; dInput) {
				
				id = dInput.readInt();
				salary = dInput.readInt();	
				name = dInput.readLine();		
				System.out.println("\nMy name is :"+name+" My ID is : "+id+" and Salary : "+salary);
				System.out.println("Read the data in file Succesfully");
			} 
			catch (Exception e) {
				System.out.println(e);
			}
		}
		else {
			System.out.println("\nFile is not here Please Create the file");
		}
	}
	
	public void writeFile(String name, int id, int salary) throws IOException {
		this.id=id;
		this.salary = salary;
		this.name = name;
		var fOutput = new FileOutputStream("E:\\13-FileHandlingConcept\\Own.txt");
		var dOutput = new DataOutputStream(fOutput);
		try(fOutput; dOutput) {			
			dOutput.writeInt(id);
			dOutput.writeInt(salary);
			dOutput.writeBytes(name);
			System.out.println("\nWrite the data in file Succesfully");
		} 
		catch (Exception e) {
			System.out.println(e);
		}
	}
	public void deleteFile() {
		var file = new File("E:\\13-FileHandlingConcept\\Own.txt");
		file.delete();
		System.out.println("\nDelete file Succesfully\n");
	}
	
}

public class Question_2 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ReadWrite rw = new ReadWrite();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Write, Read and Delete the data from the file for Enter ('Write' and 'Read' and 'Delete') : ");
		char ch = sc.next().charAt(0);
		if(ch == 'R' || ch == 'r' ) {
			rw.readFile();
//			System.out.println(rw);
		}
		else if(ch == 'W' || ch == 'w') {
			System.out.print("Enter the name : ");
			String name = sc.nextLine();
			name = sc.nextLine();
			System.out.print("Enter the Id : ");
			int id = sc.nextInt();
			System.out.print("Enter the Salary : ");
			int salary = sc.nextInt();
			
			rw.writeFile(name, id, salary);
			System.out.println(rw);
		}
		else if(ch == 'd' || ch == 'D') {
			rw.deleteFile();
		}		
	}	
}