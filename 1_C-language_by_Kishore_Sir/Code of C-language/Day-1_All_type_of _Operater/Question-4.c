// Write a c program to check the number is divisible by both 2 and 3 without using if 
// and ternary only by the use of conditional operator ?

// INPUT AS 6
// OUTPUT AS  6 is divisible by both 2 and 3 
#include<stdio.h>
int main(){
    int var1;
    printf("Enter the any number = ");
    scanf("%d",&var1);
    ((var1 % 2 == 0 && var1 % 3 == 0) && printf("divisable by 2 and 3")) || printf("Not divisable");
    return 0;
}