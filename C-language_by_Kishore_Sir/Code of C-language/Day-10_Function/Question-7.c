// Implement a function to check if a given string is a palindrome.

// Input: radar

// Output: The string is a palindrome.



// Input: hello

// Output: The string is not a palindrome.



// Explanation:

// ----------------------------------------------------------------------



// The isPalindrome function takes a character array (string) str as input and returns a boolean value (true if the string is a palindrome, false otherwise).



// The function uses the strlen function from the <string.h> library to determine the length of the input string str.



// Two integer variables, start and end, are initialized to 0 and len - 1, respectively. len is the length of the string.



// The function uses a while loop that runs as long as start is less than end.



// Inside the loop, the function compares the characters at positions start and end in the string. If the characters don't match, 
//it immediately returns false, indicating that the string is not a palindrome.



// The loop continues until start becomes greater than or equal to end, at which point the entire string has been checked for palindrome properties.



// If all characters match during the loop iterations, the function returns true, indicating that the string is a palindrome.



// The main function asks the user to input a string and calls the isPalindrome function with the given input. It then prints whether the 
//input string is a palindrome or not.





#include<stdio.h>
int isplindrome(char str[100]);
int isplindrome(char str[100]){
    int i, j;char str1[100];
    //puts(str);
    for(i=0; str[i]!='\0'; i++);
    //printf("last no %d\n", i);
    for(j=0;i>0;j++){
        str1[j]=str[--i];
        printf("%d %d\n",j,i);
    }
    str1[j]='\0';
    for(j=0;str[j];j++){
        if(str1[j]!=str[j]){
            puts("Not plindrome");
            return 0;
        }
    }
    printf("Plindrome");
}
int main(){
    char str[100];
    puts("Enter the string");
    gets(str);
    isplindrome(str);
    return 0;
}