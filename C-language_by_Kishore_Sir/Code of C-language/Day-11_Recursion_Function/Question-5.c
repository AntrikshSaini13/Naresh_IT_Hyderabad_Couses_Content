
/*
Write a program in C to find the Factorial of a number using recursion.

Test Data :

Input a number : 5

Expected Output:

The Factorial of 5 is : 120
*/

#include<stdio.h>
int mul=1;
int factorialOfNum(int num1, int num2);
int factorialOfNum(int num1, int num2){
    mul*=num1;
    if(num1!=num2) factorialOfNum(num1+=1,num2);
    //printf("%d",mul);
    return mul;
}
int main()
{
  int num1=1, num2;
  puts("Enter the any number and find the factorial of ");
  scanf("%d",&num2);
  printf("factorial is -> %d",factorialOfNum(num1, num2));
  return 0;
}