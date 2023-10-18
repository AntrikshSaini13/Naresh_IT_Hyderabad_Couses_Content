// Write a program in C to find the sum of the series 1 +11 + 111 + 1111 + .. n terms.

// Test Data :

// Input the number of terms : 5

// Expected Output :

// 1 + 11 + 111 + 1111 + 11111

// The Sum is : 12345

#include<stdio.h>
#include<math.h>
#include<stdlib.h>
void main(){
    int num,i,sum,j;
    printf("Enter the number\n");
    scanf("%d",&num);
    system("cls");
    // printf("Even number is\n");
    for(i=1,j=1,sum=0;i<=num;i++)
        {
            j*=11;
            printf("%d\n",j);
        }
    // printf("\nSum of even numer is %d",sum);5
}