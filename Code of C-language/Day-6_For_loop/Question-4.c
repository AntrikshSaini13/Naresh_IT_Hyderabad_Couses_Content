// Write a C program to display the sum of n terms of even natural numbers.

// Test Data :

// Input number of terms : 5

// Expected Output :

// The even numbers are :2 4 6 8 10

// The Sum of even Natural Number upto 5 terms : 30

#include<stdio.h>
#include<math.h>
#include<stdlib.h>
void main(){
    int num,i,sum;
    printf("Enter the number\n");
    scanf("%d",&num);
    system("cls");
    printf("Even number is\n");
    for(i=1,sum=0;i<=num*2;i++)
        {
            if(i%2==0)
            {
                printf("%-4d",i);
                sum+=i;
            }
        }
    printf("\nSum of even numer is %d",sum);
}