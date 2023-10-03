// 3)wap in c to check given character is consonent or vowel 


// note:-
// solve all this program without using any control statement or ternary operator.
#include<stdio.h>
void main(){
    char c;
    printf("Enter the character ");
    scanf(" %c",(int)&c);
   (65 <= c && c<= 90) || (97 <= c && c <= 122) && (c=='a'|| c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U') && printf("Vowels");
   (65 < c && c< 90) || (97 < c && c < 122) && (c!='a'|| c!='e'||c!='i'||c!='o'||c!='u'||c!='A'||c!='E'||c!='I'||c!='O'||c=='U') && printf("Consonants");
}
                                                           
