
/*
Write a program in C to find the sum of digits of a number using recursion. >

Test Data :

Input any number to find sum of digits: 1234

Expected Output:

The Sum of digits of 1234 = 10 

*/

#include <stdio.h>
int sum=0,digit;
int sumOfDigit(int num);
int sumOfDigit(int num){
    printf("%d\n",num);
    digit=num%10;
    sum+=digit;
    if(num!=0) sumOfDigit(num/=10);
    
    //printf("Sum -> %d\n",sum);
    return sum;
}
int main()
{
    int num2;
    puts("Enter the three above digit number");
    scanf("%d",&num2);
    //sumOfDigit(num2);
    printf("sum of digit -> %d",sumOfDigit(num2));
    return 0;
}