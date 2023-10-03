// Write a C program to find the biggest number among three number by using if only.

#include<stdio.h>
int main() {
    int a, b, c;
    printf("Enter the values of a b c \n");
    scanf("%d %d %d",&a,&b,&c);
    
    
    if (a == b && b == c && c == a)puts(" a b c are equals");
    if (a == b && a > c )puts("a and b are bigger");
    if (b == c && b > a )puts("b and c are bigger");
    if (c == a && c > b )puts("a and c are bigger");
    if(a > b && a > c)printf("A is bigger");
    if(b>c && b > a) puts("B is Bigger");
    if(c>a && c>b)puts("C is Bigger");
    // else puts("C is bigger");   
    
    
}