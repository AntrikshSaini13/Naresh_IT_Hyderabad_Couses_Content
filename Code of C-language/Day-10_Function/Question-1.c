// Write a program in C to find the square of any number using the function.

// Test Data :

// Input any number for square : 20

// Expected Output :



// The square of 20 is : 400.00



#include <stdio.h>


// Function to calculate the square of a number
double square(double num) {
    //Write Your Code Here...
    return num*=num;
}


int main()
{
    //Write Your Code Here...
    int num;
    puts("Enter the number");
    scanf("%d",&num);
    printf("Square = %.2lf",square(num));
    return 0;
}