// Develop a C program that calculates and prints the sum of the series 1 + 1/2! + 1/3! + 1/4!+1/5!....... up to N terms:

// Input as : 

// Enter the number of terms : 5

// Expected output :

// 1 + 1/2! + 1/3! + 1/4! + 1/5! = 1.7167

#include<stdio.h>
int main(){
    
    int n, i,f=1;
    float sum = 0.0;
    printf("Enter the value of n: ");
    scanf("%d", &n);
    printf("Series: ");
    for (i=1;i<=n;i++) {
        f=1;
            for(int a=i;a>0;a--)
        f*=a;
        sum+=1.0/f;
        
    }
    printf("\nSum of the first %d terms: %f\n",n,sum);
    return 0;
}