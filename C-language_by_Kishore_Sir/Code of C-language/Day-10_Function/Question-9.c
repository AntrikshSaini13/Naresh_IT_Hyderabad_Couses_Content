// Implement a function to check if two strings are anagrams of each other.



// Input:

// First string: listen

// Second string: silent



// Output:

// The strings are anagrams.



// Input:

// First string: hello

// Second string: world



// Output:

// The strings are not anagrams.



// Explanation:

// -------------------------------------------------------------



// The areAnagrams function takes two character arrays (strings) str1 and str2 as input and returns a boolean value (true if the strings are anagrams, false otherwise).



// The function first checks if the lengths of the two strings are different. If they are different, the function immediately returns false, as strings with different 
//lengths cannot be anagrams.



// The function then creates two integer arrays freq1 and freq2 of size 256 (assuming ASCII characters) to store the frequency of characters in both strings. Each element of 
//the arrays corresponds to the frequency of a character represented by its ASCII value.



// The function then populates the frequency arrays by iterating through the characters of both strings. It counts the occurrences of each character by 
//incrementing the corresponding element in the frequency array.



// After populating the frequency arrays, the function compares them to check if the strings are anagrams. If the frequency of any character in str1 differs 
//from the frequency of the same character in str2, the function returns false, as the strings cannot be anagrams.



// If the function completes the loop without finding any discrepancies in the frequency arrays, it returns true, indicating that the strings are anagrams of each other.



// The main function asks the user to input two strings and calls the areAnagrams function with the given inputs. It then prints whether the input strings are 
//anagrams or not.



#include <stdio.h>
#include <stdbool.h>
#include <string.h>

// Function to check if two strings are anagrams of each other
bool areAnagrams(char string1[], char string2[]) {
    //Write your code here....
    int i,j; char temp;
    // puts(string1);
    // puts(string2);
    // Sorting the first String 
    for(i=0;string1[i];i++)
        for(j=i+1;string1[j];j++)
            if(string1[i]>string1[j]){
                temp=string1[i];
                string1[i]=string1[j];
                string1[j]=temp;
            }
    //puts(string1);
    // Sorting the Second String 
    for(i=0;string2[i];i++)
        for(j=i+1;string2[j];j++)
            if(string2[i]>string2[j]){
                temp=string2[i];
                string2[i]=string2[j];
                string2[j]=temp;
            }
    //puts(string2);
    //Compare the string
    for(i=0;string1[i];i++)
        if(string1[i]!=string2[i])
            return false;
            
    return true;
}

int main() {
   //Write your code here....
    char str1[100],str2[100];
    puts("Enter the first string");
    gets(str1);
    puts("Enter the second string");
    gets(str2);
    if(areAnagrams(str1,str2)) puts("Anagram");
    else puts("Not Anagram");
    return 0;
}