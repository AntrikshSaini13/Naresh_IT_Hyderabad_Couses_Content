// Write a C program to check the given number is a prime number or not.

// Input as :

// Enter a number : 13

// Expected Output :

// 13 is a Prime Number.

#include<stdio.h>
int main(){
    int n, a, b, c;
    printf("Enter the number\n");
    scanf("%d",&n);
    
    for(a=2; a<=n ; a++){
        for(c=0,b=1;b<=a;b++){
            if(a%b==0)c++;
        }
    }
    if(c==2)
    printf("Prime Number");
    else
    printf("Not Prime Number");
    return 0;
}