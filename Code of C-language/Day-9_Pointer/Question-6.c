/*
Write a program in C to calculate the length of a string using a pointer.

Test Data :

Input a string : NareshIt26

Expected Output :



The length of the given string NareshIt26                                   

is : 10  


*/
#include<stdio.h>
int main() {
    char str[100],*p;
    p=&str;
    puts("Enter the string");
    scanf("%s",str);
    puts(p);
    for(;*p;p++);
    printf("string '%s' length is %d",str,p-str);
return 0;    
}