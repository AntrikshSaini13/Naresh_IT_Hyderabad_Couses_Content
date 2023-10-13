// Q-4  Write a C prgram that asks the user to input an integer and reverse that number and display the reverse of that given number.

// Case-1
// -------

// Input as : 

// Enter a number : 123

// Output as : 

// Reverse of the given number is : 321

// Case -2
// ________

// Input as :

// Enter a number : 2314

// Output as : 

// Reverse of the given number is : 4132

// Ans ->

#include<stdio.h>
int main() {
    int num,sum=0;
    printf("Enter the number\n");
    scanf("%d",&num);
    while(num){
        sum = sum *10 + num % 10; num /= 10;
    }
    printf("reverse number is %d\n",sum);
    
}