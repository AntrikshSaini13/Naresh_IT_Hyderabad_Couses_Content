//WAP to read Employee id and Name from the keyboard.

import java.util.*;
public class ReadEmployeeData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the id Of Employee");
        int id = sc.nextInt();  // 123 \n

        System.out.println("Enter the name of Employee");
        String nameOfEmp = sc.nextLine(); // here is buffer problem

        System.out.println("The id of Employee : "+id+" The name of Employee is : "+nameOfEmp);
    }
}

// Output :

// Enter the id Of Employee
// 145
// Enter the name of Employee
// The id of Employee : 145 The name of Employee is : 
