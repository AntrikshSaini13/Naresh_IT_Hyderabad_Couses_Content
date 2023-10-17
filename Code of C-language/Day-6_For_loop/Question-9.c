// Write a C program to check the given number is perfect number or not. A perfect number is a positive integer that is equal to the sum of its proper divisors (excluding itself). 

// Input as :

// Enter a number :28

// Output as :

// 28 is a Perfect Number

#include<stdio.h>  
int main()  
{  
int num, rem, sum = 0, i;  
printf("Enter a number\n");  
scanf("%d", &num);      
for(i = 1; i < num; i++)  
    {  
        rem = num % i;  
        if (rem == 0)  
            {  
                sum = sum + i;  
            }  
    }  
if (sum == num)  
    printf("%d is a Perfect Number",num);  
else  
    printf("%d is not a Perfect Number",num);  
    
return 0;
}