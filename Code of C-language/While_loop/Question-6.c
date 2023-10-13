// Write a C program that takes a number as input from the user and determines whether it is a spy number of not, DEVELOP this by using while loop.

// A Spy number is a number where the sum of its digits is equal to its product of its digits.



// For Example : 

// 1124 is a spy number , because the sum of its digits is 1+1+2+4 = 8 and product of its digits is equal to 1*1*2*4 = 8..

#include<stdio.h>
int main() {
    
    int num,mul=1,sum=0,d=0,d1,digit;
    printf("Enter the numbers \n");
    scanf("%d",&num);
    while(num!=0)
        {
        sum+= num%10;
        mul*=num%10;
        d=(d*10)+num%10;
        num/=10;
    }
    d1=d;
    // printf("%d\n",d);
    while(d!=0){
            digit=d%10;
            printf("%d+",digit);
            d/=10;
        }
    
    printf("\b = %d\n",sum);
    
    while(d1!=0){
            digit=d1%10;
            printf("%d*",digit);
            d1/=10;
        }
    printf("\b= %d\n",mul);
    if(mul == sum)puts("A Spy number");
    else puts("A not Spy number");
    return 0;
}