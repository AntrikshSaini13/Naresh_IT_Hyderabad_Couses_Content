// Q-3  Write a C program to add all the natural number from 1 to n. Ask the user to give n value and print the addition value.

// Input as : 

// Enter n value : 10

// Output as :

// Sum of the natural number from 1 to 10 : 55
// Ans ->

#include<stdio.h>
int main() {
    int i=1,num,sum=0;
    printf("Enter the number\n");
    scanf("%d",&num);
    while(i<=num){
        sum += i;
        i++;
    }
    printf("Sum of the natural number from 1 to %d = %d",num,sum);
}