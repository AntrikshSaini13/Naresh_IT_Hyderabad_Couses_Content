// Write a C program to sort the string data and print it.

// Input as : 

// Enter a String : apple

// Output as : 

// After Sorting the String is : aelpp

#include<stdio.h>
int main() {
    char s[100];
    int i;
    printf("Enter the strings\n");
    gets(s);
    printf("%c",s[0]);
    // if(s[i-1]==' ');
    for(i=1;s[i]!='\0';i++);
    for(;i>1;) {
        printf("%c",s[--i]);
    }
return 0;    
}
