// Q-2  Write a C program that asks the user to input an integer and count the digts and print the count of the digits.

// Input as : 

// Enter a number : 546

// Output as :

// Count of the digits is : 3

// Ans

#include<stdio.h>
int main(){
    int num,i=0;
    printf("Enter the number \n");
    scanf("%d",&num);
    while(num){
        i++;
        num/=10;
    }
    printf("Number of digit is %d",i);
    
    return 0;
}