// Write a C program to check whether a number is divisible by 5 and 11 or not.



// Input as : 

// Enter a number : 55



// Output as : 

// 55 is divisible by both 5 and 11

#include <stdio.h>

int main() {
    float number;

    //Write Your Code Here...
    printf("Enter the  number \n");
    scanf("%f",&number);
    if((int)number % 5 == 0 && (int)number % 11 == 0){
        printf("55 is divisible by both 5 and 11");
    }
    if((int)number % 5 != 0 && (int)number % 11 != 0){
        printf("55 is not divisible by both 5 and 11");
    }
    return 0;
}