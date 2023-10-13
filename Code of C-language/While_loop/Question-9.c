// Q-9  Write a C program to check the given number is a perfect number or not?

// If a sum of the multiples of the number excluding the given number is same as the original number then we can say that number is a perfect number.

// 6 multiples are 1,2,3,6 : sum of multiples = 1+2+3 = 6

// 6 is a perfect number.

// Ans ->

#include<stdio.h>
int main(){
    int num,i=1,sum=0;
    printf("Enter the number = ");
    scanf("%d",&num);
    while(i<num){
        if(num%i == 0)
        sum = sum + i;
        i++;
    }
    if(num == sum) printf("Perfect number");
    else printf("Not");
    return 0;
}