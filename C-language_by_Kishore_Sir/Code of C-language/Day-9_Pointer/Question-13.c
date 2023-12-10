#include <stdio.h>
#include <stdbool.h>
#include <string.h>

// Function to check if a given string is a palindrome
char isPalindrome(char *str) {
    int i,j;
    char st[100];
    //puts("In palindrome function");
    //puts(str);
    for(i=0;str[i];i++);
    
    for(j=0;i>0;j++)
        st[j]=str[--i];
    for(i=0;str[i];i++){
        if(st[i]!=str[i])
            return false;
    }
    return true;
}

int main() {
    //Write your code here....
    char s[100];
    puts("Enter the string");
    gets(s);
    if(isPalindrome(s)) puts("Palinndrone");
    else puts("Not Palindrone");
    return 0;
}