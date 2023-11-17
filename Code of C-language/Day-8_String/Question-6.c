// Write a c program to check the String is Palindrome  or Not 

#include<stdio.h>
int main()
{
    char s1[100],s2[100];
    int i,j;
    puts("Enter the String = ");scanf("%s",s1);
    for(i=0;s1[i]!='\0';i++);
    for(j=0;i>0;j++) s2[j]=s1[--i];
    s2[j]='\0';
    // puts(s2);
    for(j=0;s2[i]!='\0';j++)
    {
        for(i=0,j=0;s1[i]!='\0';i++,j++){
            if(s1[i]==s2[j]);
            else {
                puts("String  not Palindrome");
                return 0;
                }
        }
    }
    printf("String is Palindrome");
    return 0;
}