// Write a C program to find the biggest number between three number using the function.

// Test Data :

// Input three positive number : 13 31 19

// Expected Output :

// The biggest number is 31.

#include <stdio.h>
void MaxNum(int , int , int );
// Function to find the maximum of three numbers
void MaxNum(int a, int b, int c) {
    //Write Your Code Here...
    if(a>b&&a>c) puts("A is Bigger");
    else if(b>a&&b>c) puts("B is Bigger");
    else if(c>a&&c>b) puts("C is Bigger");
    else if(a>c&&a==b) puts("A and B are equal");
    else if(b>a&&b==c) puts("B and C are equal");
    else if(c>b&&c==a) puts("A and C are equal");
    else if (a == b && b == c && c == a) puts("Both are equal");
    else puts("I dont know");
}
int main(){
    //write Your Code Here...
    int num1, num2, num3;
    puts("Enter the three number plz");
    scanf("%d %d %d",&num1,&num2,&num3);
    MaxNum(num1,num2,num3);
    return 0;
}