// Write a c program to convert Celsius to Fahrenheit
// and Fahrenheit to Celsius :
 
// Formula :-
// Celsius to Fahrenheit
// --------------------------
// Celsius to Fahrenheit: (°C × 9/5) + 32 = °F
#include<stdio.h>
void main()
{
    float celsius;
    printf("Enter the value of celsius = ");
    scanf("%f",&celsius);
    printf("%f%c Celsius is %.2f%c Fahrenheit",celsius,248,celsius*1.8 + 32,248);
}