// Write a program in C to check if a given number is even or odd using the function.

// Test Data :

// Input any number : 5

// Expected Output :

// The entered number is odd. 

#include <stdio.h>

 // Function to check even or odd
 void odd_or_even(int num)
{
    //Write Your Code Here..
    printf(num%2?"odd":"even");
}
int main()
{
    int num;
    printf("enter the number:");
    scanf("%d",&num);
    odd_or_even(num);
   // printf("the entered number is odd",even(num));
    return 0;
}