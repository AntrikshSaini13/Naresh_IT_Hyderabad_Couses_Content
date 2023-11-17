// Write a C program to print the reverse of a given String 

// Input as :

// Enter a String : NareshIT

// Output as : 

// The reverse of the String is : TIhseraN

#include<stdio.h>
int main() {
    char s[100]={"    NareshIT"}; int i;
    puts("Enter String");gets(s);
    for(i=0;s[i]!='\0';i++){
        printf("%c",s[i]);
    }
    puts("\nRverse String");
    for(;i>=0;i--){
        printf("%c",s[i]);
    }
return 0;    
}