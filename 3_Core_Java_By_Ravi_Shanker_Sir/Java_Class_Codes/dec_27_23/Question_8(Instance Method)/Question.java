// package Question_8(Instance Method);

/*Program to find out the square and cube of 
  the number by following criteria
 * 
a) If number is 0 or Negative it should return -1
b) If number is even It should return square of the number
c) If number is odd It should return cube of the number
*/

import java.util.*;

class Calculation{
    public int getSquareAndCube(int num)
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

public class Question {
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a Number :");
        int num = sc.nextInt();

        Calculation c1 = new Calculation(); //object of  calculation class becoz inside the calculation class instance method without object we cannot assecc the any instance method and instnace variavle
        
        int squareAndCube = c1.getSquareAndCube(num);
        System.out.println(squareAndCube);
        sc.close();
	}
}
