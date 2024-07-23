// Write a c program to check the number is divisible by 5 without using if 
// and ternary only by the use of conditional operator ?

// INPUT AS 10
// OUTPUT AS  10 is divisible by 5
#include<stdio.h>
void main(){
    int var1;
    printf("Enter the number check is divisible by = ");
    scanf("%d",&var1);
    ((var1 % 5 == 0 ) && printf("yes"))||printf("no");
    // printf("%d",var2);

}