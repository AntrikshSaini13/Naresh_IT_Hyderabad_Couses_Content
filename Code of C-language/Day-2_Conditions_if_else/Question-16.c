// Write a c program to round of the number to it's next  

// multiplication of 10 if the right side of the number is 

// greater than 5.



// if the right side is less than 5 round off to it's previous 

// multiplication of 10.



// if the right side is zero no need to round off print the number 

// as it is.



// Input as : - 27

// Output as: - 30



// Input as :- 42

// Output as:- 40



// Input as :- 50

// Output as:- 50

#include<stdio.h>
int main(){
    int num, result1, result2 ;
    printf("Enter the value\n");
    scanf("%d",&num);
    
    result1 = num % 10;
    result2 = num / 10;
    if (result1 >= 5){
        printf("the next number is %d",++result2 * 10);
    }
    else if (5 > result1 && result1 >= 1){
        printf("The previous number is %d",--result2 * 10);
    }
    else
    {
        printf("No need of round off = %d",num);
    }
     return 0;
}