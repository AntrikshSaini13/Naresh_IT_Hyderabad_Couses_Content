/*
Write a program in C to add numbers using call by reference.

Test Data :

Input the first number : 5

Input the second number : 6

Expected Output :



 The sum of 5 and 6 is 11


*/

#include<stdio.h>
void sum(int *a,int *b){
    *a+=*b;
}

void main() {
    int a,b;
    printf("Enter the number = ");
    scanf("%d %d",&a,&b);
    sum(&a,&b);   
    printf("Sum is %d",a);
}