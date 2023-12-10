// Write a C program to check whether a Alphabet is vowel or consonant using Switch Case.

#include<stdio.h>

int main(){
    
    char mon;
    printf("check vovels and consonat\n");
    scanf("%c",&mon);
    
    if(mon >= 'A' && mon <= 'Z')mon+=32;
    if(mon >= 'a' && mon <= 'z')
    {
        switch(mon)
        {
        case 'a': case 'e': case 'i': case 'o': case 'u':  printf("Vowels");break;
        default :printf("Consonants");
        }
    }
    else if(mon >=0 && mon <= 9 )puts("Digits");
    else puts("Spical Character");
    return 0;
}