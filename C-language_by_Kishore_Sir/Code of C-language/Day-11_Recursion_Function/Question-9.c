/*
Write a C program to check whether a given string is a palindrome or not using recursion. 

Test Data :

Input a word to check for palindrome : mom

Expected Output :

The entered word is a palindrome.  
*/


#include <stdio.h>
#include<stdlib.h>
int j=0;
char str[100];

void ispalindrome(char string[], int start, int end);
void ispalindrome(char string[], int start, int end){

    //printf("string ->%s  %s  %d  %d\n",string, str , start, end);
    int index = end;
    for(j=0;index>=0;j++) str[j] = string[--index];
    if(start!=end) ispalindrome(string, ++start, end);
    //printf("%s\n", str);
    }

int main(){
    system("cls");
    char string[100];
    int start=0, end;
    puts("Enter the name ");
    gets(string);
    system("cls");
    for(end=0;string[end];end++);
    //printf("length - > %d\n",end);
    ispalindrome(string, start, end);
   
    puts("Before Rverse String");
    puts(string);
    //reverse string
    puts("After Rverse String");
    puts(str);
    for(end=0;string[end];end++)
        if(string[end] != str[end]){
            puts("\nNot Palindrome");
            return 0;
        }
    puts("\nPalindrome");
    return 0;

}