// Write a C program to round of a number to it's previous multiplication of 10?
// For example :-
// Input as:- 35
// Output as: 30
// Input as :- 52
#include<stdio.h>
void main(){
    int var1,div;
    printf("Enter the any number = ");
    scanf("%d",&var1);
    div = var1 / 10 * 10;
    
    printf("Value is = %d",div);
}