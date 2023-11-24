/*
#include<stdio.h>
#include<conio.h>
#include<string.h>
void reverse( char st[10] ) //o//r st[ ] or *st
{
    char s;int i;
    st = strrev(st);
    printf("%s", st);
    //count the length of last word in string
    for(i=0;st[i]!=' ';i++);
    printf("length of last word %d",i);
}
void main()
{
char s[100];
puts("Enter the String");
gets(s);
reverse(s); //or reverse(&s);

getch();
}
*/
/*#include<stdio.h>
//#include<conio.h>
#include<string.h>
void reverse( char st[10] ) //o//r st[ ] or *st
{
    int i,l,j=0;
    l=strlen(st);
    
    //printf("%d",l);
    for(i=l-1,j;st[i]!=' ';i--,j++)
        printf("%d %c\n",i,st[i]);
    printf("length of last word %d",j);
}
int main()
{
char s[100];
puts("Enter the String");
gets(s);
reverse(s); //or reverse(&s);
return 0;
}
*/

/*#include<stdio.h>

#include<string.h>
void reverse( char st[100] ) //o//r st[ ] or *st
{
    int i,j;
    char str[100];

    for(i=0;st[i]!='\0';i++);
    //printf("%d\n",i);
    //revrese the  string 
    for(j=0;i>=0;j++) {
        str[j] = st[--i];
        //printf("%c",st[j]);
    }
    //str[j] = '\0';
    //printf("%d\n",j);
    for(j=0;j<11;j++)
        printf("%c",str[j]);

    //count the length of last word in string
    for(i=0;str[i]!=' ';i++);
    printf("length of last word %d",i);

   
}
int main()
{
char s[100];
puts("Enter the String");
gets(s);
reverse(s); //or reverse(&s);
return 0;
}
*/

#include<stdio.h>

#include<string.h>
void reverse( char st[100] ) //o//r st[ ] or *st
{
    int i,j,len;
    char str[100];
    len = strlen(st);

    for(j=0,i=len;st[i]!=' ';i--,j++);
    printf("%d",--j);   
}
int main()
{
char s[100];
puts("Enter the String");
gets(s);
reverse(s); //or reverse(&s);
return 0;
}

/*
Given a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal substring consisting of non-space characters only.



Example 1:



Input: s = "Hello World"

Output: 5

Explanation: The last word is "World" with length 5.



Example 2:

Input: s = "  fly me  to  the moon "

Output: 4

Explanation: The last word is "moon" with length 4.



Example 3:

Input: s = "luffy is still joyboy"

Output: 6

Explanation: The last word is "joyboy" with length 6.


*/