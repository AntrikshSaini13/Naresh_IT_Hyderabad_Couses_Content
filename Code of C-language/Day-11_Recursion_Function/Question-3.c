/*
Write a program in C to print the Fibonacci Series using recursion. >

Test Data :

Input number of terms for the Series (< 20) : 10

Expected Output:

 Input number of terms for the Series (< 20) : 10                                
 The Series are :                                                                
 1  1  2  3  5  8  13  21  34  55
*/

#include<stdio.h>
int a=-1,b=1,c;
int fibSerice(int num1, int num2);
int fibSerice(int num1, int num2){
    c=a+b;
    if(c!=0) printf("%-4d",c);
    a=b;
    b=c;
    if(num1!=num2) fibSerice(num1+=1,num2);
    return 0;
}
int main() 
{
    int num1=0,num2;
    puts("Enter the number");
    scanf("%d",&num2);
    fibSerice(num1, num2);
    return 0;
}