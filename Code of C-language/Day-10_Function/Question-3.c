// Write a program in C to check whether a number is a prime number or not by using the function.

// Test Data :

// Input a positive number : 5

// Expected Output :

// The number 5 is a prime number.

#include <stdio.h> 
  
// Function to check prime number 
void checkPrime(int N) 
{ 
    int flag = 1; 
    for (int i = 2; i <= N / 2; i++) { 
        if (N % i == 0) { 
            flag = 0; 
            break; 
        } 
    } 
    if (flag) { 
        printf("The number %d is a Prime Number\n", N); 
    } 
    else { 
        printf("The number %d is not a Prime Number\n", N); 
    } 
    return; 
} 
int main() 
{ 
    int N;
    puts("Enter the number");
    scanf("%d",&N);
    checkPrime(N); 
    return 0;
}