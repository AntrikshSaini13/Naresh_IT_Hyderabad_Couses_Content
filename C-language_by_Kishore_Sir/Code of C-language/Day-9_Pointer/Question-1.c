/*Write a program in C to find the maximum number between two numbers using a pointer.

Test Data :

Input the first number : 5

Input the second number : 6

Expected Output :



6 is the maximum number. */
#include<stdio.h>
int main() {
    int a,b,*p,*q;
    p=&a;
    q=&b;
    printf("Enter the two number = ");
    scanf("%d%d",*&p,*&q);
    puts((*p>*q) ? "max":"min");
return 0;    
}