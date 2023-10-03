// Develop a C program that reads a character from the user and prints "Vowel" if the character is a vowel (a, e, i, o, u or their uppercase equivalents), and "Consonant" if it's a consonant.



// Input as : 

// Enter a character : I



// Output as :

// Vowel

#include <stdio.h>

int main() {
    //Write Your Code Here...
    char ch;
    printf("Enter the value \n");
    scanf("%c",&ch);
    if('a' == ch || 'e'==ch || 'i' == ch || 'o' == ch || 'u' == ch || 'A' == ch || 'E'==ch || 'I' == ch || 'O' == ch || 'U' == ch)
    {
        printf("vowels");
    }
    else{
        printf("Consonats");
    }

    return 0;
}