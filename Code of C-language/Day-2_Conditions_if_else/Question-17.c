// Write a C program to enter month number between(1-12) and print number of days in month using if else. How to print number of days in a given month using if else in C programming. Logic to find number of days in a month in C program. 



// Input as :

// Enter month number (1-12): 4

// Output as :

// Number of days: 30

#include<stdio.h>
int main(){
    int mounth;
    
    printf("Enter the number of month\n");
    scanf("%d",&mounth);
    
    if(mounth == 4 || mounth == 6 || mounth == 9 ||mounth == 11){
        printf("These mounth is 30 Days");
    }
    else if (mounth == 1 ||mounth == 3 || mounth == 5 ||mounth == 7 ||mounth == 8 || mounth == 10 || mounth == 12){
        printf("These mounth is 30 Days");
    }
    else if (mounth == 2){
        printf("These mounth is 28 and 29 Days");
    }
    else{
        printf("Invalid mount Plz Try Again");
    }
    
     return 0;
}