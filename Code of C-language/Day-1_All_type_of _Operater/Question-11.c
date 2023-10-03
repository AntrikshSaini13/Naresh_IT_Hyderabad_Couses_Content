// Write a c program to convert Celsius to Fahrenheit
// and Fahrenheit to Celsius :
// Formula :-
// Fahrenheit to Celsius 
// --------------------------
// Cels=(farh-32)*5/9;
#include<stdio.h>
void main()
{
    float Fahrenheit;
    printf("Enter the values - ");
    scanf("%f",&Fahrenheit);
    printf("%.2f%c Fahrenheit is %.2f%c",Fahrenheit,248,(Fahrenheit-32)*5/9,248);
}