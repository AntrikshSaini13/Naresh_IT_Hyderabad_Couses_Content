// Write a c program to make the reverse of a number without using if 
// and ternary only by the use of conditional operator ?

// Input as : 123
// Output as : 321
#include<stdio.h>
void main(){
    int num1,num2,num3;
printf("enter the valve = ");
scanf("%d",&num1);
num2 = num1%10*100 + num1/10%10 * 10 + num1/100 ;
printf("%d",num2);


}