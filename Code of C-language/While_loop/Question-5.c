// Write a C program to check if a given number is a strong number. A strong number is a positive integer in which the sum of the factorial of
//  its digits is equal to the number itself. For example, 145 is a strong number since 1! + 4! + 5! = 145. The program should prompt the user
//   to enter a positive integer and determine whether it is a strong number or not.

// Input as:

// Enter a number : 145 

// Output as:

// 145 is a strong number.

#include<stdio.h>
#include<stdlib.h>
#include<conio.h>
void main(){
    int num1, num, result,i=1,sum=0,mul;
    printf("Enter the number = ");
    scanf("%d",&num);
    num1 = num;
    while(num){
        start:
        // result=0;
        result = num%10;
        num/=10;
        // printf("%d\n",result);
        i=1;
        mul=1;
        while (i<=result)
        {
            mul = mul *i;
            // printf("%d\n",i);
            // printf("%d\n\n",mul);
            i++;
        }
        sum += mul;
    }
        // printf("%d\n",num);
        if(sum == num1){
            // system("cls");
            clrscr();
            printf("A strong number is a positive integer\n\n");
        }
        else puts("Not strong number is a positive integer\n\n");
}