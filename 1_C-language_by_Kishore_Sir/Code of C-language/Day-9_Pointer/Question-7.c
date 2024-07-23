/*
Write a program in C to count the number of vowels and consonants in a string using a pointer.

Test Data :

Input a string: string

Expected Output :



Number of vowels : 1                                             

Number of constant : 5
*/
#include<stdio.h>
int main() {
    char str[100],*p;int v=0, c=1;
    p=&str[0];
    puts("Enter the string");
    scanf("%s",str);
    puts(p);
    for(;*p;p++)
    {
        if(*p == 'a'|| *p == 'e' || *p == 'i' || *p =='o' || *p == 'u') v++;
        else c++;
    }
    printf("number of vowels %d\nNumber of constant %d\n",v,c);
return 0;    
}