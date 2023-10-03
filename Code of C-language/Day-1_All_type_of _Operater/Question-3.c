// Write a c program to check number is even or not without using if and ternary 
// only by the use of conditional operator ?

// Input as 4
// Output as even 
#include<stdio.h>
void main(){
    int var1,var2;
    printf("Enter the number check is even or not");
    scanf("%d",&var1);
    ((var1 % 2 == 0 ) && printf("even"))||printf("odd");
    // printf("%d",var2);

}