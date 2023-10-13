// Write a C program to find the maximum between two numbers using Switch statement.

#include<stdio.h>

int main()
{
    int num1, num2;
    printf("Enter the Two Number for check Which greater \n");
    scanf("%d %d",&num1,&num2);
    switch(num1 > num2)
    {
        case 1: printf("number 1 is greater %d",num1); break;
        default : printf("number 2 is greater %d",num2);
    }
    return 0;
}