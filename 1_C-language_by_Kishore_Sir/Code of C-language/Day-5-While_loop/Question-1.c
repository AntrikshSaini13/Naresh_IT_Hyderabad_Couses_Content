// Q-1  Write a C program that asks the user to input a three-digit integer and calculates the sum of its digits. Using While loop.

// Input as : 

// Enter a three digit number : 123

// Output as :

// Sum of the digits : 6

// Ans->

#include<stdio.h>
int main(){
    int num, sum = 0;
    printf("Enter the number\n");scanf("%d",&num);
    while(num){
        sum += (num % 10);num/=10;
    }
    printf("Sum of three digit number %d\n",sum);
    return 0;
}