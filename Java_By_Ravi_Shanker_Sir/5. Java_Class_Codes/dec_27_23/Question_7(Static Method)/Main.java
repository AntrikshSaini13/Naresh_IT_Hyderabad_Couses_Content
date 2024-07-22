// package Question_7;

/*Program to find out the square and cube of 
  the number by following criteria
 * 
a) If number is 0 or Negative it should return -1
b) If number is even It should return square of the number
c) If number is odd It should return cube of the number
*/

import java.util.Scanner;

class Calculation{
    public static int getSquareAndCube(int num)
  {
	  if(num==0 || num<0)
	  {
		  return -1;
	  }
	  else if(num %2 ==0)
	  {
		  return (num*num);
	  }
	  else
	  {
		  return (num*num*num);
	  }
  }
}

public class Main {
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a Number :");
        int num = sc.nextInt();
        
        int squareAndCube = Calculation.getSquareAndCube(num);
        System.out.println(squareAndCube);
	}
}
