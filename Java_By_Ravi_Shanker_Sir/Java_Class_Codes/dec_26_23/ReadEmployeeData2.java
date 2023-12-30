
import java.util.*;
public class ReadEmployeeData2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the id Of Employee");
        int id = sc.nextInt();  // 123 \n

        System.out.println("Enter the name of Employee");
        String nameOfEmp = sc.nextLine(); 
        nameOfEmp = sc.nextLine();// this line solve the buffer problem 

        System.out.println("The id of Employee : "+id+" The name of Employee is : "+nameOfEmp);
    }
}
