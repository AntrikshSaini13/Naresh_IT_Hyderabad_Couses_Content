// Write a C program to find the HCF (Highest Common Factor) of two numbers.

// Input 1st number for HCF: 24

// Input 2nd number for HCF: 28

// Expected Output :

// HCF of 24 and 28 is : 4

#include<stdio.h>
int main(){
    
    int a,b,i,gcd;
    printf("Enter the number \n");
    scanf("%d %d",&a,&b);
    for(i=1;i<=a && i<=b;i++){
        if(a%i == 0 && b%i == 0)gcd=i;
    }
    printf("GCD=%d",gcd);
    return 0;
}