// Write a C program to check if a given number is a palindrome. A palindrome is a number that remains the same when its digits are reversed. For example, 121, 454 and 767 are palindromic numbers. The program should prompt the user to enter a positive integer and determine whether it is a palindrome or not.

// Input as:

// Enter a number : 121 

// Output as:

// 121 is a Palindrome number.

#include<stdio.h>
int main(){
    int num ,sum=0,num1;
    printf("Enter the number");
    scanf("%d",&num);
    num1 = num;
    while(num)
    {
        sum = sum * 10 + num%10;num/=10;
    } 
    if(sum == num1) printf("Palindrome number %d",sum);
    else printf("not");
    return 0;
}