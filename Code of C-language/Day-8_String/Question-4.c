// Write a C program to check is the String contains any vowel or not.

// Input as : 

// Enter a String : Apple

// Output as : 

// This String contains vowel.

// Input as : 

// Enter a String : Rhythm

// Output as : 

// There is no vowel present in this String.

#include<stdio.h>
int main() {
   char s[100];
   int i,v;
   puts("Enter the  string");scanf("%s",s);
   puts(s);
   for(v=0,i=0;s[i]!='\0';i++){
       if((s[i]>='a' && s[i]<='z') || (s[i]>='A' && s[i]<='Z')){
           if('a'==s[i] || s[i]=='e' || s[i]=='i' || s[i]=='o' || s[i] == 'u' ||s[i]=='A' || s[i]=='E' || s[i]=='I' || s[i]=='O' || s[i]=='U') v++;
       }
    //   else if(s[i]>=0 || s[i]<=9) d++;
    //   else sp++;
   }
   if(v)puts("This strings contains vowels");
   else puts("There is no vowel present in this String.");
return 0;    
}