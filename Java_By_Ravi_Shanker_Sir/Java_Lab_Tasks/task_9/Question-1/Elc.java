// Q16) WAP in java to print all even numbers from 1 - 100

// ECL -> Executable Logic class here is Main Method 
import java.util.*;
public class Elc{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number");
        int num = sc.nextInt();

        System.out.println("Even Number is");
        for(int i=1,j=1; i<=num*2; i++){
            if(EvenNum.getEvenNum(i)== true){
                System.out.println(j+"->"+i);
                j++;
            }
        }
    }
}

