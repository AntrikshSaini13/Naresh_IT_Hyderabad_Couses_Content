// //WAP to read the gender [M/F] from the user

import java.util.*;
public class ReadGender {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//Object Create of Scanner is Predefine Class of java.util(Non Static)

        System.out.println("Enter The Gender of Student");
        char  Gender = sc.next().charAt(0);

        System.out.println("The Gender is : "+Gender);
    }
}