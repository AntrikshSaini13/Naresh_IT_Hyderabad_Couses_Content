// Write a C program to count the Count the vowel, Consonant, Digit and Special Character in a given String .

// Input as : 

// Enter a String : Nareshit @123

// Output as :

// Vowel count is : 3

// Consonant count is : 5

// Digit count is : 3

// Special Character count is : 1


#include<stdio.h>
int main() {
   char s[100];
   int i,v,c,d,sp;
   puts("Enter the  string");scanf("%s",s);
   puts(s);
   for(v=0,c=0,i=0,d=0,sp=0;s[i]!='\0';i++){
       if((s[i]>='a' && s[i]<='z') || (s[i]>='A' && s[i]<='Z')){
           if('a'==s[i] || s[i]=='e' || s[i]=='i' || s[i]=='o' || s[i] == 'u' ||s[i]=='A' || s[i]=='E' || s[i]=='I' || s[i]=='O' || s[i]=='U') v++;
           else c++;
       }
       else if(s[i]>=0 || s[i]<=9) d++;
       else sp++;
   }
   printf("number of character = %d\nvowels = %d\nConsonant = %d\nDigit  = %d\nSpecial Character = %d",v+c+d+sp,v,c,d,sp);
return 0;    
}