/*
Write a program in C to add two numbers using pointers.

Test Data :

Input the first number : 5

Input the second number : 6

Expected Output :



The sum of the entered numbers is : 11 


*/

#include<stdio.h>
int main() {
    int a,b,*p=&a,*q=&b;
    printf("Enter the two number = ");
    scanf("%d %d",&a,&b);
    printf("Sum is %d",*p+*q);
return 0;    
}