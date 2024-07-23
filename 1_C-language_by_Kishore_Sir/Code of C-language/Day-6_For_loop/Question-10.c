// Write a C program to add all the digits present in a given number until it became a single digit. Develop it by using while loop.

// [if the number is 5678, sum of digit =5+6+7+8=26 , again sum of digit of the sum : 2+6=8] 

// Input as : 5678

// Ouput as : 8

#include<stdio.h>
int main(){
    int num,sum;
    printf("Enter the number");
    scanf("%d",&num);
        start :
        for(sum=0;num!=0;num/=10)
        {
            sum+=num%10;
            num=sum;
            if(sum > 9 || sum <-9)
            goto start;
    }
    printf("%d",sum);
}