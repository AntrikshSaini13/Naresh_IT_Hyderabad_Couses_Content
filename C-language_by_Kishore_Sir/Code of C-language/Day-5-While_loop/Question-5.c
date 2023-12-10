
// Q-5  write a C program to find the factorial of a given number. Take the input from the user.

// Input as :

// Enter a number : 5

// Output as :

// Factoria of 5 : 120

// Ans -> 


#include<stdio.h>
int main(){
    int num, mul=1;
    printf("Enter the number of factroial\n");
    scanf("%d",&num);
    while(num>0){
        mul*=num;num--;
    }
    printf("Factorial is %d",mul);
    return 0;
}
