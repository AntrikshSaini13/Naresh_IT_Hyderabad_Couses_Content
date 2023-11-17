#include<stdio.h>
void main(){
    char s[100],*p;
    p=&s[0];
    printf("Enter the string = ");
    gets(s);
    for(;*p;p++)
        printf("%s\n",p);
}