// package Java_Lab_Tasks.question_1;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number :");
        int num = sc.nextInt();

        System.out.println(EvenNumber.getEvenNumber(num));
    }
}
