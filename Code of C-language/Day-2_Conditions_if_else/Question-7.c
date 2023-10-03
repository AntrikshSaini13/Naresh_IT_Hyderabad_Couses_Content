// Develop a C program that takes an integer input and checks whether it is even or odd. Print "Even" if it's even, and "Odd" if it's odd.



// Input as : 

// Enter a Integer : 20



// Output as : 

// Even

#include <stdio.h>
int main() {
    int num ;
    printf("Enter the number = ");
    scanf("%d",&num);
    
    if(num % 2 == 1){
        printf("Odd");
    }
    if(num % 2 == 0)
    {
        printf("Even");
    }
return 0;
}