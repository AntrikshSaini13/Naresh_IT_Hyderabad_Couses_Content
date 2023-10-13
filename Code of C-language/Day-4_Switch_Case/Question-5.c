// Write a C program to check the number is even or odd by using Switch Case.
#include<stdio.h>

int main(){
    int num;
    printf("Enter the  number for check odd even\n");
    scanf("%d",&num);
    switch(num%2)
    {
        case 1:printf("Odd number %d",num);break;
        case 0:printf("Even number %d",num);break;
        default:puts("invalid");
    }
    return 0;
}