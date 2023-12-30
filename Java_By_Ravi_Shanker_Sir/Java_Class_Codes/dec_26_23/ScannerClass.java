// object create here becozof Scanner is not Static method thatsWhy

import java.util.Scanner;

public class ScannerClass{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Name of Student");
        String s1 = sc.nextLine();

        System.out.println("Name is : "+s1);

    }
}