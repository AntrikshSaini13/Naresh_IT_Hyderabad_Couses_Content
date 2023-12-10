// Write a c Program to check whether two given strings are anagram of each other or not.

// input 1:- listen

// input 2:- silent

// this are anagram String
// ______

// input 1:- Jack

// input 2:- Jake

// this is not are anagram String

#include<stdio.h>
int main()
{
    char s1[100],s2[100];
    int i,j,count=0;
    printf("Enter the String 1 = ");scanf("%s",s1);
    printf("Enter the String 2 = ");scanf("%s",s2);
    for(i=0;s1[i]!='\0';i++)
    {
        for(j=0;s2[j]!='\0';j++){
            if(s1[i]==s2[j]){
                count++;
                break;
            }
        }
    }
    if(i==count)puts("this are anagram String");
    else puts("this is not are anagram String");
    return 0;
}
