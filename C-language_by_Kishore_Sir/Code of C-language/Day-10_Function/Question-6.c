// Write a program in C to add n natural numbers using a function.

// Test Data :

// Input n value : 10

// Expected Output :

// The sum of 10 natural numbers is 55

#include <stdio.h>

// Function to calculate the sum of n natural numbers
int sum(int num) {
    int sum=0,i;
    //Write Your Code Here...
    for(i=1;i<=num;i++)
        sum+=i;
    return sum;
}
int main(){
    //Write Your Code Here...
    int num;
    puts("Ente any number");
    scanf("%d",&num);
    printf("Sum of Natural Number is %d",sum(num));
    return 0;
}