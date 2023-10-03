// Write a C program to print the triangle is Scalene. Isosceles , Equilateral.

// Input as :

// Enter 3 side of triangle : 10 12 13 



// Output is : 

// Its a Scalene.



// Input as :

// Enter 3 side of triangle : 10 10 10



// Output is : 

// Its a Equilateral.

#include<stdio.h>
int main() {
    
    int a, b, c;
    printf("Entre the a b c value :");
    scanf("%d %d %d",&a,&b,&c);
    if (a==b && b==c && c == a) puts("equiv");
    else puts("scalene");
    
    
    return 0;
}